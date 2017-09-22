package cn.com.yxb.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created on 2017/9/22.
 *
 * @author frank.
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.com.yxb.demo")
@EnableEurekaClient
@EnableFeignClients
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }
}
