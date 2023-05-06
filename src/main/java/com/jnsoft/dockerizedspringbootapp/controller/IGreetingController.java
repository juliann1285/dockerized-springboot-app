package com.jnsoft.dockerizedspringbootapp.controller;

import com.jnsoft.dockerizedspringbootapp.dto.web.GreetingResponseDto;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotBlank;
import javax.websocket.server.PathParam;

public interface IGreetingController {
    @GetMapping(path = "/greeting")
    GreetingResponseDto getGreeting(@NotBlank(message = "the {greeting} param must have a value") @PathParam("greeting") String greeting);
}
