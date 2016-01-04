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
public class ReferenceServiceGrpc {

  private ReferenceServiceGrpc() {}

  public static final String SERVICE_NAME = "org.ga4gh.protobuf.ReferenceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest,
      org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse> METHOD_SEARCH_REFERENCE_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReferenceService", "SearchReferenceSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest,
      org.ga4gh.protobuf.References.ReferenceSet> METHOD_GET_REFERENCE_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReferenceService", "GetReferenceSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.References.ReferenceSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest,
      org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse> METHOD_SEARCH_REFERENCES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReferenceService", "SearchReferences"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest,
      org.ga4gh.protobuf.References.Reference> METHOD_GET_REFERENCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReferenceService", "GetReference"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.References.Reference.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest,
      org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse> METHOD_LIST_REFERENCE_BASES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.ReferenceService", "ListReferenceBases"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse.getDefaultInstance()));

  public static ReferenceServiceStub newStub(io.grpc.Channel channel) {
    return new ReferenceServiceStub(channel);
  }

  public static ReferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReferenceServiceBlockingStub(channel);
  }

  public static ReferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReferenceServiceFutureStub(channel);
  }

  public static interface ReferenceService {

    public void searchReferenceSets(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse> responseObserver);

    public void getReferenceSet(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.References.ReferenceSet> responseObserver);

    public void searchReferences(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse> responseObserver);

    public void getReference(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.References.Reference> responseObserver);

    public void listReferenceBases(org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse> responseObserver);
  }

  public static interface ReferenceServiceBlockingClient {

    public org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse searchReferenceSets(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request);

    public org.ga4gh.protobuf.References.ReferenceSet getReferenceSet(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request);

    public org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse searchReferences(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request);

    public org.ga4gh.protobuf.References.Reference getReference(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request);

    public org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse listReferenceBases(org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request);
  }

  public static interface ReferenceServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse> searchReferenceSets(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.References.ReferenceSet> getReferenceSet(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse> searchReferences(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.References.Reference> getReference(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse> listReferenceBases(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request);
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
    public void searchReferenceSets(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getReferenceSet(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.References.ReferenceSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchReferences(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getReference(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.References.Reference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void listReferenceBases(org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse> responseObserver) {
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
    public org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse searchReferenceSets(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.References.ReferenceSet getReferenceSet(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse searchReferences(org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.References.Reference getReference(org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse listReferenceBases(org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_LIST_REFERENCE_BASES, getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse> searchReferenceSets(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCE_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.References.ReferenceSet> getReferenceSet(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse> searchReferences(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_REFERENCES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.References.Reference> getReference(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_REFERENCE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse> listReferenceBases(
        org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_REFERENCE_BASES, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ReferenceService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_SEARCH_REFERENCE_SETS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest,
              org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferenceSetsResponse> responseObserver) {
              serviceImpl.searchReferenceSets(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_REFERENCE_SET,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest,
              org.ga4gh.protobuf.References.ReferenceSet>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceSetRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.References.ReferenceSet> responseObserver) {
              serviceImpl.getReferenceSet(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEARCH_REFERENCES,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest,
              org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.SearchReferencesResponse> responseObserver) {
              serviceImpl.searchReferences(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_REFERENCE,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest,
              org.ga4gh.protobuf.References.Reference>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReferenceServiceOuterClass.GetReferenceRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.References.Reference> responseObserver) {
              serviceImpl.getReference(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_LIST_REFERENCE_BASES,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest,
              org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.ReferenceServiceOuterClass.ListReferenceBasesResponse> responseObserver) {
              serviceImpl.listReferenceBases(request, responseObserver);
            }
          })).build();
  }
}
