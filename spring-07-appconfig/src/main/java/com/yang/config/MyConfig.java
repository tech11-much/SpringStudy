package com.yang.config;

import com.yang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.yang")
@Import(MyConfig2.class)
public class MyConfig {
    @Bean
    User getUser(){
        return new User();
    }
}
