package com.jnsoft.dockerizedspringbootapp.dto.web;

import com.jnsoft.dockerizedspringbootapp.dto.ResponseBasicDto;

public class GreetingResponseDto extends ResponseBasicDto {


    private String greeting;

    public GreetingResponseDto() {
        super();
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
