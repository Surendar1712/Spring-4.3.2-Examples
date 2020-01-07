package com.aop.xml.ex.aspects;

import org.aopalliance.intercept.Joinpoint;

public class EmployeeCRUDLoggingAspect {

  public void logBefore(Joinpoint JoinPoint) {
    System.out.println("EmployeeCRUDLoggingAspect logBefore method called");
  }
  
  public void logAfter(Joinpoint JoinPoint) {
    System.out.println("EmployeeCRUDLoggingAspect logAfter method called");
  }
}
