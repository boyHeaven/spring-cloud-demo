package cn.com.yxb.demo.eureka;

import cn.com.yxb.demo.eureka.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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


    @Autowired
    private ClientService clientService;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);

    }

    @RequestMapping("/findByName/{name}")
    public String home(@PathVariable(value = "name") String name) {
        return clientService.findByName(name);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
