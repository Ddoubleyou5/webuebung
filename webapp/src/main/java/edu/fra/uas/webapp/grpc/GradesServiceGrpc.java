package edu.fra.uas.webapp.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: GradingService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GradesServiceGrpc {

  private GradesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "edu.fra.uas.webapp.grpc.GradesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.fra.uas.webapp.grpc.GradingService.GradesRequest,
      edu.fra.uas.webapp.grpc.GradingService.GradesResponse> getListGradesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listGrades",
      requestType = edu.fra.uas.webapp.grpc.GradingService.GradesRequest.class,
      responseType = edu.fra.uas.webapp.grpc.GradingService.GradesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.fra.uas.webapp.grpc.GradingService.GradesRequest,
      edu.fra.uas.webapp.grpc.GradingService.GradesResponse> getListGradesMethod() {
    io.grpc.MethodDescriptor<edu.fra.uas.webapp.grpc.GradingService.GradesRequest, edu.fra.uas.webapp.grpc.GradingService.GradesResponse> getListGradesMethod;
    if ((getListGradesMethod = GradesServiceGrpc.getListGradesMethod) == null) {
      synchronized (GradesServiceGrpc.class) {
        if ((getListGradesMethod = GradesServiceGrpc.getListGradesMethod) == null) {
          GradesServiceGrpc.getListGradesMethod = getListGradesMethod =
              io.grpc.MethodDescriptor.<edu.fra.uas.webapp.grpc.GradingService.GradesRequest, edu.fra.uas.webapp.grpc.GradingService.GradesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listGrades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.webapp.grpc.GradingService.GradesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.fra.uas.webapp.grpc.GradingService.GradesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GradesServiceMethodDescriptorSupplier("listGrades"))
              .build();
        }
      }
    }
    return getListGradesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.DoubleValue> getFindGradeByIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findGradeByIndex",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.google.protobuf.DoubleValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.DoubleValue> getFindGradeByIndexMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.google.protobuf.DoubleValue> getFindGradeByIndexMethod;
    if ((getFindGradeByIndexMethod = GradesServiceGrpc.getFindGradeByIndexMethod) == null) {
      synchronized (GradesServiceGrpc.class) {
        if ((getFindGradeByIndexMethod = GradesServiceGrpc.getFindGradeByIndexMethod) == null) {
          GradesServiceGrpc.getFindGradeByIndexMethod = getFindGradeByIndexMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.DoubleValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findGradeByIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.DoubleValue.getDefaultInstance()))
              .setSchemaDescriptor(new GradesServiceMethodDescriptorSupplier("findGradeByIndex"))
              .build();
        }
      }
    }
    return getFindGradeByIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.DoubleValue,
      com.google.protobuf.BoolValue> getAddGradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addGrade",
      requestType = com.google.protobuf.DoubleValue.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.DoubleValue,
      com.google.protobuf.BoolValue> getAddGradeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.DoubleValue, com.google.protobuf.BoolValue> getAddGradeMethod;
    if ((getAddGradeMethod = GradesServiceGrpc.getAddGradeMethod) == null) {
      synchronized (GradesServiceGrpc.class) {
        if ((getAddGradeMethod = GradesServiceGrpc.getAddGradeMethod) == null) {
          GradesServiceGrpc.getAddGradeMethod = getAddGradeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.DoubleValue, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addGrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.DoubleValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new GradesServiceMethodDescriptorSupplier("addGrade"))
              .build();
        }
      }
    }
    return getAddGradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getUpdateGradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateGrade",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getUpdateGradeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue> getUpdateGradeMethod;
    if ((getUpdateGradeMethod = GradesServiceGrpc.getUpdateGradeMethod) == null) {
      synchronized (GradesServiceGrpc.class) {
        if ((getUpdateGradeMethod = GradesServiceGrpc.getUpdateGradeMethod) == null) {
          GradesServiceGrpc.getUpdateGradeMethod = getUpdateGradeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateGrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new GradesServiceMethodDescriptorSupplier("updateGrade"))
              .build();
        }
      }
    }
    return getUpdateGradeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getDeleteGradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteGrade",
      requestType = com.google.protobuf.Int64Value.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> getDeleteGradeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue> getDeleteGradeMethod;
    if ((getDeleteGradeMethod = GradesServiceGrpc.getDeleteGradeMethod) == null) {
      synchronized (GradesServiceGrpc.class) {
        if ((getDeleteGradeMethod = GradesServiceGrpc.getDeleteGradeMethod) == null) {
          GradesServiceGrpc.getDeleteGradeMethod = getDeleteGradeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteGrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int64Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new GradesServiceMethodDescriptorSupplier("deleteGrade"))
              .build();
        }
      }
    }
    return getDeleteGradeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GradesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GradesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GradesServiceStub>() {
        @java.lang.Override
        public GradesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GradesServiceStub(channel, callOptions);
        }
      };
    return GradesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GradesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GradesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GradesServiceBlockingStub>() {
        @java.lang.Override
        public GradesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GradesServiceBlockingStub(channel, callOptions);
        }
      };
    return GradesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GradesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GradesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GradesServiceFutureStub>() {
        @java.lang.Override
        public GradesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GradesServiceFutureStub(channel, callOptions);
        }
      };
    return GradesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * list all Grades
     * </pre>
     */
    default void listGrades(edu.fra.uas.webapp.grpc.GradingService.GradesRequest request,
        io.grpc.stub.StreamObserver<edu.fra.uas.webapp.grpc.GradingService.GradesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListGradesMethod(), responseObserver);
    }

    /**
     * <pre>
     * finds a grade by index
     * </pre>
     */
    default void findGradeByIndex(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.DoubleValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindGradeByIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     * add a grade
     * </pre>
     */
    default void addGrade(com.google.protobuf.DoubleValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddGradeMethod(), responseObserver);
    }

    /**
     * <pre>
     * updates a grade
     * </pre>
     */
    default void updateGrade(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateGradeMethod(), responseObserver);
    }

    /**
     * <pre>
     * deletes a grade
     * </pre>
     */
    default void deleteGrade(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteGradeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GradesService.
   */
  public static abstract class GradesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GradesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GradesService.
   */
  public static final class GradesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GradesServiceStub> {
    private GradesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GradesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * list all Grades
     * </pre>
     */
    public void listGrades(edu.fra.uas.webapp.grpc.GradingService.GradesRequest request,
        io.grpc.stub.StreamObserver<edu.fra.uas.webapp.grpc.GradingService.GradesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListGradesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * finds a grade by index
     * </pre>
     */
    public void findGradeByIndex(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.DoubleValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindGradeByIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * add a grade
     * </pre>
     */
    public void addGrade(com.google.protobuf.DoubleValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddGradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * updates a grade
     * </pre>
     */
    public void updateGrade(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateGradeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * deletes a grade
     * </pre>
     */
    public void deleteGrade(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteGradeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GradesService.
   */
  public static final class GradesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GradesServiceBlockingStub> {
    private GradesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GradesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * list all Grades
     * </pre>
     */
    public edu.fra.uas.webapp.grpc.GradingService.GradesResponse listGrades(edu.fra.uas.webapp.grpc.GradingService.GradesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListGradesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * finds a grade by index
     * </pre>
     */
    public com.google.protobuf.DoubleValue findGradeByIndex(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindGradeByIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * add a grade
     * </pre>
     */
    public com.google.protobuf.BoolValue addGrade(com.google.protobuf.DoubleValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddGradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * updates a grade
     * </pre>
     */
    public com.google.protobuf.BoolValue updateGrade(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateGradeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * deletes a grade
     * </pre>
     */
    public com.google.protobuf.BoolValue deleteGrade(com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteGradeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GradesService.
   */
  public static final class GradesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GradesServiceFutureStub> {
    private GradesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GradesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GradesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * list all Grades
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.fra.uas.webapp.grpc.GradingService.GradesResponse> listGrades(
        edu.fra.uas.webapp.grpc.GradingService.GradesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListGradesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * finds a grade by index
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.DoubleValue> findGradeByIndex(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindGradeByIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * add a grade
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> addGrade(
        com.google.protobuf.DoubleValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddGradeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * updates a grade
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> updateGrade(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateGradeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * deletes a grade
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> deleteGrade(
        com.google.protobuf.Int64Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteGradeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_GRADES = 0;
  private static final int METHODID_FIND_GRADE_BY_INDEX = 1;
  private static final int METHODID_ADD_GRADE = 2;
  private static final int METHODID_UPDATE_GRADE = 3;
  private static final int METHODID_DELETE_GRADE = 4;

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
        case METHODID_LIST_GRADES:
          serviceImpl.listGrades((edu.fra.uas.webapp.grpc.GradingService.GradesRequest) request,
              (io.grpc.stub.StreamObserver<edu.fra.uas.webapp.grpc.GradingService.GradesResponse>) responseObserver);
          break;
        case METHODID_FIND_GRADE_BY_INDEX:
          serviceImpl.findGradeByIndex((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.DoubleValue>) responseObserver);
          break;
        case METHODID_ADD_GRADE:
          serviceImpl.addGrade((com.google.protobuf.DoubleValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_UPDATE_GRADE:
          serviceImpl.updateGrade((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_DELETE_GRADE:
          serviceImpl.deleteGrade((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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
          getListGradesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.fra.uas.webapp.grpc.GradingService.GradesRequest,
              edu.fra.uas.webapp.grpc.GradingService.GradesResponse>(
                service, METHODID_LIST_GRADES)))
        .addMethod(
          getFindGradeByIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              com.google.protobuf.DoubleValue>(
                service, METHODID_FIND_GRADE_BY_INDEX)))
        .addMethod(
          getAddGradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.DoubleValue,
              com.google.protobuf.BoolValue>(
                service, METHODID_ADD_GRADE)))
        .addMethod(
          getUpdateGradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              com.google.protobuf.BoolValue>(
                service, METHODID_UPDATE_GRADE)))
        .addMethod(
          getDeleteGradeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              com.google.protobuf.BoolValue>(
                service, METHODID_DELETE_GRADE)))
        .build();
  }

  private static abstract class GradesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GradesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.fra.uas.webapp.grpc.GradingService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GradesService");
    }
  }

  private static final class GradesServiceFileDescriptorSupplier
      extends GradesServiceBaseDescriptorSupplier {
    GradesServiceFileDescriptorSupplier() {}
  }

  private static final class GradesServiceMethodDescriptorSupplier
      extends GradesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GradesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GradesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GradesServiceFileDescriptorSupplier())
              .addMethod(getListGradesMethod())
              .addMethod(getFindGradeByIndexMethod())
              .addMethod(getAddGradeMethod())
              .addMethod(getUpdateGradeMethod())
              .addMethod(getDeleteGradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
