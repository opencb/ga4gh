package ga4gh;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: ga4gh/variant_service.proto")
public class VariantServiceGrpc {

  private VariantServiceGrpc() {}

  public static final String SERVICE_NAME = "ga4gh.VariantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest,
      ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse> METHOD_SEARCH_VARIANT_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.VariantService", "SearchVariantSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.VariantServiceOuterClass.GetVariantSetRequest,
      ga4gh.Variants.VariantSet> METHOD_GET_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.VariantService", "GetVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.GetVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.Variants.VariantSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.VariantServiceOuterClass.SearchVariantsRequest,
      ga4gh.VariantServiceOuterClass.SearchVariantsResponse> METHOD_SEARCH_VARIANTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.VariantService", "SearchVariants"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.SearchVariantsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.SearchVariantsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.VariantServiceOuterClass.GetVariantRequest,
      ga4gh.Variants.Variant> METHOD_GET_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.VariantService", "GetVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.GetVariantRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.Variants.Variant.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.VariantServiceOuterClass.SearchCallSetsRequest,
      ga4gh.VariantServiceOuterClass.SearchCallSetsResponse> METHOD_SEARCH_CALL_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.VariantService", "SearchCallSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.SearchCallSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.SearchCallSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.VariantServiceOuterClass.GetCallSetRequest,
      ga4gh.Variants.CallSet> METHOD_GET_CALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.VariantService", "GetCallSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.VariantServiceOuterClass.GetCallSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.Variants.CallSet.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VariantServiceStub newStub(io.grpc.Channel channel) {
    return new VariantServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VariantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VariantServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static VariantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VariantServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface VariantService {

    /**
     * <pre>
     * Gets a list of `VariantSet` matching the search criteria.
     * `POST /variantsets/search` must accept a JSON version of
     * `SearchVariantSetsRequest` as the post body and will return a JSON version
     * of `SearchVariantSetsResponse`.
     * </pre>
     */
    public void searchVariantSets(ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `VariantSet` by ID.
     * `GET /variantsets/{variant_set_id}` will return a JSON version of
     * `VariantSet`.
     * </pre>
     */
    public void getVariantSet(ga4gh.VariantServiceOuterClass.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.VariantSet> responseObserver);

    /**
     * <pre>
     * Gets a list of `Variant` matching the search criteria.
     * `POST /variants/search` must accept a JSON version of
     * `SearchVariantsRequest` as the post body and will return a JSON version of
     * `SearchVariantsResponse`.
     * </pre>
     */
    public void searchVariants(ga4gh.VariantServiceOuterClass.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `Variant` by ID.
     * `GET /variants/{id}` will return a JSON version of `Variant`.
     * </pre>
     */
    public void getVariant(ga4gh.VariantServiceOuterClass.GetVariantRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.Variant> responseObserver);

    /**
     * <pre>
     * Gets a list of call sets matching the search criteria.
     * `POST /callsets/search` must accept a JSON version of
     * `SearchCallSetsRequest` as the post body and will return a JSON version of
     * `SearchCallSetsResponse`.
     * </pre>
     */
    public void searchCallSets(ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchCallSetsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `CallSet` by ID.
     * `GET /callsets/{id}` will return a JSON version of `CallSet`.
     * </pre>
     */
    public void getCallSet(ga4gh.VariantServiceOuterClass.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.CallSet> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class VariantServiceImplBase implements VariantService, io.grpc.BindableService {

    @java.lang.Override
    public void searchVariantSets(ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_VARIANT_SETS, responseObserver);
    }

    @java.lang.Override
    public void getVariantSet(ga4gh.VariantServiceOuterClass.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.VariantSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VARIANT_SET, responseObserver);
    }

    @java.lang.Override
    public void searchVariants(ga4gh.VariantServiceOuterClass.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_VARIANTS, responseObserver);
    }

    @java.lang.Override
    public void getVariant(ga4gh.VariantServiceOuterClass.GetVariantRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.Variant> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VARIANT, responseObserver);
    }

    @java.lang.Override
    public void searchCallSets(ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchCallSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_CALL_SETS, responseObserver);
    }

    @java.lang.Override
    public void getCallSet(ga4gh.VariantServiceOuterClass.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.CallSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CALL_SET, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return VariantServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface VariantServiceBlockingClient {

    /**
     * <pre>
     * Gets a list of `VariantSet` matching the search criteria.
     * `POST /variantsets/search` must accept a JSON version of
     * `SearchVariantSetsRequest` as the post body and will return a JSON version
     * of `SearchVariantSetsResponse`.
     * </pre>
     */
    public ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse searchVariantSets(ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request);

    /**
     * <pre>
     * Gets a `VariantSet` by ID.
     * `GET /variantsets/{variant_set_id}` will return a JSON version of
     * `VariantSet`.
     * </pre>
     */
    public ga4gh.Variants.VariantSet getVariantSet(ga4gh.VariantServiceOuterClass.GetVariantSetRequest request);

    /**
     * <pre>
     * Gets a list of `Variant` matching the search criteria.
     * `POST /variants/search` must accept a JSON version of
     * `SearchVariantsRequest` as the post body and will return a JSON version of
     * `SearchVariantsResponse`.
     * </pre>
     */
    public ga4gh.VariantServiceOuterClass.SearchVariantsResponse searchVariants(ga4gh.VariantServiceOuterClass.SearchVariantsRequest request);

    /**
     * <pre>
     * Gets a `Variant` by ID.
     * `GET /variants/{id}` will return a JSON version of `Variant`.
     * </pre>
     */
    public ga4gh.Variants.Variant getVariant(ga4gh.VariantServiceOuterClass.GetVariantRequest request);

    /**
     * <pre>
     * Gets a list of call sets matching the search criteria.
     * `POST /callsets/search` must accept a JSON version of
     * `SearchCallSetsRequest` as the post body and will return a JSON version of
     * `SearchCallSetsResponse`.
     * </pre>
     */
    public ga4gh.VariantServiceOuterClass.SearchCallSetsResponse searchCallSets(ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request);

    /**
     * <pre>
     * Gets a `CallSet` by ID.
     * `GET /callsets/{id}` will return a JSON version of `CallSet`.
     * </pre>
     */
    public ga4gh.Variants.CallSet getCallSet(ga4gh.VariantServiceOuterClass.GetCallSetRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface VariantServiceFutureClient {

    /**
     * <pre>
     * Gets a list of `VariantSet` matching the search criteria.
     * `POST /variantsets/search` must accept a JSON version of
     * `SearchVariantSetsRequest` as the post body and will return a JSON version
     * of `SearchVariantSetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse> searchVariantSets(
        ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request);

    /**
     * <pre>
     * Gets a `VariantSet` by ID.
     * `GET /variantsets/{variant_set_id}` will return a JSON version of
     * `VariantSet`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Variants.VariantSet> getVariantSet(
        ga4gh.VariantServiceOuterClass.GetVariantSetRequest request);

    /**
     * <pre>
     * Gets a list of `Variant` matching the search criteria.
     * `POST /variants/search` must accept a JSON version of
     * `SearchVariantsRequest` as the post body and will return a JSON version of
     * `SearchVariantsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.VariantServiceOuterClass.SearchVariantsResponse> searchVariants(
        ga4gh.VariantServiceOuterClass.SearchVariantsRequest request);

    /**
     * <pre>
     * Gets a `Variant` by ID.
     * `GET /variants/{id}` will return a JSON version of `Variant`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Variants.Variant> getVariant(
        ga4gh.VariantServiceOuterClass.GetVariantRequest request);

    /**
     * <pre>
     * Gets a list of call sets matching the search criteria.
     * `POST /callsets/search` must accept a JSON version of
     * `SearchCallSetsRequest` as the post body and will return a JSON version of
     * `SearchCallSetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.VariantServiceOuterClass.SearchCallSetsResponse> searchCallSets(
        ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request);

    /**
     * <pre>
     * Gets a `CallSet` by ID.
     * `GET /callsets/{id}` will return a JSON version of `CallSet`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Variants.CallSet> getCallSet(
        ga4gh.VariantServiceOuterClass.GetCallSetRequest request);
  }

  public static class VariantServiceStub extends io.grpc.stub.AbstractStub<VariantServiceStub>
      implements VariantService {
    private VariantServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VariantServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VariantServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void searchVariantSets(ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getVariantSet(ga4gh.VariantServiceOuterClass.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.VariantSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchVariants(ga4gh.VariantServiceOuterClass.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getVariant(ga4gh.VariantServiceOuterClass.GetVariantRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.Variant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchCallSets(ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchCallSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getCallSet(ga4gh.VariantServiceOuterClass.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Variants.CallSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CALL_SET, getCallOptions()), request, responseObserver);
    }
  }

  public static class VariantServiceBlockingStub extends io.grpc.stub.AbstractStub<VariantServiceBlockingStub>
      implements VariantServiceBlockingClient {
    private VariantServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VariantServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VariantServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse searchVariantSets(ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_VARIANT_SETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.Variants.VariantSet getVariantSet(ga4gh.VariantServiceOuterClass.GetVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VARIANT_SET, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.VariantServiceOuterClass.SearchVariantsResponse searchVariants(ga4gh.VariantServiceOuterClass.SearchVariantsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_VARIANTS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.Variants.Variant getVariant(ga4gh.VariantServiceOuterClass.GetVariantRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VARIANT, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.VariantServiceOuterClass.SearchCallSetsResponse searchCallSets(ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_CALL_SETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.Variants.CallSet getCallSet(ga4gh.VariantServiceOuterClass.GetCallSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CALL_SET, getCallOptions(), request);
    }
  }

  public static class VariantServiceFutureStub extends io.grpc.stub.AbstractStub<VariantServiceFutureStub>
      implements VariantServiceFutureClient {
    private VariantServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VariantServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VariantServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse> searchVariantSets(
        ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Variants.VariantSet> getVariantSet(
        ga4gh.VariantServiceOuterClass.GetVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.VariantServiceOuterClass.SearchVariantsResponse> searchVariants(
        ga4gh.VariantServiceOuterClass.SearchVariantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Variants.Variant> getVariant(
        ga4gh.VariantServiceOuterClass.GetVariantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.VariantServiceOuterClass.SearchCallSetsResponse> searchCallSets(
        ga4gh.VariantServiceOuterClass.SearchCallSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Variants.CallSet> getCallSet(
        ga4gh.VariantServiceOuterClass.GetCallSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CALL_SET, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractVariantService extends VariantServiceImplBase {}

  private static final int METHODID_SEARCH_VARIANT_SETS = 0;
  private static final int METHODID_GET_VARIANT_SET = 1;
  private static final int METHODID_SEARCH_VARIANTS = 2;
  private static final int METHODID_GET_VARIANT = 3;
  private static final int METHODID_SEARCH_CALL_SETS = 4;
  private static final int METHODID_GET_CALL_SET = 5;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VariantService serviceImpl;
    private final int methodId;

    public MethodHandlers(VariantService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_VARIANT_SETS:
          serviceImpl.searchVariantSets((ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse>) responseObserver);
          break;
        case METHODID_GET_VARIANT_SET:
          serviceImpl.getVariantSet((ga4gh.VariantServiceOuterClass.GetVariantSetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.Variants.VariantSet>) responseObserver);
          break;
        case METHODID_SEARCH_VARIANTS:
          serviceImpl.searchVariants((ga4gh.VariantServiceOuterClass.SearchVariantsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchVariantsResponse>) responseObserver);
          break;
        case METHODID_GET_VARIANT:
          serviceImpl.getVariant((ga4gh.VariantServiceOuterClass.GetVariantRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.Variants.Variant>) responseObserver);
          break;
        case METHODID_SEARCH_CALL_SETS:
          serviceImpl.searchCallSets((ga4gh.VariantServiceOuterClass.SearchCallSetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.VariantServiceOuterClass.SearchCallSetsResponse>) responseObserver);
          break;
        case METHODID_GET_CALL_SET:
          serviceImpl.getCallSet((ga4gh.VariantServiceOuterClass.GetCallSetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.Variants.CallSet>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SEARCH_VARIANT_SETS,
        METHOD_GET_VARIANT_SET,
        METHOD_SEARCH_VARIANTS,
        METHOD_GET_VARIANT,
        METHOD_SEARCH_CALL_SETS,
        METHOD_GET_CALL_SET);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final VariantService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SEARCH_VARIANT_SETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.VariantServiceOuterClass.SearchVariantSetsRequest,
              ga4gh.VariantServiceOuterClass.SearchVariantSetsResponse>(
                serviceImpl, METHODID_SEARCH_VARIANT_SETS)))
        .addMethod(
          METHOD_GET_VARIANT_SET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.VariantServiceOuterClass.GetVariantSetRequest,
              ga4gh.Variants.VariantSet>(
                serviceImpl, METHODID_GET_VARIANT_SET)))
        .addMethod(
          METHOD_SEARCH_VARIANTS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.VariantServiceOuterClass.SearchVariantsRequest,
              ga4gh.VariantServiceOuterClass.SearchVariantsResponse>(
                serviceImpl, METHODID_SEARCH_VARIANTS)))
        .addMethod(
          METHOD_GET_VARIANT,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.VariantServiceOuterClass.GetVariantRequest,
              ga4gh.Variants.Variant>(
                serviceImpl, METHODID_GET_VARIANT)))
        .addMethod(
          METHOD_SEARCH_CALL_SETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.VariantServiceOuterClass.SearchCallSetsRequest,
              ga4gh.VariantServiceOuterClass.SearchCallSetsResponse>(
                serviceImpl, METHODID_SEARCH_CALL_SETS)))
        .addMethod(
          METHOD_GET_CALL_SET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.VariantServiceOuterClass.GetCallSetRequest,
              ga4gh.Variants.CallSet>(
                serviceImpl, METHODID_GET_CALL_SET)))
        .build();
  }
}
