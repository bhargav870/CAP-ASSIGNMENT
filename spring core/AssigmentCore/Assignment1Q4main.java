package org.Bhargav.AssigmentCore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Assignment1Q4main {
  public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(Assignment1Q4main.class,args);
      Assignment1Q4 obj= context.getBean(Assignment1Q4.class); // here we are calling class
    obj.details();
//     System.out.println(obj); //when we want to run bean use this 
  }
}


