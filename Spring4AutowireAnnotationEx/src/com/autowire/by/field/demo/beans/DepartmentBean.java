package com.autowire.by.field.demo.beans;

public class DepartmentBean {

  private int deptId;

  private String departmentName;

  public int getDeptId() {
    return deptId;
  }

  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public String toString() {
    return "DepartmentBean [deptId=" + deptId + ", departmentName=" + departmentName + "]";
  }

}
