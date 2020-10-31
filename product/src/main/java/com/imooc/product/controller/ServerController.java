package com.imooc.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @Value("${msg:\"\"}")
    private String msg;

    @GetMapping("/msg")
    public String msg() {
        return "this is product msg" + msg;
    }
}
