package com.imooc.config.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RefreshController {

    @GetMapping("getGitConfig")
    public String getGitConfig() {
        return "ok";
    }
}
