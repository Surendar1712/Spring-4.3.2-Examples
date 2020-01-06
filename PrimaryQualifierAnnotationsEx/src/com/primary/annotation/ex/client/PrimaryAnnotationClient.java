package com.primary.annotation.ex.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.primary.annotation.ex.beans.User;
import com.primary.annotation.ex.conf.PrimaryAnnotationApplicationConfig;

/**
 * Here @Primary annotation is used to specify the primary bean to inject and
 * leave the remaining un-registered. * (i.e.) If we have two types of beans
 * registered for same class type then it will create ambiguity and will throw
 * below error while if we try to access it. This below problem occurs only if
 * we access the bean through type (i.e.) appContext.getBean(User.class).
 * 
 * If we access through appContext.getBean("userSurendar") then this problem
 * won't occur
 * 
 * Error - Exception in thread "main"
 * org.springframework.beans.factory.NoUniqueBeanDefinitionException: No
 * qualifying bean of type [com.primary.annotation.ex.beans.User] is defined:
 * expected single matching bean but found 2: userDeepan,userSurendar
 * 
 * To solve this above problem we have to specify which is the primary bean
 * which needs to be loaded to the container. Then if we access the bean in the
 * context the container will return the primary bean which has been registered
 * or loaded in the container.
 * 
 * @author Surendar
 *
 */
public class PrimaryAnnotationClient {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
    appContext.register(PrimaryAnnotationApplicationConfig.class);
    appContext.refresh();

    User user = appContext.getBean(User.class);
    System.out.println(user);
    appContext.close();
  }
}
