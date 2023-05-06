package com.jnsoft.dockerizedspringbootapp.controller.impl;

import com.jnsoft.dockerizedspringbootapp.controller.IGreetingController;
import com.jnsoft.dockerizedspringbootapp.dto.web.GreetingResponseDto;
import com.jnsoft.dockerizedspringbootapp.service.IGreetingService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/docker-springboot-app/api")
public class GreetingControllerImpl implements IGreetingController {
    private final IGreetingService greetingService;

    public GreetingControllerImpl(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public GreetingResponseDto getGreeting(String greeting) {
        return greetingService.getGreeting(greeting);
    }
}
