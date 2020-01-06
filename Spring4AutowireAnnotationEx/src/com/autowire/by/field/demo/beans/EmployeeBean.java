package com.autowire.by.field.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {

  private int employeeId;

  private String employeeName;

  // If we declare @Autowired then the default value for required attribute value is "true" in case if we don't pass the value. Then in that case if we don't have any matching bean for that bean then it will throw the below error. 
  // Error - No qualifying bean of type [com.autowire.by.name.demo.beans.DepartmentBean] found for dependency
  // If we declare required = false then it won't throw any error
  @Autowired(required = true)
  private DepartmentBean departmentBean;

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

  @Override
  public String toString() {
    return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", departmentBean="
        + departmentBean + "]";
  }

}
