package com.regulyator.demo.grpc.demoservice.producer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DemoController {

    private final NonBlockingStubProducerService nonBlockingStubProducerService;

    @GetMapping("/hello")
    public String testCallGrpcService() {
        nonBlockingStubProducerService.sayHello();
        return "service called, check console output!";
    }

}
