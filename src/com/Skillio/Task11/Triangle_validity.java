package com.Skillio.Task11;

import java.util.Scanner;

public class Triangle_validity {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the program are started in check Triangle ....");
		System.out.println("enter the side 1");
		int side1=sc.nextInt();
		System.out.println("enter the side 2");
		int side2=sc.nextInt();
		System.out.println("enter the side 3");
		int side3=sc.nextInt();
		
		if (side1 == side2 && side2 == side3 && side1 == side3) {
		    System.out.println("Equilateral Triangle");
		}
		else if (side1 == side2 || side2 == side3 || side1 == side3) {
		    System.out.println("Isosceles Triangle");
		}
		else {
		    System.out.println("invalid  Triangle");
		}
		
		
		
		
	}
	
 
}
