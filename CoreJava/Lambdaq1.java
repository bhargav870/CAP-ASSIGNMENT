package first.java;

public class Lambdaq1 { 
	interface Functional{
		int myfun(int num1,int num2) ;
	 }
//        private int function(int num1,int num2,Functional function) {   // we are using constructor
//			return function.myfun(num1,num2);
        	
//        }
	public static void main(String[] args) {
		
//		Lambdaq1 obj = new Lambdaq1();
		Functional addFunction = (int num1,int num2)-> num1+num2;
		Functional substractionFunction = (int num1,int num2)-> num1-num2;
		Functional multiplicationFunction =(int num1,int num2)-> num1*num2;
		Functional division = (int num1,int num2)-> num1/num2;
//		System.out.println(obj.function(80, 20, addFunction));
//		System.out.println(obj.function(80, 20, substractionFunction));
//		System.out.println(obj.function(80, 20, multiplicationFunction));
//		System.out.println(obj.function(80, 20, division));
		System.out.println(addFunction.myfun(80, 20));
		System.out.println(substractionFunction.myfun(80, 20));
		System.out.println(multiplicationFunction.myfun(80, 20));
		System.out.println(division.myfun(80, 20));
		
	}
 
}
