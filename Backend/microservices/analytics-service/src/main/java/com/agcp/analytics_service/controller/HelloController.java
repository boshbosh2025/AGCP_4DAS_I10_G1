
package com.agcp.analytics_service.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(
        name = "Analytics Service - MS6",
        description = "API de test et de supervision du microservice Analytics AGCP"
)
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Operation(summary = "Page d'accueil du microservice")
    @GetMapping("/")
    public String home() {
        return "Analytics Service MS6 is running";
    }

    @Operation(summary = "Verifier le fonctionnement du microservice")
    @GetMapping("/hello")
    public String hello() {
        return "Hello I'm service 6";
    }

    @Operation(summary = "Identifier l'instance Analytics qui repond")
    @GetMapping("/instance")
    public String instance() {
        return "Reponse de Analytics Service - Port : " + port;
    }
}
