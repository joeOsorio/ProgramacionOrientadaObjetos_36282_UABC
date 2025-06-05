import java.util.*;

public class ObjectArray{
	public static void main(String[] args){
		final int NUM_ACCOUNTS = 3;
		BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
	
		//Create objects for the array.
		createAccounts(accounts);
	
		//Display the balances of each accout.
		System.out.println("Here are rhe balances " + "for each account:");
		for(int index = 0; index < accounts.length; index++){
			System.out.println("Account " + (index + 1) + ": $" + accounts[index]. getBalance());
		}

	}





}