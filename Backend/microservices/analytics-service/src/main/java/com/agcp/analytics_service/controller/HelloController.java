
package com.agcp.analytics_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Analytics Service MS6 is running";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello I'm service 6";
    }
}
