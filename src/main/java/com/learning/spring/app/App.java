package com.learning.spring.app;

import com.learning.spring.config.AppConfig;
import com.learning.spring.config.AppXmlConfig;
import com.learning.spring.config.LazyAppConfig;
import com.learning.spring.model.furniture.Bed;
import com.learning.spring.model.greetings.HelloWorld;
import com.learning.spring.model.scope.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        int number = 2;
        System.setProperty("numberul.meu", String.valueOf(number));
        System.setProperty("java.acasa","Some path to Java Home");

        //ApplicationContext applicationContext =new AnnotationConfigApplicationContext(AppConfig.class, LazyAppConfig.class, AppXmlConfig.class);
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(AppConfig.class, LazyAppConfig.class);


        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.greet();

        CustomerService c1=applicationContext.getBean(CustomerService.class);
        c1.setMessage("customer service 1");

        CustomerService c2 = applicationContext.getBean(CustomerService.class);
        c2.setMessage("customer service 2");

        CustomerService c3=applicationContext.getBean(CustomerService.class);

        System.out.println(String.format("c1=%s",c1.toString()));
        System.out.println(String.format("c2=%s",c2.toString()));
        System.out.println(String.format("c3=%s",c3.toString()));


        System.out.println("print bean definition names:");
        for(String beanName:applicationContext.getBeanDefinitionNames()){
            System.out.println(
                    String.format("bean name=%s, bean object=%s",
                            String.format("%100s",beanName),
                            String.format("%s",applicationContext.getBean(beanName).toString())
                    ));
        }

        //Bed bed = applicationContext.getBean(Bed.class);



    }
}
