package com.sinosafe.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class HelloController {

    @Value("${payment.username}")
    String name = "World";

    @RequestMapping("/hello")
    public String from() {
        return this.name;
    }
}