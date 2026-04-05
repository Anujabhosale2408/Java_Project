package com.Skillio.Task11;

import java.util.Scanner;

public class Positive_even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the Program are started in check Positive even odd");
		System.out.println("enter the first no:");
		int a=sc.nextInt();
		
		
		if(a<=0 && a % 2== 0) {
			System.out.println("the no is even");
		}
		else if(a>0 && a %2 !=0)
		{
			System.out.println("num is odd");
		}
		else
		{
			System.out.println("the no is zero");
		}
		

	}
	
}
