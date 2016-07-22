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
    comments = "Source: ga4gh/allele_annotation_service.proto")
public class AlleleAnnotationServiceGrpc {

  private AlleleAnnotationServiceGrpc() {}

  public static final String SERVICE_NAME = "ga4gh.AlleleAnnotationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest,
      ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse> METHOD_SEARCH_VARIANT_ANNOTATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.AlleleAnnotationService", "SearchVariantAnnotations"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest,
      ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse> METHOD_SEARCH_VARIANT_ANNOTATION_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.AlleleAnnotationService", "SearchVariantAnnotationSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest,
      ga4gh.AlleleAnnotations.VariantAnnotationSet> METHOD_GET_VARIANT_ANNOTATION_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.AlleleAnnotationService", "GetVariantAnnotationSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.AlleleAnnotations.VariantAnnotationSet.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlleleAnnotationServiceStub newStub(io.grpc.Channel channel) {
    return new AlleleAnnotationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlleleAnnotationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AlleleAnnotationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static AlleleAnnotationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AlleleAnnotationServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface AlleleAnnotationService {

    /**
     * <pre>
     * Gets a list of `VariantAnnotation`s matching the search criteria.
     * This allows the mining of allele-specific annotations on a VariantSet by
     * either a region or by a set of genomic features. Where a region is supplied
     * annotation of all alleles vs all features in the region is returned. Where
     * a set of features is supplied, only annotations against these features
     * (matching on featuretype and id) are returned and other overlapping
     * features are ignored.
     * variantannotationsets/search returns information on the input to the
     * annotation. This will be a VariantSet and the reference data and software
     * versions used in calculating the annotation. It is essential this
     * information is exhaustive.
     * `POST /variantannotations/search` must accept a JSON version of
     * `SearchVariantAnnotationsRequest` as the post body and will return a JSON
     * version of `SearchVariantAnnotationsResponse`.
     * </pre>
     */
    public void searchVariantAnnotations(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse> responseObserver);

    /**
     * <pre>
     * Returns a list of available variant annotation sets.
     * `POST /variantannotationsets/search` must accept a JSON version of
     * `SearchVariantAnnotationSetsRequest` as the post body and will return a
     * JSON version of `SearchVariantAnnotationSetsResponse`.
     * </pre>
     */
    public void searchVariantAnnotationSets(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse> responseObserver);

    /**
     * <pre>
     * Gets an `VariantAnnotationSet` by ID.
     * `GET /variantannotationsets/{variant_annotation_set_id}` will return a JSON
     * version of `VariantAnnotationSet`.
     * </pre>
     */
    public void getVariantAnnotationSet(ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotations.VariantAnnotationSet> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class AlleleAnnotationServiceImplBase implements AlleleAnnotationService, io.grpc.BindableService {

    @java.lang.Override
    public void searchVariantAnnotations(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_VARIANT_ANNOTATIONS, responseObserver);
    }

    @java.lang.Override
    public void searchVariantAnnotationSets(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_VARIANT_ANNOTATION_SETS, responseObserver);
    }

    @java.lang.Override
    public void getVariantAnnotationSet(ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotations.VariantAnnotationSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VARIANT_ANNOTATION_SET, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return AlleleAnnotationServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface AlleleAnnotationServiceBlockingClient {

    /**
     * <pre>
     * Gets a list of `VariantAnnotation`s matching the search criteria.
     * This allows the mining of allele-specific annotations on a VariantSet by
     * either a region or by a set of genomic features. Where a region is supplied
     * annotation of all alleles vs all features in the region is returned. Where
     * a set of features is supplied, only annotations against these features
     * (matching on featuretype and id) are returned and other overlapping
     * features are ignored.
     * variantannotationsets/search returns information on the input to the
     * annotation. This will be a VariantSet and the reference data and software
     * versions used in calculating the annotation. It is essential this
     * information is exhaustive.
     * `POST /variantannotations/search` must accept a JSON version of
     * `SearchVariantAnnotationsRequest` as the post body and will return a JSON
     * version of `SearchVariantAnnotationsResponse`.
     * </pre>
     */
    public ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse searchVariantAnnotations(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request);

    /**
     * <pre>
     * Returns a list of available variant annotation sets.
     * `POST /variantannotationsets/search` must accept a JSON version of
     * `SearchVariantAnnotationSetsRequest` as the post body and will return a
     * JSON version of `SearchVariantAnnotationSetsResponse`.
     * </pre>
     */
    public ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse searchVariantAnnotationSets(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request);

    /**
     * <pre>
     * Gets an `VariantAnnotationSet` by ID.
     * `GET /variantannotationsets/{variant_annotation_set_id}` will return a JSON
     * version of `VariantAnnotationSet`.
     * </pre>
     */
    public ga4gh.AlleleAnnotations.VariantAnnotationSet getVariantAnnotationSet(ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface AlleleAnnotationServiceFutureClient {

    /**
     * <pre>
     * Gets a list of `VariantAnnotation`s matching the search criteria.
     * This allows the mining of allele-specific annotations on a VariantSet by
     * either a region or by a set of genomic features. Where a region is supplied
     * annotation of all alleles vs all features in the region is returned. Where
     * a set of features is supplied, only annotations against these features
     * (matching on featuretype and id) are returned and other overlapping
     * features are ignored.
     * variantannotationsets/search returns information on the input to the
     * annotation. This will be a VariantSet and the reference data and software
     * versions used in calculating the annotation. It is essential this
     * information is exhaustive.
     * `POST /variantannotations/search` must accept a JSON version of
     * `SearchVariantAnnotationsRequest` as the post body and will return a JSON
     * version of `SearchVariantAnnotationsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse> searchVariantAnnotations(
        ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request);

    /**
     * <pre>
     * Returns a list of available variant annotation sets.
     * `POST /variantannotationsets/search` must accept a JSON version of
     * `SearchVariantAnnotationSetsRequest` as the post body and will return a
     * JSON version of `SearchVariantAnnotationSetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse> searchVariantAnnotationSets(
        ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request);

    /**
     * <pre>
     * Gets an `VariantAnnotationSet` by ID.
     * `GET /variantannotationsets/{variant_annotation_set_id}` will return a JSON
     * version of `VariantAnnotationSet`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.AlleleAnnotations.VariantAnnotationSet> getVariantAnnotationSet(
        ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request);
  }

  public static class AlleleAnnotationServiceStub extends io.grpc.stub.AbstractStub<AlleleAnnotationServiceStub>
      implements AlleleAnnotationService {
    private AlleleAnnotationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlleleAnnotationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlleleAnnotationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlleleAnnotationServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void searchVariantAnnotations(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_ANNOTATIONS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchVariantAnnotationSets(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_ANNOTATION_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getVariantAnnotationSet(ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotations.VariantAnnotationSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_ANNOTATION_SET, getCallOptions()), request, responseObserver);
    }
  }

  public static class AlleleAnnotationServiceBlockingStub extends io.grpc.stub.AbstractStub<AlleleAnnotationServiceBlockingStub>
      implements AlleleAnnotationServiceBlockingClient {
    private AlleleAnnotationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlleleAnnotationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlleleAnnotationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlleleAnnotationServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse searchVariantAnnotations(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_VARIANT_ANNOTATIONS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse searchVariantAnnotationSets(ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_VARIANT_ANNOTATION_SETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.AlleleAnnotations.VariantAnnotationSet getVariantAnnotationSet(ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VARIANT_ANNOTATION_SET, getCallOptions(), request);
    }
  }

  public static class AlleleAnnotationServiceFutureStub extends io.grpc.stub.AbstractStub<AlleleAnnotationServiceFutureStub>
      implements AlleleAnnotationServiceFutureClient {
    private AlleleAnnotationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AlleleAnnotationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlleleAnnotationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AlleleAnnotationServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse> searchVariantAnnotations(
        ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_ANNOTATIONS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse> searchVariantAnnotationSets(
        ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_ANNOTATION_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.AlleleAnnotations.VariantAnnotationSet> getVariantAnnotationSet(
        ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_ANNOTATION_SET, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractAlleleAnnotationService extends AlleleAnnotationServiceImplBase {}

  private static final int METHODID_SEARCH_VARIANT_ANNOTATIONS = 0;
  private static final int METHODID_SEARCH_VARIANT_ANNOTATION_SETS = 1;
  private static final int METHODID_GET_VARIANT_ANNOTATION_SET = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlleleAnnotationService serviceImpl;
    private final int methodId;

    public MethodHandlers(AlleleAnnotationService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_VARIANT_ANNOTATIONS:
          serviceImpl.searchVariantAnnotations((ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse>) responseObserver);
          break;
        case METHODID_SEARCH_VARIANT_ANNOTATION_SETS:
          serviceImpl.searchVariantAnnotationSets((ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse>) responseObserver);
          break;
        case METHODID_GET_VARIANT_ANNOTATION_SET:
          serviceImpl.getVariantAnnotationSet((ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.AlleleAnnotations.VariantAnnotationSet>) responseObserver);
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
        METHOD_SEARCH_VARIANT_ANNOTATIONS,
        METHOD_SEARCH_VARIANT_ANNOTATION_SETS,
        METHOD_GET_VARIANT_ANNOTATION_SET);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final AlleleAnnotationService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SEARCH_VARIANT_ANNOTATIONS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsRequest,
              ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationsResponse>(
                serviceImpl, METHODID_SEARCH_VARIANT_ANNOTATIONS)))
        .addMethod(
          METHOD_SEARCH_VARIANT_ANNOTATION_SETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsRequest,
              ga4gh.AlleleAnnotationServiceOuterClass.SearchVariantAnnotationSetsResponse>(
                serviceImpl, METHODID_SEARCH_VARIANT_ANNOTATION_SETS)))
        .addMethod(
          METHOD_GET_VARIANT_ANNOTATION_SET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.AlleleAnnotationServiceOuterClass.GetVariantAnnotationSetRequest,
              ga4gh.AlleleAnnotations.VariantAnnotationSet>(
                serviceImpl, METHODID_GET_VARIANT_ANNOTATION_SET)))
        .build();
  }
}
