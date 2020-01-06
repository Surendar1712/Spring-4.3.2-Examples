package com.qualifier.annotation.ex.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.qualifier.annotation.ex.component.UserComponent;
import com.qualifier.annotation.ex.conf.QualifierAnnotationApplicationConfig;

/**
 * Here inside the UserComponent we are autowiring the user bean type. But in
 * the QualifierAnnotationApplicationConfig class we have configured two beans.
 * So, if we access the context then we will get two beans and then it will
 * create a ambiguity. So, it will throw below error.
 * 
 * Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException:
 * No qualifying bean of type [com.primary.annotation.ex.beans.User] is defined:
 * expected single matching bean but found 2: userDeepan,userSurendar
 * 
 * To solve this issue we can specify @Qualifier annotation below the @Autowired
 * annotation in the UserComponent class with qualifier bean name. Then it will
 * inject the corresponding bean in the UserComponenet class. So, we can access
 * the UserComponent class.
 * 
 * Difference between @Primary and @Qualifier is that in primary annotation only
 * one primary bean is injected in the container. But in the case of qualifier
 * annotation the container will contain two beans. But we will specify which
 * bean we need through @Qualifier annotation.
 * 
 * Also, we can't use the @Qaulifier in case of configuration class.
 * Since @Qaulifier will be used to specify which bean we need incase of
 * ambiguity created by multiple beans present in the container with same type
 * 
 * @author Surendar
 *
 */
public class QualifierAnnotationClient {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
    appContext.register(QualifierAnnotationApplicationConfig.class);
    appContext.refresh();

    UserComponent userComponent = appContext.getBean(UserComponent.class);
    userComponent.doSomething();
    appContext.close();
  }
}
