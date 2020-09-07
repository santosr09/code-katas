package com.juanjo.katas.amzn;

public class DemoTwo {
	
	public static int generalizedGCD(int num, int[] arr) {
		int result = arr[0];
		for(int index = 1; index < num ; index++){
		   result = gcd(arr[index], result);
		   if(result==1)return 1;
		}
		return result;
	}
	
	private static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	
	public static void main(String[] args){
		int[] arr = {2,4,6,8,10};
		int[] arrB = {2,3,4,5,6};
		generalizedGCD(5, arrB);
	
	}
	
}
