package com.qualifier.annotation.ex.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.primary.annotation.ex.beans.User;

@Configuration
@ComponentScan(basePackages = { "com.qualifier.annotation" })
public class QualifierAnnotationApplicationConfig {

  @Bean
  public User userSurendar() {
    return new User(100, "Surendar");
  }

  @Bean
  public User userDeepan() {
    return new User(101, "Deepan");
  }
}
