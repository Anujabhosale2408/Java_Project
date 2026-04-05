package com.Skillio.array;

public class Min_array {
	public static void main(String[] args) {
		int []arr= {10,20,30,40};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("the min value:"+min);
	}

}
