package com.ddd.addressapi.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.ddd.addressapi.core")
@EnableJpaRepositories(basePackages = "com.ddd.addressapi.repository")
public class CoreConfig {
}
