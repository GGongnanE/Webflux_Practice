package com.example.fluxdemo.client;

import com.example.fluxdemo.dto.HelloMessage;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class HelloWebClient {

    // TODO : 리스너 관련 기능 디버깅 필요
    private WebClient client = WebClient.create("http://localhost:8080");
    private Mono<ClientResponse> result = client.get().uri("/hello")
            .accept(MediaType.APPLICATION_JSON).exchange();

}
