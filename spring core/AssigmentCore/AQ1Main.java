package org.Bhargav.AssigmentCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AQ1Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Question1.xml");
        //ApplicationContext context=new ClassPathXmlApplicationContext("Assignment1.xml");
        CustomerAq1 obj=(CustomerAq1) context.getBean("customer"); // here we are calling bean
        obj.details();

	}

}
