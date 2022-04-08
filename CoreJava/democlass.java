package first.java;

import java.util.Scanner;

public class democlass {
	public boolean ArmstrongOrNot(int num) {
		
		int n = num;
		int sum=0;
		int r;
		while(num>0) {
		r = num%10; // this gives remainder
	//	num = num/10; // 
		sum = sum+(r*r*r) ;
		num = num/10;
		}
		
		return false;
	}
	
  
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// strings
/*String name1 = "Aman";
String name2 = "bhargav";
String name3 = name1 +"And" + name2;
System.out.println(name3);*/
		//Arrays example
//int age = 12;
//int phy = 34;
//int chem = 19;
//int eng = 98;
// int[] marks = new int[3];
// marks[0] = 34;
// marks[1] = 19;
// marks[2] = 98;
// 
//System.out.println(marks[0]);
    //// sort 
//Arrays.sort(marks);
//System.out.println(marks[0]);
		
      ////2D arrays 
//	int[] marks = {97,98,95};
// 
//	int[][] finalMarks ={{97,98,95},{95,95,98}};
//  System.out.println(finalMarks[0][1]);
    //operators
		//mathoperator
//System.out.println(Math.max(5, 6));
     //boolean operator example
//  boolean isSunUp = true;
//  if(isSunUp == true)
//	  System.out.println("day");
//  else
//	  System.out.println("night");
		//logical operator
		//&& // ||
//		int a = 30;
//		int b = 40;
//		
//		if(a < 50 && b < 50)
//		//if(a < 50 || b < 50)
//      System.out.println("both less than 50"); 
//		//System.out.println("atleast one less than 50");
		// switch case
//		int day = 2; //1-monday;2-tuesday
//		switch(day) {
//		case 1 :
//			System.out.println("monday");
//			break;
//		case 2 :
//			System.out.println("tuesday");
//			break;
//		default:
//			System.out.println("wed - sun");
		// loops 
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
		// 1-100
	//	for(int i = 100; i >=1;i=i-1) {
	//		System.out.println(i);
		// while loop 
	//	}
		  // do while loop
//		Scanner sc = new Scanner(System.in);
//		int number = 0;
//		do { 
//			System.out.println("input a number");
//			number = sc.nextInt();
//			System.out.println("here is your number");
//			System.out.println(number);
//		}	while(number >= 0);
//		System.out.println("The End");
			//BREAK & CONTINUE
//		int i = 0;
//		while(true) {
//			if(i ==3) {
//				i=i+1;
//				continue;
//			}
//  System.out.println(i);
//  i = i+1;
//   if(i>5) {
//	break;
//}
		//TRY - catch in exception handling
//	int[] marks = {97,98,95};
//	try {
//		System.out.println(marks[5]);
//	}catch(Exception exception) {
//		//do something after catching
//	}
//		System.out.println("The name is Aman");
		
		
		}
		}
	

