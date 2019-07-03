package com.machpay.socialauthentication;

import com.machpay.socialauthentication.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SocialAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialAuthenticationApplication.class, args);
    }

}
