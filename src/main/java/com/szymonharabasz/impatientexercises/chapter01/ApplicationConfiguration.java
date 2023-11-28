package com.szymonharabasz.impatientexercises.chapter01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public Chapter01Service chapter01Service() {
        return new Chapter01Service();
    }
}
