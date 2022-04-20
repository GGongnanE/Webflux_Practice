package com.example.fluxdemo;

import com.example.fluxdemo.client.HelloWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FluxdemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(FluxdemoApplication.class, args);

		HelloWebClient client = new HelloWebClient();
		System.out.println("client.getResult() = " + client.getResult());
	}

}
