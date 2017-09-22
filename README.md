## 简介
多模块项目，学习配置gradle和spring-cloud系列工程。

### 服务这册发现:Server Discovery
在spring-cloud中支持最好的是Eureka>Consul>Zookeeper

### 服务配置：server
1、暂时使用单一server的形式，通过不同的客户端向服务器注册
2、同行意识注册，也就是说多服务，服务A向B注册，服务B向A这册。如：server工程中yml文件注释部分。
3、@EnabledEurekaServer

### 客户端：client
1、需要向服务中心注册，发送心跳。
2、@EnabledEurekaClient || @EnabledDiscoveryClient

### 客户端路由：RestTemplate+Ribbon
1、需要添加依赖：ribbon，并且注入restTemplate，开启负载，不断调用，rest会在两个客服端之间轮询。

### 客户端路由：Feign
1、Feign 采用的是基于接口的注解
2、Feign 整合了ribbon
3、需要在启动类中配置：@@EnableFeignClients 和 定义service：@FeignClient("serviceName")
