package com.example.fluxdemo.handler;

import com.example.fluxdemo.dto.HelloMessage;
import com.example.fluxdemo.dto.JobMessage;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 *  handler : 요청을 처리하고 응답을 생성한다.
 */
@Component
public class HelloHandler {

    // WebClient 생성
    WebClient webClient = WebClient.create("http://localhost:8099");

    public Mono<ServerResponse> hello(ServerRequest request) {

        String name = request.queryParam("name").get();
        String message = "hello " + name;

        // GET 방식 호출
        Mono<JobMessage> callInfoSvr = webClient.get().uri("/jobinfo?name=" + name)
                .retrieve()
                .bodyToMono(JobMessage.class).log();

        Mono<HelloMessage> msgData = callInfoSvr.map(
                jobMessage -> new HelloMessage(name, jobMessage.getJob(), message)).log();

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(msgData, HelloMessage.class);
    }
}
