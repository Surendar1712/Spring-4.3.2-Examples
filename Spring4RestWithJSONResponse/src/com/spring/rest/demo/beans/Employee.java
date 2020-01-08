package com.spring.rest.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private int employeeId;

  private String employeeName;

  private String email;

  public Employee() {
  }

  public Employee(int employeeId, String employeeName, String email) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.email = email;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + "]";
  }

}
