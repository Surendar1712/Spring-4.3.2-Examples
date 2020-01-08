package com.spring.rest.demo.beans;

import java.io.Serializable;
import java.util.List;

public class EmployeeVO implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  public List<Employee> employeeList;

  public List<Employee> getEmployeeList() {
    return employeeList;
  }

  public void setEmployeeList(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }

  @Override
  public String toString() {
    return "EmployeeVO [employeeList=" + employeeList + "]";
  }

}
