package org.alex.service;


import com.alex.services.Ping;
import com.alex.services.Pong;
import com.alex.services.PongServiceGrpc;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@GrpcService
public class PongService extends PongServiceGrpc.PongServiceImplBase {

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void receivePing(Ping request, StreamObserver<Pong> responseObserver) {
        int count = counter.incrementAndGet();
        Pong pong = Pong.newBuilder().setId(count).setDescription("pong-" + count).build();
        log.info("Received Ping: id: {}, description: {}", request.getId(), request.getDescription());
        responseObserver.onNext(pong);
        responseObserver.onCompleted();
        log.info("Send Pong: id: {}, description: {}", pong.getId(), pong.getDescription());
    }

    @Override
    public void testService(StringValue request, StreamObserver<Pong> responseObserver) {
        int count = counter.incrementAndGet();
        log.info("Test: {}", count);
        Pong pong = Pong.newBuilder().setId(count).setDescription("test-"+count) .build();
        responseObserver.onNext(pong);
        responseObserver.onCompleted();
    }
}