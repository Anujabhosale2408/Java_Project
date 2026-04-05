package com.Skillio.array;

public class Max_array {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int max=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
	System.out.println("the max no is:"+max);
	}

}
