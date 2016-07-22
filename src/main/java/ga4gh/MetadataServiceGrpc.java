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
    comments = "Source: ga4gh/metadata_service.proto")
public class MetadataServiceGrpc {

  private MetadataServiceGrpc() {}

  public static final String SERVICE_NAME = "ga4gh.MetadataService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest,
      ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse> METHOD_SEARCH_DATASETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.MetadataService", "SearchDatasets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.MetadataServiceOuterClass.GetDatasetRequest,
      ga4gh.Metadata.Dataset> METHOD_GET_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.MetadataService", "GetDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.MetadataServiceOuterClass.GetDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.Metadata.Dataset.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetadataServiceStub newStub(io.grpc.Channel channel) {
    return new MetadataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MetadataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MetadataServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface MetadataService {

    /**
     * <pre>
     * Gets a list of `Dataset` matching the search criteria.
     * `POST /datasets/search` must accept a JSON version of
     * `SearchDatasetsRequest` as the post body and will return a JSON
     * version of `SearchDatasetsResponse`.
     * </pre>
     */
    public void searchDatasets(ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `Dataset` by ID.
     * `GET /datasets/{dataset_id}` will return a JSON version of
     * `Dataset`.
     * </pre>
     */
    public void getDataset(ga4gh.MetadataServiceOuterClass.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Metadata.Dataset> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class MetadataServiceImplBase implements MetadataService, io.grpc.BindableService {

    @java.lang.Override
    public void searchDatasets(ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_DATASETS, responseObserver);
    }

    @java.lang.Override
    public void getDataset(ga4gh.MetadataServiceOuterClass.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Metadata.Dataset> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DATASET, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return MetadataServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface MetadataServiceBlockingClient {

    /**
     * <pre>
     * Gets a list of `Dataset` matching the search criteria.
     * `POST /datasets/search` must accept a JSON version of
     * `SearchDatasetsRequest` as the post body and will return a JSON
     * version of `SearchDatasetsResponse`.
     * </pre>
     */
    public ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse searchDatasets(ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request);

    /**
     * <pre>
     * Gets a `Dataset` by ID.
     * `GET /datasets/{dataset_id}` will return a JSON version of
     * `Dataset`.
     * </pre>
     */
    public ga4gh.Metadata.Dataset getDataset(ga4gh.MetadataServiceOuterClass.GetDatasetRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface MetadataServiceFutureClient {

    /**
     * <pre>
     * Gets a list of `Dataset` matching the search criteria.
     * `POST /datasets/search` must accept a JSON version of
     * `SearchDatasetsRequest` as the post body and will return a JSON
     * version of `SearchDatasetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse> searchDatasets(
        ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request);

    /**
     * <pre>
     * Gets a `Dataset` by ID.
     * `GET /datasets/{dataset_id}` will return a JSON version of
     * `Dataset`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Metadata.Dataset> getDataset(
        ga4gh.MetadataServiceOuterClass.GetDatasetRequest request);
  }

  public static class MetadataServiceStub extends io.grpc.stub.AbstractStub<MetadataServiceStub>
      implements MetadataService {
    private MetadataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void searchDatasets(ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DATASETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getDataset(ga4gh.MetadataServiceOuterClass.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Metadata.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request, responseObserver);
    }
  }

  public static class MetadataServiceBlockingStub extends io.grpc.stub.AbstractStub<MetadataServiceBlockingStub>
      implements MetadataServiceBlockingClient {
    private MetadataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse searchDatasets(ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_DATASETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.Metadata.Dataset getDataset(ga4gh.MetadataServiceOuterClass.GetDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DATASET, getCallOptions(), request);
    }
  }

  public static class MetadataServiceFutureStub extends io.grpc.stub.AbstractStub<MetadataServiceFutureStub>
      implements MetadataServiceFutureClient {
    private MetadataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MetadataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetadataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MetadataServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse> searchDatasets(
        ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DATASETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Metadata.Dataset> getDataset(
        ga4gh.MetadataServiceOuterClass.GetDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractMetadataService extends MetadataServiceImplBase {}

  private static final int METHODID_SEARCH_DATASETS = 0;
  private static final int METHODID_GET_DATASET = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetadataService serviceImpl;
    private final int methodId;

    public MethodHandlers(MetadataService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_DATASETS:
          serviceImpl.searchDatasets((ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse>) responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset((ga4gh.MetadataServiceOuterClass.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.Metadata.Dataset>) responseObserver);
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
        METHOD_SEARCH_DATASETS,
        METHOD_GET_DATASET);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final MetadataService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SEARCH_DATASETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.MetadataServiceOuterClass.SearchDatasetsRequest,
              ga4gh.MetadataServiceOuterClass.SearchDatasetsResponse>(
                serviceImpl, METHODID_SEARCH_DATASETS)))
        .addMethod(
          METHOD_GET_DATASET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.MetadataServiceOuterClass.GetDatasetRequest,
              ga4gh.Metadata.Dataset>(
                serviceImpl, METHODID_GET_DATASET)))
        .build();
  }
}
