package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StudentSpring.xml");
        Student obj = (Student) context.getBean("student");
        System.out.println(obj);
    }
}
