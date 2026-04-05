package com.Skillio.constructer.Task;

public class Constructer_chaining {
	String name;
	int age;
	public Constructer_chaining() {
		System.out.println("this is default constucter");
	
	}
	 Constructer_chaining(String name,int age){
		 this.name=name;
		 this.age=age;
		 System.out.println(name + " "+age);
		 
		
	}
	
	public static void main(String[] args) {
		Constructer_chaining ch=new Constructer_chaining();
		Constructer_chaining c=new Constructer_chaining("Anu",22);
		
		
	}
	
	
	
	
	
	
	
	

}
