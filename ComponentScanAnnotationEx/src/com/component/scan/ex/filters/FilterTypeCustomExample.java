package com.component.scan.ex.filters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import com.component.scan.custom.filter.MyTypeFilter;
import com.component.scan.ex.util.Util;

@Configuration
@ComponentScan(basePackages = "com.component.scan", useDefaultFilters = false, includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class))
public class FilterTypeCustomExample {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FilterTypeCustomExample.class);
    Util.printBeanNames(context);
    context.close();
  }
}