package com.jnsoft.dockerizedspringbootapp.config;

import com.jnsoft.dockerizedspringbootapp.dto.config.GreetingConfigDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

    @Bean
    @ConfigurationProperties(prefix = "dockerized.springboot.app")
    public GreetingConfigDto getGreetingConfig() {
        String basicMessage = System.getenv(GreetingConfigDto.GREETING_ENV_MESSAGE_VAR);
        GreetingConfigDto greetingConfigDto = new GreetingConfigDto();

        if(basicMessage != null)
            greetingConfigDto.setBasicMessage(basicMessage);

        return greetingConfigDto;
    }
}
