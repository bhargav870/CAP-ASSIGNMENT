package first.java;

//import java.util.Scanner;


public class ArmstrongOrNot {
   
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Scanner sc = new Scanner(System.in);
public boolean armstrongCheck(int num) {
//System.out.println("Enter number");
//int n = sc.nextInt();
//int n= num;
int n =num;
int sum = 0;
int r;
while(num>0)
{
    r=num%10;    // this gives remainder % modulus
    num=num/10;   //  first 371%10 = 1 and its added in sum 1^3 = 1 again added to  gives 371/10 gives 37 and the again taken in r
    sum=sum+(r*r*r);
}

	if(n==sum)
{
    System.out.println("Is a Armstrong number");
}
else
{
    System.out.println("Is not a Armstrong number");
}
	return true;
		}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArmstrongOrNot obj = new ArmstrongOrNot();
	obj.armstrongCheck(371);
}
}

	
