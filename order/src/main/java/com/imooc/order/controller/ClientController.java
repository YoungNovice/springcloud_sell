package com.imooc.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("test")
    public Object getProductMsg() {
        // 第一种方式 通过url直接调用 如果微服务有负载这个肯定不好嘛
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://localhost:8080/msg", String.class);


        // 第二种方式 用loadBalancer获取任意一个服务的信息
        ServiceInstance product = loadBalancerClient.choose("PRODUCT");
        String host = product.getHost();
        int port = product.getPort();
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("http://%s:%s", host, port);
        String result = restTemplate.getForObject(url + "msg", String.class);

        // 第三种方式 这个restTemplate是用@LoadBalanced注解处理过的
//        String forObject = restTemplate.getForObject("http://PRODUCT/msg", String.class);

        return null;
    }
}
