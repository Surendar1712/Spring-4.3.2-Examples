package com.resource.annotations.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.resource.annotations" })
public class ApplicationConfig {
}
