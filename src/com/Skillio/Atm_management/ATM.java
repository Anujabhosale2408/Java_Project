package com.Skillio.Atm_management;

import java.util.Scanner;



public class ATM  {
	float Balance=70000;
	int Orgpin=2408;
	 int attempt=3;
	 

	public static void main(String[] args) throws Cardblockedexception {
		ATM sbi=new ATM();
		sbi.withdraw();
	}
		
	public void withdraw() throws Cardblockedexception {
		System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		
	    int  amount=sc.nextInt();
	    System.out.println("Enter the pin");
	    
	    int pin=sc.nextInt();
	    
	while(attempt>0) {
		if(pin==Orgpin) {
			System.out.println("the Pin is verified");
		if(Balance>=amount) {
				Balance=Balance-amount;
				System.out.println("the amount is sucessfully Withdraw:"+Balance);
				
		}else {
			System.out.println("insuf balance");
		}
			
			}
		else {
			System.err.println("the pin is invalid");
			pin=sc.nextInt();
			attempt--;
		}}
	
	
	    if(attempt==0) {
	    	throw new Cardblockedexception();
	    }
	
	
		}}

