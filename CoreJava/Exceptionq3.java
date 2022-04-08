package first.java;

import java.util.Scanner;

public class Exceptionq3{
    public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException {

        System.out.println("Available balance = "+withdraw());
    }

    static double withdraw() throws InsufficientBalanceException, IllegalBankTransactionException {

        double balance = 2000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amount to withdraw : ");
        double withdrawAmount = scan.nextDouble();

        if (withdrawAmount<0)
            throw new IllegalBankTransactionException ("Illegal Bank Transaction");
        else if (balance<withdrawAmount || balance==0)
            throw new InsufficientBalanceException("Insufficient Balance");
        return (balance-withdrawAmount);

    }
}
/////
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}
 class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException(String message){
        super(message);
    }

}