package com.Skillio.polymorphism;

public class B extends A{
	public static void main(String[] args) {
		B obj1=new B();
		B obj2=new B();
		System.out.println(obj1.add(20, 45));
		System.out.println(obj2.add(20,40,60));
		
	}

}
