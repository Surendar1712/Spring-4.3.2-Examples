package com.component.scan.ex.filters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import com.component.scan.ex.util.Util;

@Configuration
@ComponentScan(basePackages = {"com.component.scan"},  useDefaultFilters = false, includeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, pattern = ".*[12]") })
public class FilterTypeAssignableExample2 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeAssignableExample2.class);
    Util.printBeanNames(context);
    context.close();
    // In this program it will throw below error since pattern logic is only supported for FilterType.REGEX
    // Caused by: java.lang.IllegalArgumentException: Filter type not supported with String pattern: ASSIGNABLE_TYPE
  }
}