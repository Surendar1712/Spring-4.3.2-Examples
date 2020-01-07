package com.aop.xml.ex.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aop.xml.ex.beans.Employee;
import com.aop.xml.ex.service.IEmployeeService;

public class AOPExWithXMLClient {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("com/aop/xml/ex/conf/appContextForAOPExWithXML.xml");
    IEmployeeService employeeService = (IEmployeeService) appContext.getBean("employeeService");
    
    employeeService.addEmployee(new Employee(100, "Surendar"));
    
    employeeService.getEmployeeById(100);
    
    appContext.close();
  }
}
