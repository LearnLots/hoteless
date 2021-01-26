package com.robin.hoteless.configuration;

import com.robin.hoteless.model.AwsStuffNeeded;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwsConfig {

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Value("${auth.username}")
    private String username;

    @Value("${auth.password}")
    private String password;

    @Bean
    public AwsStuffNeeded AwsConfig() {
        return new AwsStuffNeeded(username, password);
    }

}
