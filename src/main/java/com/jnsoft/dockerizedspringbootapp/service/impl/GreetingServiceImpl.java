package com.jnsoft.dockerizedspringbootapp.service.impl;

import com.jnsoft.dockerizedspringbootapp.dto.config.GreetingConfigDto;
import com.jnsoft.dockerizedspringbootapp.dto.web.GreetingResponseDto;
import com.jnsoft.dockerizedspringbootapp.service.IGreetingService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class GreetingServiceImpl implements IGreetingService {

    private final GreetingConfigDto greetingConfigDto;

    public GreetingServiceImpl(GreetingConfigDto greetingConfigDto) {
        this.greetingConfigDto = greetingConfigDto;
    }

    @Override
    public GreetingResponseDto getGreeting(String greeting) {
        GreetingResponseDto greetingResponseDto = new GreetingResponseDto();
        greetingResponseDto.setGreeting(String.format(greetingConfigDto.getBasicMessage(),greeting));
        return greetingResponseDto;
    }
}
