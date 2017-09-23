package cn.com.yxb.demo.ribbon;

import cn.com.yxb.demo.ribbon.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2017/9/22.
 *
 * @author frank.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@ComponentScan(basePackages = "cn.com.yxb.demo")
@RestController
public class CloudRibbonApplication {

    @Autowired
    private ClientService clientService;

    public static void main(String[] args) {
        SpringApplication.run(CloudRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/findByName/{name}")
    public String findByName(@PathVariable(value = "name") String name) {

        return clientService.findByName(name);
    }
}
