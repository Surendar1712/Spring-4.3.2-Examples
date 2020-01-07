package com.aop.xml.ex.aspects;

import org.aopalliance.intercept.Joinpoint;

public class EmployeeCRUDTransactionAspect {

  public void getEmployeeById(Joinpoint joinPoint) {
    System.out.println("EmployeeCRUDTransactionAspect getEmployeeById method called");
  }
}
