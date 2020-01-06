package com.component.scan.ex.filters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import com.component.scan.ex.beans.MyBean1;
import com.component.scan.ex.beans.MyBean3;
import com.component.scan.ex.util.Util;

@Configuration
@ComponentScan(basePackages = {"com.component.scan"},  useDefaultFilters = false, includeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { MyBean1.class, MyBean3.class }) })
public class FilterTypeAssignableExample {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeAssignableExample.class);
    Util.printBeanNames(context);
    context.close();
    // output ==> filterTypeAssignableExample, myBean1, myBean3, myBean4
    // Here it will return myBean4 as well since the filter by ASSIGNABLE_TYPE is used to scan the packages or classes using Class#isAssignableFrom
    // (i.e.) My Bean3. class. is Assignable From( My Bean4. class) returns true
    // Here also it prints filterTypeAssignableExample as well in the output. It's not like that it is also scanned.
    // Actually it's not scanned. It has been registered by the below statement using AnnotationConfigApplicationContext
    // AnnotationConfigApplicationContext(FilterTypeAssignableExample.class)
  }
}