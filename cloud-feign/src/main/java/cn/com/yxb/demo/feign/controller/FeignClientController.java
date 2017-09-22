package cn.com.yxb.demo.feign.controller;

import cn.com.yxb.demo.feign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/9/22.
 *
 * @author frank.
 */
@RestController
public class FeignClientController {

    @Autowired
    private FeignClientService feignClientService;

    @RequestMapping(value = "/findByName/{name}")
    public String findByName(@PathVariable(value = "name") String name) {

        return feignClientService.findByName(name);

    }

}
