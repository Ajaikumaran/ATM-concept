package programs;
import java.util.*;
public class Bank {
	public static void main(String argd[]) {
	int balance=10000,amt,pass,dep=0;
	int new_bal=0,pin;
	int ch;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the PIN : ");
	pass=s.nextInt();
	pin=pass;
	if((pin!=pass)){
		System.out.println();
		System.out.println("PIN number is WRONG ");
	}
	System.out.print("Press 1 Deposit \n Press 2 to Withdraw \n  0 to Exit : ");
	ch=s.nextInt();
	System.out.println();
	switch(ch) {
	case 1:
			System.out.print("Enter the Amount to Deposit : ");
			dep=s.nextInt();
			dep=new_bal+dep;
			System.out.println();
			System.out.println("After deposit : "+dep);
	break;
	case 2:
		    System.out.print("Enter the  2 Withdraw Amount : ");
			System.out.println();
			System.out.print("Enter the Withdraw Amount : ");
			amt=s.nextInt();
			System.out.println();
			new_bal=balance-amt;
			System.out.println("current balance is : "+new_bal);
			System.out.println();
    break;
	case 0:
		System.out.print("thank you");
		System.out.println();
	break;		
	}
		
	System.out.println();
	System.out.print("Your PIN number : " +pin);
	
	}
	}
	
