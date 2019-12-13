package com.zking.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${config.hello}")
    private  String msg;


    @RequestMapping("/hello")
    public  String hello(){
        return  "你好，我是配置中心客户端"+msg;
    }
}
