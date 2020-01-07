package com.aop.xml.ex.service;

import java.util.List;
import com.aop.xml.ex.beans.Employee;

public interface IEmployeeService {

  public Employee getEmployeeById(int employeeId);
  
  public boolean addEmployee(Employee employee);
  
  public boolean deleteEmployee(int employeeId);
  
  public List<Employee> getAllEmployee();
}
