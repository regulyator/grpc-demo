package com.regulyator.demo.grpc.demoservice.consumer;

import com.regulyator.demo.grpc.demoservice.DemoRequest;
import com.regulyator.demo.grpc.demoservice.DemoResponse;
import com.regulyator.demo.grpc.demoservice.DemoServiceGrpc;
import io.grpc.stub.StreamObserver;


public class DemoGrpcConsumer extends DemoServiceGrpc.DemoServiceImplBase {
    @Override
    public StreamObserver<DemoRequest> hello(StreamObserver<DemoResponse> responseObserver) {
        return super.hello(responseObserver);
    }
}
