package com.example.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .route(r -> r.path("/api/v1/car-service/**")
                        .uri("http://localhost:8090/")
                        .id("car-service"))
                .route(r -> r.path("/api/v1/bike-service/**")
                        .uri("http://localhost:8094/")
                        .id("bike-service"))
                .build();
    }

}
