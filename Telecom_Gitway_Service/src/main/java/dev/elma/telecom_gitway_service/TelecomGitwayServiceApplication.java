package dev.elma.telecom_gitway_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TelecomGitwayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelecomGitwayServiceApplication.class, args);
    }
    @Bean
    RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route(r->r.path("/clients/**").uri("http://localhost:8089"))
                .route(r->r.path("/subscribers/**").uri("http://localhost:8089"))
                .build();
    }

}
