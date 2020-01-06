package com.primary.annotation.ex.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.primary.annotation.ex.beans.User;

@Configuration
public class PrimaryAnnotationApplicationConfig {

  @Bean
  @Primary  
  public User userSurendar() {
    return new User(100, "Surendar");
  }

  @Bean
  public User userDeepan() {
    return new User(101, "Deepan");
  }
}
