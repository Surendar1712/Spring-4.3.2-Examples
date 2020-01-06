package com.qualifier.annotation.ex.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.primary.annotation.ex.beans.User;

@Component("userComponent")
public class UserComponent {

  @Autowired
  @Qualifier("userSurendar")
  public User user;

  public void doSomething() {
    System.out.println("UserComponent doSomething method :" + user);
  }
}
