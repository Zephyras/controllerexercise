package com.codepresso.controllerexercise.config;

import com.codepresso.controllerexercise.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//설정정보 어너테이션
@Configuration
public class AppConfig {

    @Bean
    public PostService postService2() {
        return new PostService();
    }
}
