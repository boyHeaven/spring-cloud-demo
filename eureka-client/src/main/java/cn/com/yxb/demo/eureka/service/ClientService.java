package cn.com.yxb.demo.eureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2017/9/21.
 *
 * @author frank.
 */
@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;

    // PROVIDER-DATA

    public String findByName(String name) {
        return restTemplate.getForObject("http://PROVIDER-DATA/findByName?name=" + name, String.class);
    }

}
