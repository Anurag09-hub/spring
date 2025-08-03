package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
        Empy empy = (Empy) context.getBean("employee");
        System.out.println(empy.getName());
        System.out.println(empy.getPhones());
        System.out.println(empy.getAddresses());
        System.out.println(empy.getCourses());
        System.out.println(empy.getProps());     
    }

}
