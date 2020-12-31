package com.robin.hoteless.App;

import com.robin.hoteless.Configuration.AwsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Authentication {

    @Autowired
    private AwsConfig myAwsConfig;

    public String showAuth() {
       return String.format("Authentication: user/%s, pass/%s", myAwsConfig.getUsername(), myAwsConfig.getPassword());
    }
}
