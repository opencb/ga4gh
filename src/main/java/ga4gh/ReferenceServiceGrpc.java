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
    comments = "Source: ga4gh/reference_service.proto")
public class ReferenceServiceGrpc {

  private ReferenceServiceGrpc() {}

  public static final String SERVICE_NAME = "ga4gh.ReferenceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest,
      ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse> METHOD_SEARCH_REFERENCE_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReferenceService", "SearchReferenceSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest,
      ga4gh.References.ReferenceSet> METHOD_GET_REFERENCE_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReferenceService", "GetReferenceSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.References.ReferenceSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest,
      ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse> METHOD_SEARCH_REFERENCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReferenceService", "SearchReferences"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReferenceServiceOuterClass.GetReferenceRequest,
      ga4gh.References.Reference> METHOD_GET_REFERENCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReferenceService", "GetReference"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.GetReferenceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.References.Reference.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest,
      ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse> METHOD_LIST_REFERENCE_BASES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReferenceService", "ListReferenceBases"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReferenceServiceStub newStub(io.grpc.Channel channel) {
    return new ReferenceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReferenceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ReferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReferenceServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface ReferenceService {

    /**
     * <pre>
     * Gets a list of `ReferenceSet` matching the search criteria.
     * `POST /referencesets/search` must accept a JSON version of
     * `SearchReferenceSetsRequest` as the post body and will return a JSON
     * version of `SearchReferenceSetsResponse`.
     * </pre>
     */
    public void searchReferenceSets(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `ReferenceSet` by ID.
     * `GET /referencesets/{reference_set_id}` will return a JSON version of
     * `ReferenceSet`.
     * </pre>
     */
    public void getReferenceSet(ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.References.ReferenceSet> responseObserver);

    /**
     * <pre>
     * Gets a list of `Reference` matching the search criteria.
     * `POST /references/search` must accept a JSON version of
     * `SearchReferencesRequest` as the post body and will return a JSON
     * version of `SearchReferencesResponse`.
     * </pre>
     */
    public void searchReferences(ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse> responseObserver);

    /**
     * <pre>
     * Gets a `Reference` by ID.
     * `GET /references/{reference_id}` will return a JSON version of
     * `Reference`.
     * </pre>
     */
    public void getReference(ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<ga4gh.References.Reference> responseObserver);

    /**
     * <pre>
     * Lists `Reference` bases by ID and optional range.
     * `GET /references/{id}/bases` will return a JSON version of
     * `ListReferenceBasesResponse`.
     * </pre>
     */
    public void listReferenceBases(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ReferenceServiceImplBase implements ReferenceService, io.grpc.BindableService {

    @java.lang.Override
    public void searchReferenceSets(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_REFERENCE_SETS, responseObserver);
    }

    @java.lang.Override
    public void getReferenceSet(ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.References.ReferenceSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REFERENCE_SET, responseObserver);
    }

    @java.lang.Override
    public void searchReferences(ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_REFERENCES, responseObserver);
    }

    @java.lang.Override
    public void getReference(ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<ga4gh.References.Reference> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_REFERENCE, responseObserver);
    }

