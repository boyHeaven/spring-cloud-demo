package cn.com.yxb.demo.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created on 2017/9/22.
 *
 * @author frank.
 */
@FeignClient(value = "CLIENT1")
public interface FeignClientService {

    @RequestMapping(value = "/findByName")
    String findByName(@RequestParam(value = "name") String name);

}
