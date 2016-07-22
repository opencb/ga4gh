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
    comments = "Source: ga4gh/read_service.proto")
public class ReadServiceGrpc {

  private ReadServiceGrpc() {}

  public static final String SERVICE_NAME = "ga4gh.ReadService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest,
      ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse> METHOD_SEARCH_READ_GROUP_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReadService", "SearchReadGroupSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest,
      ga4gh.Reads.ReadGroupSet> METHOD_GET_READ_GROUP_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReadService", "GetReadGroupSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.Reads.ReadGroupSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ga4gh.ReadServiceOuterClass.SearchReadsRequest,
      ga4gh.ReadServiceOuterClass.SearchReadsResponse> METHOD_SEARCH_READS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ga4gh.ReadService", "SearchReads"),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReadServiceOuterClass.SearchReadsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ga4gh.ReadServiceOuterClass.SearchReadsResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReadServiceStub newStub(io.grpc.Channel channel) {
    return new ReadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReadServiceFutureStub(channel);
  }

  /**
   */
  @java.lang.Deprecated public static interface ReadService {

    /**
     * <pre>
     * Gets a list of `ReadGroupSet` matching the search criteria.
     * `POST /readgroupsets/search` must accept a JSON version of
     * `SearchReadGroupSetsRequest` as the post body and will return a JSON
     * version of `SearchReadGroupSetsResponse`.
     * </pre>
     */
    public void searchReadGroupSets(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse> responseObserver);

    /**
     * <pre>
     * Gets a `ReadGroupSet` by ID.
     * `GET /readgroupsets/{read_group_set_id}` will return a JSON version of
     * `ReadGroupSet`.
     * </pre>
     */
    public void getReadGroupSet(ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Reads.ReadGroupSet> responseObserver);

    /**
     * <pre>
     * Gets a list of `ReadAlignment`s for one or more `ReadGroup`s.
     * `searchReads` operates over a genomic coordinate space of reference sequence
     * and position defined by the `Reference`s to which the requested `ReadGroup`s are
     * aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome *overlap* the range. A query which specifies
     * only read group IDs yields all reads in those read groups, including unmapped
     * reads.
     * All reads returned (including reads on subsequent pages) are ordered by genomic
     * coordinate (by reference sequence, then position). Reads with equivalent genomic
     * coordinates are returned in an unspecified order. This order must be consistent
     * for a given repository, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams of
     * paginated responses.
     * `POST /reads/search` must accept a JSON version of `SearchReadsRequest` as
     * the post body and will return a JSON version of `SearchReadsResponse`.
     * </pre>
     */
    public void searchReads(ga4gh.ReadServiceOuterClass.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadsResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ReadServiceImplBase implements ReadService, io.grpc.BindableService {

    @java.lang.Override
    public void searchReadGroupSets(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_READ_GROUP_SETS, responseObserver);
    }

    @java.lang.Override
    public void getReadGroupSet(ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Reads.ReadGroupSet> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_READ_GROUP_SET, responseObserver);
    }

    @java.lang.Override
    public void searchReads(ga4gh.ReadServiceOuterClass.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_READS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ReadServiceGrpc.bindService(this);
    }
  }

  /**
   */
  @java.lang.Deprecated public static interface ReadServiceBlockingClient {

    /**
     * <pre>
     * Gets a list of `ReadGroupSet` matching the search criteria.
     * `POST /readgroupsets/search` must accept a JSON version of
     * `SearchReadGroupSetsRequest` as the post body and will return a JSON
     * version of `SearchReadGroupSetsResponse`.
     * </pre>
     */
    public ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse searchReadGroupSets(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request);

    /**
     * <pre>
     * Gets a `ReadGroupSet` by ID.
     * `GET /readgroupsets/{read_group_set_id}` will return a JSON version of
     * `ReadGroupSet`.
     * </pre>
     */
    public ga4gh.Reads.ReadGroupSet getReadGroupSet(ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request);

    /**
     * <pre>
     * Gets a list of `ReadAlignment`s for one or more `ReadGroup`s.
     * `searchReads` operates over a genomic coordinate space of reference sequence
     * and position defined by the `Reference`s to which the requested `ReadGroup`s are
     * aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome *overlap* the range. A query which specifies
     * only read group IDs yields all reads in those read groups, including unmapped
     * reads.
     * All reads returned (including reads on subsequent pages) are ordered by genomic
     * coordinate (by reference sequence, then position). Reads with equivalent genomic
     * coordinates are returned in an unspecified order. This order must be consistent
     * for a given repository, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams of
     * paginated responses.
     * `POST /reads/search` must accept a JSON version of `SearchReadsRequest` as
     * the post body and will return a JSON version of `SearchReadsResponse`.
     * </pre>
     */
    public ga4gh.ReadServiceOuterClass.SearchReadsResponse searchReads(ga4gh.ReadServiceOuterClass.SearchReadsRequest request);
  }

  /**
   */
  @java.lang.Deprecated public static interface ReadServiceFutureClient {

    /**
     * <pre>
     * Gets a list of `ReadGroupSet` matching the search criteria.
     * `POST /readgroupsets/search` must accept a JSON version of
     * `SearchReadGroupSetsRequest` as the post body and will return a JSON
     * version of `SearchReadGroupSetsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse> searchReadGroupSets(
        ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request);

    /**
     * <pre>
     * Gets a `ReadGroupSet` by ID.
     * `GET /readgroupsets/{read_group_set_id}` will return a JSON version of
     * `ReadGroupSet`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Reads.ReadGroupSet> getReadGroupSet(
        ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request);

    /**
     * <pre>
     * Gets a list of `ReadAlignment`s for one or more `ReadGroup`s.
     * `searchReads` operates over a genomic coordinate space of reference sequence
     * and position defined by the `Reference`s to which the requested `ReadGroup`s are
     * aligned.
     * If a target positional range is specified, search returns all reads whose
     * alignment to the reference genome *overlap* the range. A query which specifies
     * only read group IDs yields all reads in those read groups, including unmapped
     * reads.
     * All reads returned (including reads on subsequent pages) are ordered by genomic
     * coordinate (by reference sequence, then position). Reads with equivalent genomic
     * coordinates are returned in an unspecified order. This order must be consistent
     * for a given repository, such that two queries for the same content (regardless
     * of page size) yield reads in the same order across their respective streams of
     * paginated responses.
     * `POST /reads/search` must accept a JSON version of `SearchReadsRequest` as
     * the post body and will return a JSON version of `SearchReadsResponse`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReadServiceOuterClass.SearchReadsResponse> searchReads(
        ga4gh.ReadServiceOuterClass.SearchReadsRequest request);
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
    public void searchReadGroupSets(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getReadGroupSet(ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request,
        io.grpc.stub.StreamObserver<ga4gh.Reads.ReadGroupSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchReads(ga4gh.ReadServiceOuterClass.SearchReadsRequest request,
        io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadsResponse> responseObserver) {
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
    public ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse searchReadGroupSets(ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_READ_GROUP_SETS, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.Reads.ReadGroupSet getReadGroupSet(ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_READ_GROUP_SET, getCallOptions(), request);
    }

    @java.lang.Override
    public ga4gh.ReadServiceOuterClass.SearchReadsResponse searchReads(ga4gh.ReadServiceOuterClass.SearchReadsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_READS, getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse> searchReadGroupSets(
        ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READ_GROUP_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.Reads.ReadGroupSet> getReadGroupSet(
        ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_READ_GROUP_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<ga4gh.ReadServiceOuterClass.SearchReadsResponse> searchReads(
        ga4gh.ReadServiceOuterClass.SearchReadsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_READS, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractReadService extends ReadServiceImplBase {}

  private static final int METHODID_SEARCH_READ_GROUP_SETS = 0;
  private static final int METHODID_GET_READ_GROUP_SET = 1;
  private static final int METHODID_SEARCH_READS = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReadService serviceImpl;
    private final int methodId;

    public MethodHandlers(ReadService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_READ_GROUP_SETS:
          serviceImpl.searchReadGroupSets((ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse>) responseObserver);
          break;
        case METHODID_GET_READ_GROUP_SET:
          serviceImpl.getReadGroupSet((ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.Reads.ReadGroupSet>) responseObserver);
          break;
        case METHODID_SEARCH_READS:
          serviceImpl.searchReads((ga4gh.ReadServiceOuterClass.SearchReadsRequest) request,
              (io.grpc.stub.StreamObserver<ga4gh.ReadServiceOuterClass.SearchReadsResponse>) responseObserver);
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
        METHOD_SEARCH_READ_GROUP_SETS,
        METHOD_GET_READ_GROUP_SET,
        METHOD_SEARCH_READS);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ReadService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_SEARCH_READ_GROUP_SETS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReadServiceOuterClass.SearchReadGroupSetsRequest,
              ga4gh.ReadServiceOuterClass.SearchReadGroupSetsResponse>(
                serviceImpl, METHODID_SEARCH_READ_GROUP_SETS)))
        .addMethod(
          METHOD_GET_READ_GROUP_SET,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReadServiceOuterClass.GetReadGroupSetRequest,
              ga4gh.Reads.ReadGroupSet>(
                serviceImpl, METHODID_GET_READ_GROUP_SET)))
        .addMethod(
          METHOD_SEARCH_READS,
          asyncUnaryCall(
            new MethodHandlers<
              ga4gh.ReadServiceOuterClass.SearchReadsRequest,
              ga4gh.ReadServiceOuterClass.SearchReadsResponse>(
                serviceImpl, METHODID_SEARCH_READS)))
        .build();
  }
}
