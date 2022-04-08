package first.java;

public class SiCi {

	public double simpleInterest(double principalAmount,int time,double interestRate){
	 
	  
	   double p = principalAmount;
	   int n =  time;
	   double r = interestRate;
	   
	   double si =(p*r*n)/100;
	   System.out.println(si);
	return si;
	}
	public double compoundInterest(double principalAmount,int time,double interestRate){
		
		double P = principalAmount;
		int n = time;
		double r = interestRate;
		
		double ci = P*(Math.pow(1+(r/100), n))-P;   //math is used to give power 
		 System.out.println(ci);
			return ci;

	}
}
