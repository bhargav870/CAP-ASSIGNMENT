package org.Bhargav.AssigmentCore;

import javax.inject.Named;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
	
	
	//@Repository
	//@Service
	@Component    // it acts as bean like we have done earlier in xml
//    @Named
	public class Assignment1Q4point {
	   private Integer X=10; // Here we are using only annotation in this so no xml is there 
	   // thats why we are defining here
	
	    public Integer getX() {
	        return X;
	    }
	
	    public void setX(Integer x) {
	        X = x;
	    }
	}

