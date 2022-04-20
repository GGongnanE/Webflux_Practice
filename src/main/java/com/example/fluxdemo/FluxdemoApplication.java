package com.example.fluxdemo;

import com.example.fluxdemo.client.HelloWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FluxdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FluxdemoApplication.class, args);
    }
}
