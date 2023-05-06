package com.jnsoft.dockerizedspringbootapp.dto.config;

public class GreetingConfigDto {
    private String basicMessage;
    public final static String GREETING_ENV_MESSAGE_VAR = "DOCKERIZED_SPRINGBOOT_APP_BASIC_MESSAGE";

    public GreetingConfigDto() {
    }

    public GreetingConfigDto(String basicMessage) {
        this.basicMessage = basicMessage;
    }

    public String getBasicMessage() {
        return basicMessage;
    }

    public void setBasicMessage(String basicMessage) {
        this.basicMessage = basicMessage;
    }
}
