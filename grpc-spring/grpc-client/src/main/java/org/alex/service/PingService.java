package org.alex.service;

import com.alex.services.Ping;
import com.alex.services.PingServiceGrpc;
import com.alex.services.Pong;
import com.alex.services.PongServiceGrpc;
import com.google.protobuf.Empty;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.concurrent.atomic.AtomicInteger;

@GrpcService
@Slf4j
public class PingService extends PingServiceGrpc.PingServiceImplBase {

    private final AtomicInteger counter = new AtomicInteger(0);

    @GrpcClient("grpc-server")
    protected PongServiceGrpc.PongServiceBlockingStub pongService;

    @Override
    public void sendPing(Empty empty, StreamObserver<Pong> responseObserver) {
        log.info("Start Ping process");
        int count = counter.incrementAndGet();
        Ping ping = Ping.newBuilder().setId(count).setDescription("ping-" + count).build();
        log.info("Send Ping: id: {}, description: {}", ping.getId(), ping.getDescription());
        Pong pong = pongService.receivePing(ping);

        log.info("Received Pong: id: {}, description: {}", pong.getId(), pong.getDescription());
        responseObserver.onNext(pong);
        responseObserver.onCompleted();
    }

    @Override
    public void testService(StringValue request, StreamObserver<Ping> responseObserver) {
        int count = counter.incrementAndGet();
        log.info("Test: {}", count);
        Ping ping = Ping.newBuilder().setId(count).setDescription("test-" + count).build();
        responseObserver.onNext(ping);
        responseObserver.onCompleted();
    }
}