package com.regulyator.demo.grpc.demoservice.consumer;

import com.regulyator.demo.grpc.DemoRequest;
import com.regulyator.demo.grpc.DemoResponse;
import com.regulyator.demo.grpc.DemoServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class DemoGrpcConsumer extends DemoServiceGrpc.DemoServiceImplBase {

    @Override
    public void hello(DemoRequest request, StreamObserver<DemoResponse> responseObserver) {
        for(int i = 1; i <= 10; i++){
            DemoResponse response = DemoResponse.newBuilder()
                    .setCounterResponse(request.getCounterRequest()+i)
                    .build();
            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }

}
