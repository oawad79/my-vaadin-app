package com.osama.app.backend;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.osama.app.backend.service"})
@EntityScan(basePackages = {"com.osama.app.backend.domain"})
public class AppConfig {
}
