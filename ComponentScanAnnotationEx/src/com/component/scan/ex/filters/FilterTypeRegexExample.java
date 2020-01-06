package com.component.scan.ex.filters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import com.component.scan.ex.util.Util;

@Configuration
@ComponentScan(basePackages = {"com.component.scan"},  useDefaultFilters = false, includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*[12]"), 
  excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = FilterTypeAssignableExample2.class))
public class FilterTypeRegexExample {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeRegexExample.class);
    Util.printBeanNames(context);
    context.close();
  }
}