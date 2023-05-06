package com.jnsoft.dockerizedspringbootapp.service;

import com.jnsoft.dockerizedspringbootapp.dto.web.GreetingResponseDto;

import javax.validation.constraints.NotBlank;

public interface IGreetingService {
    GreetingResponseDto getGreeting(@NotBlank String greeting);
}
