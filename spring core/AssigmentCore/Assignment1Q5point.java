package org.Bhargav.AssigmentCore;

import javax.inject.Named;
import jakarta.annotation.Resource;
	
	@Named
	public class Assignment1Q5point {
	    private Integer X;
	    private Integer Y;
	
	    public Integer getX() {
	        return X;
	    }
	     @Resource(name = "point")
	    public void setX(Integer x) {
	        X = x;
	    }
	
	    public Integer getY() {
	        return Y;
	    }
	   @Resource(name = "point")
	    public void setY(Integer y) {
	        Y = y;
	    }
	
	
	
	}

