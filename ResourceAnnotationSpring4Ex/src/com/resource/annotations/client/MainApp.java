package com.resource.annotations.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.resource.annotations.beans.BeanOne;
import com.resource.annotations.conf.ApplicationConfig;

public class MainApp {

  public static void main(String[] args) {
    System.out.println("MainApp for calling the beans");
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    BeanOne beanOne = appContext.getBean(BeanOne.class);
    beanOne.doSomething();
    appContext.close();
  }
}
