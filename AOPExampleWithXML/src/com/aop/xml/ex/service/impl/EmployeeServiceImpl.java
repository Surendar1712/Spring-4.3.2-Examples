package com.aop.xml.ex.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.aop.xml.ex.beans.Employee;
import com.aop.xml.ex.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {

  public static Map<Integer, Employee> employeeMap = new HashMap<>();
  
  @Override
  public Employee getEmployeeById(int employeeId) {
    System.out.println("getEmployeeById method called");
    return employeeMap.get(employeeId);
  }

  @Override
  public boolean addEmployee(Employee employee) {
    System.out.println("addEmployee method called");
    employeeMap.put(employee.getEmployeeId(), employee);
    return true;
  }

  @Override
  public boolean deleteEmployee(int employeeId) {
    System.out.println("deleteEmployee method called");
    employeeMap.remove(employeeId);
    return true;
  }

  @Override
  public List<Employee> getAllEmployee() {
    System.out.println("getAllEmployee method called");    
    return (List<Employee>) employeeMap.values();
  }

}
