package com.component.scan.ex.filters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import com.component.scan.custom.annotation.MyAnnotation;
import com.component.scan.ex.util.Util;

@Configuration
@ComponentScan(basePackages = "com.component.scan", useDefaultFilters = false, includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyAnnotation.class) })
public class FilterTypeAnnotationExample {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
        FilterTypeAnnotationExample.class);
    Util.printBeanNames(appContext);
    appContext.close();
  }

}
