package com.mur073.operations.config;

import com.mur073.operations.web.CardApi;
import com.mur073.operations.web.CardApiImpl;
import com.mur073.operations.web.UserApi;
import com.mur073.operations.web.UserApiImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    CardApi cardApi() {
        return new CardApiImpl();
    }

    @Bean
    UserApi userApi() {
        return new UserApiImpl();
    }
}

