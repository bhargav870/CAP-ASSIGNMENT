package first.java;

import java.util.ArrayList;

public class Assignment2Q2 {
// employee = assignment2q2 acc. to ques.
       int salary = 10000;
	    public int getSalary(int salary){
	    	
	    return 0;
	    }
	    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
	    	System.out.println(employeeSalaries);
			return salary;
	    
	    }
	    public static void main(String[] args) {
	     // we are defining managers salary over here and importing that array list from manager class
	    	Manager obj = new Manager();
	    	obj.getSalary(10000);
	    	ArrayList<Integer>Mana = obj.A1;
	    	
	    	// now we are defining labours salary and importing that array list from labour class
	    	Labour obj1 = new Labour();
	    	obj1.getSalary(10000);
	    	ArrayList<Integer>Labo = obj1.A2;
	    	
	    	//main class is being CALLED and updated with salaries of both mana and labo array list over here 
	    	Assignment2Q2 obj3 = new Assignment2Q2();
	    	obj3.totalEmployeesSalary(Mana);
	    	obj3.totalEmployeesSalary(Labo);
	    }
	  static class Manager extends Assignment2Q2 {
	    
	  // we are making array list were we can put our all managers salary including incentives
		  ArrayList<Integer>A1= new ArrayList();
	  
		  @Override
		    public int getSalary(int salary) {
		        int incentive = 5000;
			salary += incentive ;
			A1.add (salary);
			System.out.println("salary with incentive"+salary);
		    
		  return 0;
		  }
	  }
	 static class Labour extends Assignment2Q2 {
		 // we are making array list were we can put our all laboures salary including overtime
		  ArrayList<Integer>A2= new ArrayList();
	  
		  @Override
		    public int getSalary(int salary) {
		        int overtime = 500;
		        // += this is used to add salary to icentive directly and created array list and added that salary to array list 
		        salary += overtime;
		        A2.add (salary);
		        System.out.println("salary with overtime"+salary);
		        return 0;
	  }
	  }
	    }

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


