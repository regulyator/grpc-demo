# gRPC demo project
### **project structure**
| subproject | info |
| ------ | ------ |
| grpc-proto | common interface/generate sources |
| grpc-consumer | server project |
| grpc-producer | client project |

### **Usage**

- #### build sources and publish to local maven

  #### from root run

    ````sh
    ./gradlew grpc-proto:build
    ./gradlew grpc-proto:publishToMavenLocal
    ````

- #### start main class of grpc-consumer (ConsumerApp)
- #### start main class of grpc-producer (ProducerApp)
- #### open in browser - [hello](http://localhost:8090/hello)
- #### check grpc-producer console output👌 you should see somthing like that
    ````
    ...
    2022-04-21 02:11:41.561  INFO 28786 --- [ault-executor-0] r.d.g.d.p.NonBlockingStubProducerService : response received 1001
    2022-04-21 02:11:41.562  INFO 28786 --- [ault-executor-0] r.d.g.d.p.NonBlockingStubProducerService : response received 1002
    2022-04-21 02:11:41.562  INFO 28786 --- [ault-executor-0] r.d.g.d.p.NonBlockingStubProducerService : response received 1003
    ...
    2022-04-21 02:11:41.564  INFO 28786 --- [ault-executor-0] r.d.g.d.p.NonBlockingStubProducerService : stream completed
    ````
### **Notes**
- this demo project uses [grpc-spring-boot-starter](https://yidongnan.github.io/grpc-spring-boot-starter/en/)
- [gRPC introduction](https://grpc.io/docs/what-is-grpc/introduction/)
