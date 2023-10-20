package com.alex.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *server
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: pingpong.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PongServiceGrpc {

  private PongServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "model.PongService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.alex.services.Ping,
      com.alex.services.Pong> getReceivePingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "receivePing",
      requestType = com.alex.services.Ping.class,
      responseType = com.alex.services.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.alex.services.Ping,
      com.alex.services.Pong> getReceivePingMethod() {
    io.grpc.MethodDescriptor<com.alex.services.Ping, com.alex.services.Pong> getReceivePingMethod;
    if ((getReceivePingMethod = PongServiceGrpc.getReceivePingMethod) == null) {
      synchronized (PongServiceGrpc.class) {
        if ((getReceivePingMethod = PongServiceGrpc.getReceivePingMethod) == null) {
          PongServiceGrpc.getReceivePingMethod = getReceivePingMethod =
              io.grpc.MethodDescriptor.<com.alex.services.Ping, com.alex.services.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "receivePing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alex.services.Ping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alex.services.Pong.getDefaultInstance()))
              .setSchemaDescriptor(new PongServiceMethodDescriptorSupplier("receivePing"))
              .build();
        }
      }
    }
    return getReceivePingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.alex.services.Pong> getTestServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testService",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.alex.services.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.alex.services.Pong> getTestServiceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.alex.services.Pong> getTestServiceMethod;
    if ((getTestServiceMethod = PongServiceGrpc.getTestServiceMethod) == null) {
      synchronized (PongServiceGrpc.class) {
        if ((getTestServiceMethod = PongServiceGrpc.getTestServiceMethod) == null) {
          PongServiceGrpc.getTestServiceMethod = getTestServiceMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.alex.services.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alex.services.Pong.getDefaultInstance()))
              .setSchemaDescriptor(new PongServiceMethodDescriptorSupplier("testService"))
              .build();
        }
      }
    }
    return getTestServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PongServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PongServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PongServiceStub>() {
        @java.lang.Override
        public PongServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PongServiceStub(channel, callOptions);
        }
      };
    return PongServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PongServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PongServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PongServiceBlockingStub>() {
        @java.lang.Override
        public PongServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PongServiceBlockingStub(channel, callOptions);
        }
      };
    return PongServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PongServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PongServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PongServiceFutureStub>() {
        @java.lang.Override
        public PongServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PongServiceFutureStub(channel, callOptions);
        }
      };
    return PongServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *server
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void receivePing(com.alex.services.Ping request,
        io.grpc.stub.StreamObserver<com.alex.services.Pong> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceivePingMethod(), responseObserver);
    }

    /**
     */
    default void testService(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.alex.services.Pong> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PongService.
   * <pre>
   *server
   * </pre>
   */
  public static abstract class PongServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PongServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PongService.
   * <pre>
   *server
   * </pre>
   */
  public static final class PongServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PongServiceStub> {
    private PongServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PongServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PongServiceStub(channel, callOptions);
    }

    /**
     */
    public void receivePing(com.alex.services.Ping request,
        io.grpc.stub.StreamObserver<com.alex.services.Pong> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceivePingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testService(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.alex.services.Pong> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PongService.
   * <pre>
   *server
   * </pre>
   */
  public static final class PongServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PongServiceBlockingStub> {
    private PongServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PongServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PongServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alex.services.Pong receivePing(com.alex.services.Ping request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceivePingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alex.services.Pong testService(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PongService.
   * <pre>
   *server
   * </pre>
   */
  public static final class PongServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PongServiceFutureStub> {
    private PongServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PongServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PongServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alex.services.Pong> receivePing(
        com.alex.services.Ping request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceivePingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alex.services.Pong> testService(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECEIVE_PING = 0;
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
        case METHODID_RECEIVE_PING:
          serviceImpl.receivePing((com.alex.services.Ping) request,
              (io.grpc.stub.StreamObserver<com.alex.services.Pong>) responseObserver);
          break;
        case METHODID_TEST_SERVICE:
          serviceImpl.testService((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.alex.services.Pong>) responseObserver);
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
          getReceivePingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.alex.services.Ping,
              com.alex.services.Pong>(
                service, METHODID_RECEIVE_PING)))
        .addMethod(
          getTestServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.alex.services.Pong>(
                service, METHODID_TEST_SERVICE)))
        .build();
  }

  private static abstract class PongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PongServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alex.services.Pingpong.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PongService");
    }
  }

  private static final class PongServiceFileDescriptorSupplier
      extends PongServiceBaseDescriptorSupplier {
    PongServiceFileDescriptorSupplier() {}
  }

  private static final class PongServiceMethodDescriptorSupplier
      extends PongServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PongServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PongServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PongServiceFileDescriptorSupplier())
              .addMethod(getReceivePingMethod())
              .addMethod(getTestServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
