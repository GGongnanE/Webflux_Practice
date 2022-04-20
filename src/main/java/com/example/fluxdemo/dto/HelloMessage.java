package com.example.fluxdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class HelloMessage {

    private String to;
    private String job;  // info Server에서 가져온 job
    private String message;
}
