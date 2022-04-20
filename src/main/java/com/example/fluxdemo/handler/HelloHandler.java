package com.example.fluxdemo.handler;

import com.example.fluxdemo.dto.HelloMessage;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 *  handler : 요청을 처리하고 응답을 생성한다.
 */
@Component
public class HelloHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {

        String name = request.queryParam("name").get();
        String message = "hello " + name;

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(new HelloMessage(name, message)));
    }
}
