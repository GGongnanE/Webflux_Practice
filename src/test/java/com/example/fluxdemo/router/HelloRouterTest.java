package com.example.fluxdemo.router;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloRouterTest {
    @Resource
    WebTestClient webTestClient;

    @Test
    void testHello() {
        webTestClient.get().uri("/hello")
                .accept(MediaType.TEXT_PLAIN).exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello, Spring!");
    }
}