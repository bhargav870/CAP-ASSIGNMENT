package org.Bhargav.AssigmentCore;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
  @Component
//  @Controller
//  @Repository
//  @Service
//  @Configuration // when we use @bean or want create bean like this we use this annotation
//  @Named
public class Assignment1Q4 {
//   @Bean // In this we make object of required class and we call in required class as given
//   public Assignment1Q4point getobj(){
//      return new Assignment1Q4point();
//    }
   @Inject //it is used instead of @Autowired
//	  @Autowired
   private Assignment1Q4point point;

   public Assignment1Q4point getPoint() {
       return point;
   }

   public void setPoint(Assignment1Q4point point) {
       this.point = point;
   }
   public void details(){
       System.out.println(point.getX());
   }
}

