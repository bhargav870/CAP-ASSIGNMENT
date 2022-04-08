package first.java;

import java.util.ArrayList;

public class Assignment2Q3 {

    public int totalCashInBank(ArrayList<Integer> cash){
    	System.out.println( cash );
    	return 0;
	 }
	    public int getCash(){
			return 0;
	    	
	    }
	    public static void main(String[] args) {
	    	CurrentAccount obj = new CurrentAccount();
	    	obj.getCash();
	    	ArrayList<Integer> Current = obj.C1;
	    	SavingsAccount obj1 = new SavingsAccount();
	    	obj1.getCash();
	    	ArrayList<Integer> Savings = obj1.C2;
	    	Assignment2Q3 obj3 = new Assignment2Q3();
	    	obj3.totalCashInBank(Current);
	    	obj3.totalCashInBank(Savings);
	    }
	
	
	static class CurrentAccount extends Assignment2Q3{
		ArrayList<Integer> C1 = new ArrayList<>();
		int totalDeposits = 10000;
	    int creditLimit = 2000;
	    
	    @Override
	    public int getCash() {
	        int Cash = totalDeposits + creditLimit;
	    	C1.add(Cash);
	    	System.out.println("total cash in bank" + Cash); 
	        return Cash;
	       }
	    }
		static class SavingsAccount extends Assignment2Q3 {
			ArrayList<Integer> C2 = new ArrayList<>();
		    int totalDeposits = 10000;
		    int fixedDepositAmount = 5000;
		    @Override
		    public int getCash() {
		     	int Cash = totalDeposits + fixedDepositAmount;
		    	C2.add(Cash);
		    	System.out.println("total cash in bank" +Cash );
				return Cash;
		           }
		    	}
		    }	
    	