package com.agcp.Authservice.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class hellocontroller {

        @GetMapping("/hello")
        public String hello() {
            return "Hello I'm Auth Service (MS1)";
        }

}