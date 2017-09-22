package cn.com.yxb.demo.ribbon.service;

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

    public String findByName(String name) {

        return restTemplate.getForObject("http://CLIENT1/findByName?name=" + name, String.class);
    }

}
