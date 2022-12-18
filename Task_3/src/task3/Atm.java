package task3;
import java.util.*;
public class Atm {

	public static void main(String[] args) {
		int balance = 10000, withdraw, deposit;
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
          
        while(true)  
        {  
            System.out.println("**********ATM Machine********** \n");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Current Balance");  
            System.out.println("Choose 4 for Terminate\n");  
            System.out.print("Choose the operation:"); 
            int choice = sc.nextInt();
            
            switch(choice) {
            case 1:
            	System.out.println("Enter amount to withdraw: ");
            	withdraw = sc.nextInt();
            	if(balance >= withdraw) {
            		balance = balance - withdraw;
            		System.out.println("Kindely collect your money");;
            	}
            	else {
            		System.out.println("Insufficient balance");
            	}
            	System.out.println("");
            	break;
            case 2:
            	System.out.println("Enter amount to be deposited: ");
            	deposit = sc.nextInt();
            	balance = balance + deposit;
            	System.out.println("Your amount has been succesfully deposited");
            	System.out.println("");
            	break;
            case 3:
            	System.out.println("Current Balance: "+balance);
            	System.out.println("");
            	break;
            case 4:
            	System.exit(0);
            default:
            	System.out.println("Select the correct options");
            }
	    }
    }
}