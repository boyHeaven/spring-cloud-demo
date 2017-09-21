package cn.com.yxb.demo.eureka;

import cn.com.yxb.demo.eureka.model.Users;
import cn.com.yxb.demo.eureka.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ProviderDataApplication {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProviderDataApplication.class, args);
    }

    @RequestMapping(value = "/findByName")
    public String findByName(@RequestParam(value = "name") String name) {

        Users users = userRepository.findByName(name);

        return users.toString();

    }
}
