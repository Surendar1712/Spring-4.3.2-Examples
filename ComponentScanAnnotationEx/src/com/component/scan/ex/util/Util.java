package com.component.scan.ex.util;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;

public class Util {

  public static void printBeanNames(ApplicationContext context) {
    String[] beanNames = context.getBeanDefinitionNames();
    Arrays.stream(beanNames).filter(n -> !n.contains("springframework")).forEach(System.out::println);
  }
}
