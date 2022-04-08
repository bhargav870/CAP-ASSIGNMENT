package first.java;

public class Assigment1Q5 {
	public double calculateTaxAmount(int ctc){
          if(ctc<180000) {
        	  System.out.println("Tax payable is NIL");
          }
               else if(ctc>=180000 && ctc<=300000) {
            	   double Tax = (ctc*10)/100 ;
               System.out.println ( Tax ); 
               }
          else if(ctc>=300001 && ctc<=500000) {
        	  double Tax = (ctc*20)/100 ;
                System.out.println(Tax); 
                         }
          else if(ctc>=500001 && ctc<=1000000) {
        	  double Tax = (ctc*30)/100 ;
                System.out.println(Tax); 
                         }
          return ctc;
		
	}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 Assigment1Q5 obj = new Assigment1Q5(); // first we call class 
    	 obj.calculateTaxAmount(800000); // then we call method and pu values according to need 
    			 
    	 

	}

}
