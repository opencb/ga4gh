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
public class VariantServiceGrpc {

  private VariantServiceGrpc() {}

  public static final String SERVICE_NAME = "org.ga4gh.protobuf.VariantService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest,
      org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse> METHOD_SEARCH_VARIANT_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.VariantService", "SearchVariantSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest,
      org.ga4gh.protobuf.Variants.VariantSet> METHOD_GET_VARIANT_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.VariantService", "GetVariantSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.Variants.VariantSet.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest,
      org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse> METHOD_SEARCH_VARIANTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.VariantService", "SearchVariants"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest,
      org.ga4gh.protobuf.Variants.Variant> METHOD_GET_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.VariantService", "GetVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.Variants.Variant.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest,
      org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse> METHOD_SEARCH_CALL_SETS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.VariantService", "SearchCallSets"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest,
      org.ga4gh.protobuf.Variants.CallSet> METHOD_GET_CALL_SET =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "org.ga4gh.protobuf.VariantService", "GetCallSet"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.ga4gh.protobuf.Variants.CallSet.getDefaultInstance()));

  public static VariantServiceStub newStub(io.grpc.Channel channel) {
    return new VariantServiceStub(channel);
  }

  public static VariantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VariantServiceBlockingStub(channel);
  }

  public static VariantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VariantServiceFutureStub(channel);
  }

  public static interface VariantService {

    public void searchVariantSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse> responseObserver);

    public void getVariantSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.VariantSet> responseObserver);

    public void searchVariants(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse> responseObserver);

    public void getVariant(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.Variant> responseObserver);

    public void searchCallSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse> responseObserver);

    public void getCallSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.CallSet> responseObserver);
  }

  public static interface VariantServiceBlockingClient {

    public org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse searchVariantSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request);

    public org.ga4gh.protobuf.Variants.VariantSet getVariantSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request);

    public org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse searchVariants(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request);

    public org.ga4gh.protobuf.Variants.Variant getVariant(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request);

    public org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse searchCallSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request);

    public org.ga4gh.protobuf.Variants.CallSet getCallSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request);
  }

  public static interface VariantServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse> searchVariantSets(
        org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Variants.VariantSet> getVariantSet(
        org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse> searchVariants(
        org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Variants.Variant> getVariant(
        org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse> searchCallSets(
        org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request);

    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Variants.CallSet> getCallSet(
        org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request);
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
    public void searchVariantSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getVariantSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.VariantSet> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchVariants(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getVariant(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.Variant> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void searchCallSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getCallSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request,
        io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.CallSet> responseObserver) {
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
    public org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse searchVariantSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.Variants.VariantSet getVariantSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse searchVariants(org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.Variants.Variant getVariant(org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse searchCallSets(org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public org.ga4gh.protobuf.Variants.CallSet getCallSet(org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_GET_CALL_SET, getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse> searchVariantSets(
        org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANT_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Variants.VariantSet> getVariantSet(
        org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT_SET, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse> searchVariants(
        org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_VARIANTS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Variants.Variant> getVariant(
        org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VARIANT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse> searchCallSets(
        org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CALL_SETS, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.ga4gh.protobuf.Variants.CallSet> getCallSet(
        org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CALL_SET, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final VariantService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_SEARCH_VARIANT_SETS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest,
              org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantSetsResponse> responseObserver) {
              serviceImpl.searchVariantSets(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_VARIANT_SET,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest,
              org.ga4gh.protobuf.Variants.VariantSet>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantSetRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.VariantSet> responseObserver) {
              serviceImpl.getVariantSet(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEARCH_VARIANTS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest,
              org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchVariantsResponse> responseObserver) {
              serviceImpl.searchVariants(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_VARIANT,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest,
              org.ga4gh.protobuf.Variants.Variant>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.VariantServiceOuterClass.GetVariantRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.Variant> responseObserver) {
              serviceImpl.getVariant(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEARCH_CALL_SETS,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest,
              org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.VariantServiceOuterClass.SearchCallSetsResponse> responseObserver) {
              serviceImpl.searchCallSets(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_CALL_SET,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest,
              org.ga4gh.protobuf.Variants.CallSet>() {
            @java.lang.Override
            public void invoke(
                org.ga4gh.protobuf.VariantServiceOuterClass.GetCallSetRequest request,
                io.grpc.stub.StreamObserver<org.ga4gh.protobuf.Variants.CallSet> responseObserver) {
              serviceImpl.getCallSet(request, responseObserver);
            }
          })).build();
  }
}
