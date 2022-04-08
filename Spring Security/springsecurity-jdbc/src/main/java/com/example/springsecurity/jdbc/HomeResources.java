package com.example.springsecurity.jdbc;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

	
	
	@RequestMapping(value="/")
	public String run() {
		return "Welcome";
	}
	
	
	
	 @RequestMapping(value="/user") 
	  public String run1(){ 
		  
		  return "Welcome User"; 
		  }
	  
	  @RequestMapping(value="/admin")
	  public String run2(){
		  
		  return "Welcome Admin"; 
		  }
	 
	
}