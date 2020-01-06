package com.learning.spring.model.entertainment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Properties;

@Service("mySinger")
public class Singer {

    @Autowired
    private Inspiration inspirationBean;
    private String name;

    @Autowired
    @Qualifier("studentDetailsMap")
    private Map<String,String> studentDetailsMap;

    @Autowired
    @Qualifier("bookDetailsMap")
    private Properties bookDetailsMap;

    public void sing(){
        System.out.println("..."+inspirationBean.getLyric());
    }

    public Inspiration getInspirationBean() {
        return inspirationBean;
    }

    public void setInspirationBean(Inspiration inspirationBean) {
        this.inspirationBean = inspirationBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Singer(@Value("Mariah Carey(value injected through constructor)") String name) {
        System.out.println("Singer - constructor called!");
        this.name = name;
    }

    public Map<String, String> getStudentDetailsMap() {
        return studentDetailsMap;
    }

    public void setStudentDetailsMap(Map<String, String> studentDetailsMap) {
        this.studentDetailsMap = studentDetailsMap;
    }

    public Properties getBookDetailsMap() {
        return bookDetailsMap;
    }

    public void setBookDetailsMap(Properties bookDetailsMap) {
        this.bookDetailsMap = bookDetailsMap;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "inspirationBean=" + inspirationBean +
                ", name='" + name + '\'' +
                ", studentDetailsMap=" + studentDetailsMap +
                ", bookDetailsMap=" + bookDetailsMap +
                '}';
    }
}
