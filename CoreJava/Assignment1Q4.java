package first.java;
import java.util.Scanner;
public class Assignment1Q4 {

	public void declareResults(double subject1Marks, double subject2Marks, double subject3Marks ) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter marks");
	   double a = sc.nextInt();
	   double b = sc.nextInt();
	   double c = sc.nextInt();
	   
		 a = subject1Marks;
		 b = subject2Marks;
		 c = subject3Marks;
		 if (a>60||b>60||c>60) {
			 System.out.println("Failed");
		 }
//		    else if (c>60) {
//			 System.out.println("Failed");
//		 }
	    else if (a+b>60||b+c>60||a+c>60) {
				 System.out.println("Passed");
			 }
//	    else if (a+c>60) {	 
//				 	 System.out.println("Passed");
//			 }
	    else if (a+b+c<60)	 {
						 System.out.println("Failed");
					 }
	   else if (a+b+c>60) {
		    	 System.out.println("Passed");
					 }
		 }
	
	public static void main(String[] args) {
		Assignment1Q4 obj = new Assignment1Q4();
		obj.declareResults(31,4,30);
		

	}

}
