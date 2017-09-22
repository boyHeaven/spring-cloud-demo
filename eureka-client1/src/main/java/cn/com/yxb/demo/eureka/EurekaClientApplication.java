package cn.com.yxb.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/9/21.
 *
 * @author frank.
 */
@SpringBootApplication
@ComponentScan(basePackages = "cn.com.yxb.demo")
@EnableEurekaClient
@RestController
public class EurekaClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);

    }

    @RequestMapping("/findByName")
    public String home(@RequestParam(value = "name") String name) {

        return "client1=======" + name;
    }
}
