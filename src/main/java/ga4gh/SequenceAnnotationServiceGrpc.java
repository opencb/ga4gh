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
    comments = "Source: ga4gh/sequence_annotation_service.proto")
public class SequenceAnnotationServiceGrpc {

  private SequenceAnnotationServiceGrpc() {}

  public static final String SERVICE_NAME = "ga4gh.SequenceAnnotationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest,
      ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse> METHOD_SEARCH_FEATURE_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.SequenceAnnotationService", "SearchFeatureSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest,
      ga4gh.SequenceAnnotations.FeatureSet> METHOD_GET_FEATURE_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.SequenceAnnotationService", "GetFeatureSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotations.FeatureSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest,
      ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse> METHOD_SEARCH_FEATURES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.SequenceAnnotationService", "SearchFeatures"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest,
      ga4gh.SequenceAnnotations.Feature> METHOD_GET_FEATURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.SequenceAnnotationService", "GetFeature"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.SequenceAnnotations.Feature.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SequenceAnnotationServiceStub newStub(io.grpc.Channel channel) {
    return new SequenceAnnotationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SequenceAnnotationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SequenceAnnotationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SequenceAnnotationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SequenceAnnotationServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface SequenceAnnotationService {

    /**
     * <pre>
     * Gets a list of `FeatureSet` matching the search criteria.
     * `POST /featuresets/search` must accept a JSON version of
     * `SearchFeatureSetsRequest` as the post body and will return a JSON version
     * of `SearchFeatureSetsResponse`.
     * </pre>
     */
    public void searchFeatureSets(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `FeatureSet` by ID.
     * `GET /featuresets/{id}` will return a JSON version of `FeatureSet`.
     * </pre>
     */
    public void getFeatureSet(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.FeatureSet> responseObserver);

    /**
     * <pre>
     * Gets a list of `Feature` matching the search criteria.
     * `POST /features/search` must accept a JSON version of
     * `SearchFeaturesRequest` as the post body and will return a JSON version of
     * `SearchFeaturesResponse`.
     * </pre>
     */
    public void searchFeatures(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse> responseObserver);

    /**
     * <pre>
     * Gets a `org.ga4gh.models.Feature` by ID.
     * `GET /features/{id}` will return a JSON version of `Feature`.
     * </pre>
     */
    public void getFeature(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.Feature> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class SequenceAnnotationServiceImplBase implements SequenceAnnotationService, io.grpc.BindableService {

    @java.lang.Override
    public void searchFeatureSets(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_FEATURE_SETS, responseObserver);
    }

    @java.lang.Override
    public void getFeatureSet(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.FeatureSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEATURE_SET, responseObserver);
    }

    @java.lang.Override
    public void searchFeatures(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_FEATURES, responseObserver);
    }

    @java.lang.Override
    public void getFeature(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEATURE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return SequenceAnnotationServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface SequenceAnnotationServiceBlockingClient {

    /**
     * <pre>
     * Gets a list of `FeatureSet` matching the search criteria.
     * `POST /featuresets/search` must accept a JSON version of
     * `SearchFeatureSetsRequest` as the post body and will return a JSON version
     * of `SearchFeatureSetsResponse`.
     * </pre>
     */
    public ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse searchFeatureSets(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request);

    /**
     * <pre>
     * Gets a `FeatureSet` by ID.
     * `GET /featuresets/{id}` will return a JSON version of `FeatureSet`.
     * </pre>
     */
    public ga4gh.SequenceAnnotations.FeatureSet getFeatureSet(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request);

    /**
     * <pre>
     * Gets a list of `Feature` matching the search criteria.
     * `POST /features/search` must accept a JSON version of
     * `SearchFeaturesRequest` as the post body and will return a JSON version of
     * `SearchFeaturesResponse`.
     * </pre>
     */
    public ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse searchFeatures(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request);

    /**
     * <pre>
     * Gets a `org.ga4gh.models.Feature` by ID.
     * `GET /features/{id}` will return a JSON version of `Feature`.
     * </pre>
     */
    public ga4gh.SequenceAnnotations.Feature getFeature(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface SequenceAnnotationServiceFutureClient {

    /**
     * <pre>
     * Gets a list of `FeatureSet` matching the search criteria.
     * `POST /featuresets/search` must accept a JSON version of
     * `SearchFeatureSetsRequest` as the post body and will return a JSON version
     * of `SearchFeatureSetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse> searchFeatureSets(
        ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request);

    /**
     * <pre>
     * Gets a `FeatureSet` by ID.
     * `GET /featuresets/{id}` will return a JSON version of `FeatureSet`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotations.FeatureSet> getFeatureSet(
        ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request);

    /**
     * <pre>
     * Gets a list of `Feature` matching the search criteria.
     * `POST /features/search` must accept a JSON version of
     * `SearchFeaturesRequest` as the post body and will return a JSON version of
     * `SearchFeaturesResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse> searchFeatures(
        ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request);

    /**
     * <pre>
     * Gets a `org.ga4gh.models.Feature` by ID.
     * `GET /features/{id}` will return a JSON version of `Feature`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotations.Feature> getFeature(
        ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request);
  }

  public static class SequenceAnnotationServiceStub extends io.grpc.stub.AbstractStub<SequenceAnnotationServiceStub>
      implements SequenceAnnotationService {
    private SequenceAnnotationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SequenceAnnotationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceAnnotationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SequenceAnnotationServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void searchFeatureSets(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_FEATURE_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getFeatureSet(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.FeatureSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchFeatures(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_FEATURES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getFeature(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request,
        io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.Feature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request, responseObserver);
    }
  }

  public static class SequenceAnnotationServiceBlockingStub extends io.grpc.stub.AbstractStub<SequenceAnnotationServiceBlockingStub>
      implements SequenceAnnotationServiceBlockingClient {
    private SequenceAnnotationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SequenceAnnotationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceAnnotationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SequenceAnnotationServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse searchFeatureSets(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_FEATURE_SETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.SequenceAnnotations.FeatureSet getFeatureSet(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FEATURE_SET, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse searchFeatures(ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_FEATURES, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.SequenceAnnotations.Feature getFeature(ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FEATURE, getCallOptions(), request);
    }
  }

  public static class SequenceAnnotationServiceFutureStub extends io.grpc.stub.AbstractStub<SequenceAnnotationServiceFutureStub>
      implements SequenceAnnotationServiceFutureClient {
    private SequenceAnnotationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SequenceAnnotationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceAnnotationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SequenceAnnotationServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse> searchFeatureSets(
        ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_FEATURE_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotations.FeatureSet> getFeatureSet(
        ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse> searchFeatures(
        ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_FEATURES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.SequenceAnnotations.Feature> getFeature(
        ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractSequenceAnnotationService extends SequenceAnnotationServiceImplBase {}

  private static final int METHODID_SEARCH_FEATURE_SETS = 0;
  private static final int METHODID_GET_FEATURE_SET = 1;
  private static final int METHODID_SEARCH_FEATURES = 2;
  private static final int METHODID_GET_FEATURE = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SequenceAnnotationService serviceImpl;
    private final int methodId;

    public MethodHandlers(SequenceAnnotationService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_FEATURE_SETS:
          serviceImpl.searchFeatureSets((ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse>) responseObserver);
          break;
        case METHODID_GET_FEATURE_SET:
          serviceImpl.getFeatureSet((ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.FeatureSet>) responseObserver);
          break;
        case METHODID_SEARCH_FEATURES:
          serviceImpl.searchFeatures((ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse>) responseObserver);
          break;
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.SequenceAnnotations.Feature>) responseObserver);
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
        METHOD_SEARCH_FEATURE_SETS,
        METHOD_GET_FEATURE_SET,
        METHOD_SEARCH_FEATURES,
        METHOD_GET_FEATURE);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final SequenceAnnotationService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SEARCH_FEATURE_SETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsRequest,
              ga4gh.SequenceAnnotationServiceOuterClass.SearchFeatureSetsResponse>(
                serviceImpl, METHODID_SEARCH_FEATURE_SETS)))
        .addMethod(
          METHOD_GET_FEATURE_SET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureSetRequest,
              ga4gh.SequenceAnnotations.FeatureSet>(
                serviceImpl, METHODID_GET_FEATURE_SET)))
        .addMethod(
          METHOD_SEARCH_FEATURES,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesRequest,
              ga4gh.SequenceAnnotationServiceOuterClass.SearchFeaturesResponse>(
                serviceImpl, METHODID_SEARCH_FEATURES)))
        .addMethod(
          METHOD_GET_FEATURE,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.SequenceAnnotationServiceOuterClass.GetFeatureRequest,
              ga4gh.SequenceAnnotations.Feature>(
                serviceImpl, METHODID_GET_FEATURE)))
        .build();
  }
}
