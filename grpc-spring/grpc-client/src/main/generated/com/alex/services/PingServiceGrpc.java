package com.alex.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *client
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: pingpong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PingServiceGrpc {

  private PingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.PingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.alex.services.Pong> getSendPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendPing",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.alex.services.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.alex.services.Pong> getSendPingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.alex.services.Pong> getSendPingMethod;
    if ((getSendPingMethod = PingServiceGrpc.getSendPingMethod) == null) {
      synchronized (PingServiceGrpc.class) {
        if ((getSendPingMethod = PingServiceGrpc.getSendPingMethod) == null) {
          PingServiceGrpc.getSendPingMethod = getSendPingMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.alex.services.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendPing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alex.services.Pong.getDefaultInstance()))
              .setSchemaDescriptor(new PingServiceMethodDescriptorSupplier("sendPing"))
              .build();
        }
      }
    }
    return getSendPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.alex.services.Ping> getTestServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testService",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.alex.services.Ping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.alex.services.Ping> getTestServiceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.alex.services.Ping> getTestServiceMethod;
    if ((getTestServiceMethod = PingServiceGrpc.getTestServiceMethod) == null) {
      synchronized (PingServiceGrpc.class) {
        if ((getTestServiceMethod = PingServiceGrpc.getTestServiceMethod) == null) {
          PingServiceGrpc.getTestServiceMethod = getTestServiceMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.alex.services.Ping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alex.services.Ping.getDefaultInstance()))
              .setSchemaDescriptor(new PingServiceMethodDescriptorSupplier("testService"))
              .build();
        }
      }
    }
    return getTestServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceStub>() {
        @java.lang.Override
        public PingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceStub(channel, callOptions);
        }
      };
    return PingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceBlockingStub>() {
        @java.lang.Override
        public PingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceBlockingStub(channel, callOptions);
        }
      };
    return PingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PingServiceFutureStub>() {
        @java.lang.Override
        public PingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PingServiceFutureStub(channel, callOptions);
        }
      };
    return PingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *client
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void sendPing(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.alex.services.Pong> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPingMethod(), responseObserver);
    }

    /**
     */
    default void testService(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.alex.services.Ping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PingService.
   * <pre>
   *client
   * </pre>
   */
  public static abstract class PingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PingService.
   * <pre>
   *client
   * </pre>
   */
  public static final class PingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PingServiceStub> {
    private PingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendPing(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.alex.services.Pong> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testService(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.alex.services.Ping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PingService.
   * <pre>
   *client
   * </pre>
   */
  public static final class PingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PingServiceBlockingStub> {
    private PingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alex.services.Pong sendPing(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alex.services.Ping testService(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PingService.
   * <pre>
   *client
   * </pre>
   */
  public static final class PingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PingServiceFutureStub> {
    private PingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alex.services.Pong> sendPing(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alex.services.Ping> testService(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_PING = 0;
  private static final int METHODID_TEST_SERVICE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_PING:
          serviceImpl.sendPing((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.alex.services.Pong>) responseObserver);
          break;
        case METHODID_TEST_SERVICE:
          serviceImpl.testService((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.alex.services.Ping>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.alex.services.Pong>(
                service, METHODID_SEND_PING)))
        .addMethod(
          getTestServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.alex.services.Ping>(
                service, METHODID_TEST_SERVICE)))
        .build();
  }

  private static abstract class PingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alex.services.Pingpong.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PingService");
    }
  }

  private static final class PingServiceFileDescriptorSupplier
      extends PingServiceBaseDescriptorSupplier {
    PingServiceFileDescriptorSupplier() {}
  }

  private static final class PingServiceMethodDescriptorSupplier
      extends PingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PingServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PingServiceFileDescriptorSupplier())
              .addMethod(getSendPingMethod())
              .addMethod(getTestServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
