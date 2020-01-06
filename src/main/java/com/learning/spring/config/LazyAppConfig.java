package com.learning.spring.config;

import com.learning.spring.model.furniture.Bed;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class LazyAppConfig {

    @Bean
    public Bed bed(){
        return new Bed();
    }
}