    @java.lang.Override
    public void listReferenceBases(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_REFERENCE_BASES, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ReferenceServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface ReferenceServiceBlockingClient {

    /**
     * <pre>
     * Gets a list of `ReferenceSet` matching the search criteria.
     * `POST /referencesets/search` must accept a JSON version of
     * `SearchReferenceSetsRequest` as the post body and will return a JSON
     * version of `SearchReferenceSetsResponse`.
     * </pre>
     */
    public ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse searchReferenceSets(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request);

    /**
     * <pre>
     * Gets a `ReferenceSet` by ID.
     * `GET /referencesets/{reference_set_id}` will return a JSON version of
     * `ReferenceSet`.
     * </pre>
     */
    public ga4gh.References.ReferenceSet getReferenceSet(ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request);

    /**
     * <pre>
     * Gets a list of `Reference` matching the search criteria.
     * `POST /references/search` must accept a JSON version of
     * `SearchReferencesRequest` as the post body and will return a JSON
     * version of `SearchReferencesResponse`.
     * </pre>
     */
    public ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse searchReferences(ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request);

    /**
     * <pre>
     * Gets a `Reference` by ID.
     * `GET /references/{reference_id}` will return a JSON version of
     * `Reference`.
     * </pre>
     */
    public ga4gh.References.Reference getReference(ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request);

    /**
     * <pre>
     * Lists `Reference` bases by ID and optional range.
     * `GET /references/{id}/bases` will return a JSON version of
     * `ListReferenceBasesResponse`.
     * </pre>
     */
    public ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse listReferenceBases(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface ReferenceServiceFutureClient {

    /**
     * <pre>
     * Gets a list of `ReferenceSet` matching the search criteria.
     * `POST /referencesets/search` must accept a JSON version of
     * `SearchReferenceSetsRequest` as the post body and will return a JSON
     * version of `SearchReferenceSetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse> searchReferenceSets(
        ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request);

    /**
     * <pre>
     * Gets a `ReferenceSet` by ID.
     * `GET /referencesets/{reference_set_id}` will return a JSON version of
     * `ReferenceSet`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.References.ReferenceSet> getReferenceSet(
        ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request);

    /**
     * <pre>
     * Gets a list of `Reference` matching the search criteria.
     * `POST /references/search` must accept a JSON version of
     * `SearchReferencesRequest` as the post body and will return a JSON
     * version of `SearchReferencesResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse> searchReferences(
        ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request);

    /**
     * <pre>
     * Gets a `Reference` by ID.
     * `GET /references/{reference_id}` will return a JSON version of
     * `Reference`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.References.Reference> getReference(
        ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request);

    /**
     * <pre>
     * Lists `Reference` bases by ID and optional range.
     * `GET /references/{id}/bases` will return a JSON version of
     * `ListReferenceBasesResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse> listReferenceBases(
        ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request);
  }

  public static class ReferenceServiceStub extends io.grpc.stub.AbstractStub<ReferenceServiceStub>
      implements ReferenceService {
    private ReferenceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void searchReferenceSets(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getReferenceSet(ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.References.ReferenceSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchReferences(ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getReference(ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<ga4gh.References.Reference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void listReferenceBases(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_REFERENCE_BASES, getCallOptions()), request, responseObserver);
    }
  }

  public static class ReferenceServiceBlockingStub extends io.grpc.stub.AbstractStub<ReferenceServiceBlockingStub>
      implements ReferenceServiceBlockingClient {
    private ReferenceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse searchReferenceSets(ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_REFERENCE_SETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.References.ReferenceSet getReferenceSet(ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REFERENCE_SET, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse searchReferences(ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_REFERENCES, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.References.Reference getReference(ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_REFERENCE, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse listReferenceBases(ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_REFERENCE_BASES, getCallOptions(), request);
    }
  }

  public static class ReferenceServiceFutureStub extends io.grpc.stub.AbstractStub<ReferenceServiceFutureStub>
      implements ReferenceServiceFutureClient {
    private ReferenceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReferenceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReferenceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReferenceServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse> searchReferenceSets(
        ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.References.ReferenceSet> getReferenceSet(
        ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse> searchReferences(
        ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.References.Reference> getReference(
        ga4gh.ReferenceServiceOuterClass.GetReferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse> listReferenceBases(
        ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_REFERENCE_BASES, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractReferenceService extends ReferenceServiceImplBase {}

  private static final int METHODID_SEARCH_REFERENCE_SETS = 0;
  private static final int METHODID_GET_REFERENCE_SET = 1;
  private static final int METHODID_SEARCH_REFERENCES = 2;
  private static final int METHODID_GET_REFERENCE = 3;
  private static final int METHODID_LIST_REFERENCE_BASES = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReferenceService serviceImpl;
    private final int methodId;

    public MethodHandlers(ReferenceService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_REFERENCE_SETS:
          serviceImpl.searchReferenceSets((ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse>) responseObserver);
          break;
        case METHODID_GET_REFERENCE_SET:
          serviceImpl.getReferenceSet((ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.References.ReferenceSet>) responseObserver);
          break;
        case METHODID_SEARCH_REFERENCES:
          serviceImpl.searchReferences((ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse>) responseObserver);
          break;
        case METHODID_GET_REFERENCE:
          serviceImpl.getReference((ga4gh.ReferenceServiceOuterClass.GetReferenceRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.References.Reference>) responseObserver);
          break;
        case METHODID_LIST_REFERENCE_BASES:
          serviceImpl.listReferenceBases((ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse>) responseObserver);
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
        METHOD_SEARCH_REFERENCE_SETS,
        METHOD_GET_REFERENCE_SET,
        METHOD_SEARCH_REFERENCES,
        METHOD_GET_REFERENCE,
        METHOD_LIST_REFERENCE_BASES);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ReferenceService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SEARCH_REFERENCE_SETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsRequest,
              ga4gh.ReferenceServiceOuterClass.SearchReferenceSetsResponse>(
                serviceImpl, METHODID_SEARCH_REFERENCE_SETS)))
        .addMethod(
          METHOD_GET_REFERENCE_SET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReferenceServiceOuterClass.GetReferenceSetRequest,
              ga4gh.References.ReferenceSet>(
                serviceImpl, METHODID_GET_REFERENCE_SET)))
        .addMethod(
          METHOD_SEARCH_REFERENCES,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReferenceServiceOuterClass.SearchReferencesRequest,
              ga4gh.ReferenceServiceOuterClass.SearchReferencesResponse>(
                serviceImpl, METHODID_SEARCH_REFERENCES)))
        .addMethod(
          METHOD_GET_REFERENCE,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReferenceServiceOuterClass.GetReferenceRequest,
              ga4gh.References.Reference>(
                serviceImpl, METHODID_GET_REFERENCE)))
        .addMethod(
          METHOD_LIST_REFERENCE_BASES,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReferenceServiceOuterClass.ListReferenceBasesRequest,
              ga4gh.ReferenceServiceOuterClass.ListReferenceBasesResponse>(
                serviceImpl, METHODID_LIST_REFERENCE_BASES)))
        .build();
  }
}
