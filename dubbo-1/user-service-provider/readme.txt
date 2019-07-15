说明：
1.user-service-provider和order-service-consumer工程中只写UserService接口和OrderService的实现，
接口的定义以及使用到的javaBean都放在test-interface工程中，user-service-provider和order-service-consumer
工程中的pom.xml文件中都需要引入test-interface工程中公共的接口的依赖！！！



