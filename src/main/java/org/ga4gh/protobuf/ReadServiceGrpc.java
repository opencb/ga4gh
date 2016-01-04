package org.ga4gh.protobuf;

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

@javax.annotation.Generated("by gRPC proto compiler")
public class ReadServiceGrpc {

  private ReadServiceGrpc() {}

  public static final String SERVICE_NAME = "org.ga4gh.protobuf.ReadService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest,
      org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse> METHOD_SEARCH_DATASETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReadService", "SearchDatasets"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest,
      org.ga4gh.protobuf.Metadata.Dataset> METHOD_GET_DATASET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReadService", "GetDataset"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.Metadata.Dataset.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest,
      org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse> METHOD_SEARCH_READ_GROUP_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReadService", "SearchReadGroupSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest,
      org.ga4gh.protobuf.Reads.ReadGroupSet> METHOD_GET_READ_GROUP_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReadService", "GetReadGroupSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.Reads.ReadGroupSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest,
      org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse> METHOD_SEARCH_READS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReadService", "SearchReads"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse.getDefaultInstance()));

  public static ReadServiceStub newStub(io.grpc.Channel channel) {
    return new ReadServiceStub(channel);
  }

  public static ReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReadServiceBlockingStub(channel);
  }

  public static ReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReadServiceFutureStub(channel);
  }

  public static interface ReadService {

    public void searchDatasets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse> responseObserver);

    public void getDataset(org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Metadata.Dataset> responseObserver);

    public void searchReadGroupSets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse> responseObserver);

    public void getReadGroupSet(org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Reads.ReadGroupSet> responseObserver);

    public void searchReads(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse> responseObserver);
  }

  public static interface ReadServiceBlockingClient {

    public org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse searchDatasets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request);

    public org.ga4gh.protobuf.Metadata.Dataset getDataset(org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request);

    public org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse searchReadGroupSets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request);

    public org.ga4gh.protobuf.Reads.ReadGroupSet getReadGroupSet(org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request);

    public org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse searchReads(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request);
  }

  public static interface ReadServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse> searchDatasets(
        org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Metadata.Dataset> getDataset(
        org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse> searchReadGroupSets(
        org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Reads.ReadGroupSet> getReadGroupSet(
        org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse> searchReads(
        org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request);
  }

  public static class ReadServiceStub extends io.grpc.stub.AbstractStub<ReadServiceStub>
      implements ReadService {
    private ReadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void searchDatasets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DATASETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getDataset(org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Metadata.Dataset> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchReadGroupSets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getReadGroupSet(org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Reads.ReadGroupSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchReads(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READS, getCallOptions()), request, responseObserver);
    }
  }

  public static class ReadServiceBlockingStub extends io.grpc.stub.AbstractStub<ReadServiceBlockingStub>
      implements ReadServiceBlockingClient {
    private ReadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse searchDatasets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DATASETS, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.Metadata.Dataset getDataset(org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse searchReadGroupSets(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.Reads.ReadGroupSet getReadGroupSet(org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse searchReads(org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READS, getCallOptions()), request);
    }
  }

  public static class ReadServiceFutureStub extends io.grpc.stub.AbstractStub<ReadServiceFutureStub>
      implements ReadServiceFutureClient {
    private ReadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse> searchDatasets(
        org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_DATASETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Metadata.Dataset> getDataset(
        org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DATASET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse> searchReadGroupSets(
        org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Reads.ReadGroupSet> getReadGroupSet(
        org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse> searchReads(
        org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READS, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ReadService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_SEARCH_DATASETS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest,
              org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchDatasetsResponse> responseObserver) {
              serviceImpl.searchDatasets(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_DATASET,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest,
              org.ga4gh.protobuf.Metadata.Dataset>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReadServiceOuterClass.GetDatasetRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Metadata.Dataset> responseObserver) {
              serviceImpl.getDataset(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEARCH_READ_GROUP_SETS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest,
              org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadGroupSetsResponse> responseObserver) {
              serviceImpl.searchReadGroupSets(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_READ_GROUP_SET,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest,
              org.ga4gh.protobuf.Reads.ReadGroupSet>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReadServiceOuterClass.GetReadGroupSetRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Reads.ReadGroupSet> responseObserver) {
              serviceImpl.getReadGroupSet(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEARCH_READS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest,
              org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReadServiceOuterClass.SearchReadsResponse> responseObserver) {
              serviceImpl.searchReads(request, responseObserver);
            }
          })).build();
  }
}
