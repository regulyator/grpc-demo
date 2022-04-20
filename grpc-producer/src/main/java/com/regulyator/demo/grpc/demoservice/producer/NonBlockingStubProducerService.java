package com.regulyator.demo.grpc.demoservice.producer;

import com.regulyator.demo.grpc.DemoRequest;
import com.regulyator.demo.grpc.DemoResponse;
import com.regulyator.demo.grpc.DemoServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NonBlockingStubProducerService {

    @GrpcClient("demo-server")
    private DemoServiceGrpc.DemoServiceStub demoServiceStub;

    public void sayHello() {
        DemoRequest request = DemoRequest.newBuilder()
                .setCounterRequest(1000)
                .build();
        demoServiceStub.hello(request, new StreamObserver<>() {
            @Override
            public void onNext(DemoResponse value) {
                log.info("response received {}", value.getCounterResponse());
            }

            @Override
            public void onError(Throwable t) {
                log.info("error");
            }

            @Override
            public void onCompleted() {
                log.info("stream completed");
            }
        });
    }
}
