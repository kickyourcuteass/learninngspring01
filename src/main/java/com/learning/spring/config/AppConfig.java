package com.learning.spring.config;

import com.learning.spring.model.experiment.autowire.Foo;
import com.learning.spring.model.furniture.Shelves;
import com.learning.spring.model.greetings.HelloWorld;
import com.learning.spring.model.greetings.HelloWorldMessageProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {
        "com.learning.spring.model.animals",
        "com.learning.spring.model.rose",
        "com.learning.spring.model.entertainment",
        "com.learning.spring.model.scope",
        "com.learning.spring.model.simpleconfig",
        "com.learning.spring.model.experiment.autowire"},
        basePackageClasses = {
                HelloWorldMessageProvider.class
        }
)
public class AppConfig {
    @Value("#{injectSimpleConfig.age}")
    private int age;

    @Value("#{injectSimpleConfig.name}")
    private String name;

    @Value("#{injectSimpleConfig.height}")
    private float height;

    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;

    @Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

    @Value("defaultStringValue")
    private String defaultStringVar;

    @Value("true")
    private boolean defaultBooleanVar;

    @Value("10")
    private int defaultIntVar;

    @Value("${APP_NAME_NOT_FOUND:defaultAppName}")
    private String defaultAppName;

    @Value("${java_home:defaultJavaHomeSystemEnv}")
    private String javaHomeSystemEnv;

    @Value("#{systemProperties['java.acasa']}")
    private String javaHomeSystemProp;

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public Shelves shelves(@Value("${numberul.meu}") int number) {
        return new Shelves(number);
    }

    @Bean(name="studentDetailsMap")
    public Map<String,String> studentDetailsMap(){
        Map<String,String> m = new HashMap<>();
        m.put("firstName","ioana");
        m.put("lastName","padureanu");
        m.put("age","34");
        m.put("homeTown","bucharest");
        m.put("hobby","sobolaneala");

        return m;
    }

    @Bean(name="bookDetailsMap")
    public Properties bookDetailsMap(){
        Properties m = new Properties();
        m.put("name","Pro Spring 5: An In-Depth Guide to the Spring Framework and Its Tools (Paperback)");
        m.put("published"," October 17th 2017 by Apress");
        m.put("noOfPages","Paperback, 849 pages");
        m.put("Author(s)","Iuliana Cosmina");
        m.put("ISBN","1484228073 (ISBN13: 9781484228074)");
        m.put("averageRating","4.04 (23 ratings)");
        return m;
    }

    @Bean
    public Properties properties(){
        Properties p=new Properties();
        p.put("FileName","ioana.txt");
        p.put("fileSize","23KB");
        p.put("filePath","C:\\");
        return p;
    }

    @Bean
    public Foo fooOne(){
        return new Foo();
    }

    @Bean
    public Foo fooTwo(){
        return new Foo();
    }





//    @Bean
//    public HelloWorldMessageProvider helloWorldMessageProvider(){
//        return new HelloWorldMessageProvider();
//    }
//
//    @Bean
//    public StandardOutMessageRenderer standardOutMessageRenderer(){
//        return new StandardOutMessageRenderer();
//    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", programmer=" + programmer +
                ", ageInSeconds=" + ageInSeconds +
                ", defaultStringVar='" + defaultStringVar + '\'' +
                ", defaultBooleanVar=" + defaultBooleanVar +
                ", defaultIntVar=" + defaultIntVar +
                ", defaultAppName='" + defaultAppName + '\'' +
                ", javaHomeSystemEnv='" + javaHomeSystemEnv + '\'' +
                ", javaHomeSystemProp='" + javaHomeSystemProp + '\'' +
                '}';
    }
}
