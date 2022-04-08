package first.java;

public class ArmstrongNumBetweenRange {

	// Armstrong is not used  in less than 3 digit number
		// TODO Auto-generated method stub
	public int[] armstrongNumbersInRange(int min , int max){
		for (int i = min; i<max;i++) {
	int num =i;
	int sum = 0;
	int r;
	while(num>0)
	{
	    r=num%10;
	    num=num/10;
	    sum=sum+(r*r*r);
	}

		if(i==sum)
	{
	    System.out.println(sum);
	    
	}
		
	//	return null;
		}
		return null;
}

//public class Assignment1Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange ();
		obj.armstrongNumbersInRange ( 100 , 999 );
	}

}

