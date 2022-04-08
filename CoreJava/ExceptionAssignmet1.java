package first.java;

public class ExceptionAssignmet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		int a = 5;
		  int b = 0;
		  System.out.println(a/b);
	} catch ( ArithmeticException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		 System.out.println("Invalid Number");
	}
	}

}
