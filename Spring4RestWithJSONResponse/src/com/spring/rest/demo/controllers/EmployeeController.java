package com.spring.rest.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.spring.rest.demo.beans.Employee;
import com.spring.rest.demo.beans.EmployeeVO;

@RestController
public class EmployeeController {

  @RequestMapping(value = { "/employee-list" }, method = RequestMethod.GET)
  public EmployeeVO getEmployeeList() {
    System.out.println("getEmployeeList");
    EmployeeVO employeeVO = new EmployeeVO();
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(100, "Surendar", "surendar@test.com"));
    employeeList.add(new Employee(101, "Vivek", "vivek.b@test.com"));
    employeeList.add(new Employee(102, "Sushmanth", "sushmanth@test.com"));
    employeeVO.setEmployeeList(employeeList);
    return employeeVO;
  }

  @RequestMapping(value = "/employee-by-id/{employeeId}", method = RequestMethod.GET)
  public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
    System.out.println("getEmployeeById");
    return new Employee(100, "Surendar", "surendar@test.com");
  }
}
