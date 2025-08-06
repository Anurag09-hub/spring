package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Refrence {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref.xml");
        
        A a = (A) context.getBean("aref");
        System.out.println(a);
        
        B b = (B) context.getBean("bref");
        System.out.println(b);
    }

}
