package org.Bhargav.AssigmentCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1Q5main {
  public static void main(String[] args) {
    ApplicationContext context= new ClassPathXmlApplicationContext("Assignment1Q5.xml");
    Assignment1Q5point obj=(Assignment1Q5point) context.getBean("point");
    obj.getX();
    System.out.println(obj.getX()+" "+obj.getY());
  }
}

