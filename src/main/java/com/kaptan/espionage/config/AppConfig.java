package com.kaptan.espionage.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "com.kaptan")
@PropertySource("classpath:git.properties")
class AppConfig {
}