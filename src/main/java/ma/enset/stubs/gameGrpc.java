package ma.enset.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: game.proto")
public final class gameGrpc {

  private gameGrpc() {}

  public static final String SERVICE_NAME = "game";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Game.tentative,
      ma.enset.stubs.Game.respMsg> getRequestResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestResponse",
      requestType = ma.enset.stubs.Game.tentative.class,
      responseType = ma.enset.stubs.Game.respMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Game.tentative,
      ma.enset.stubs.Game.respMsg> getRequestResponseMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Game.tentative, ma.enset.stubs.Game.respMsg> getRequestResponseMethod;
    if ((getRequestResponseMethod = gameGrpc.getRequestResponseMethod) == null) {
      synchronized (gameGrpc.class) {
        if ((getRequestResponseMethod = gameGrpc.getRequestResponseMethod) == null) {
          gameGrpc.getRequestResponseMethod = getRequestResponseMethod = 
              io.grpc.MethodDescriptor.<ma.enset.stubs.Game.tentative, ma.enset.stubs.Game.respMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "game", "requestResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Game.tentative.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Game.respMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new gameMethodDescriptorSupplier("requestResponse"))
                  .build();
          }
        }
     }
     return getRequestResponseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gameStub newStub(io.grpc.Channel channel) {
    return new gameStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gameBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gameBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gameFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gameFutureStub(channel);
  }

  /**
   */
  public static abstract class gameImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Game.tentative> requestResponse(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Game.respMsg> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestResponseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestResponseMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Game.tentative,
                ma.enset.stubs.Game.respMsg>(
                  this, METHODID_REQUEST_RESPONSE)))
          .build();
    }
  }

  /**
   */
  public static final class gameStub extends io.grpc.stub.AbstractStub<gameStub> {
    private gameStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Game.tentative> requestResponse(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Game.respMsg> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRequestResponseMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class gameBlockingStub extends io.grpc.stub.AbstractStub<gameBlockingStub> {
    private gameBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class gameFutureStub extends io.grpc.stub.AbstractStub<gameFutureStub> {
    private gameFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gameFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gameFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gameFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REQUEST_RESPONSE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gameImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gameImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_RESPONSE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestResponse(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Game.respMsg>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class gameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gameBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Game.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("game");
    }
  }

  private static final class gameFileDescriptorSupplier
      extends gameBaseDescriptorSupplier {
    gameFileDescriptorSupplier() {}
  }

  private static final class gameMethodDescriptorSupplier
      extends gameBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gameMethodDescriptorSupplier(String methodName) {
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
      synchronized (gameGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gameFileDescriptorSupplier())
              .addMethod(getRequestResponseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
