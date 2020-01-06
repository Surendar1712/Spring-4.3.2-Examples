package com.resource.annotations.beans;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {

  public BeanTwo beanTwo;

  public BeanTwo getBeanTwo() {
    return beanTwo;
  }

  @Resource
  public void setBeanTwo(BeanTwo beanTwo) {
    this.beanTwo = beanTwo;
  }

  public void doSomething() {
    System.out.println("BeanOne doSomething method");
    beanTwo.doSomething();
  }

}
