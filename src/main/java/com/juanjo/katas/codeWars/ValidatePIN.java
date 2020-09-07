package com.juanjo.katas.codeWars;

import java.util.regex.Pattern;

public class ValidatePIN {
	
	public static boolean validatePin(String pin) {
		// Your code here...
		boolean b3 = Pattern.matches("[0-9]{4}|[0-9]{6}", pin);
		//boolean b3 = Pattern.matches("^[0-9]{4,6}$", pin);
		
		return b3;
	}
	
	public static void main(String[] args){
		String pinA = "1234";
		String pinB = "12345";
		String pinC = "123456";
		String pinD = "1234A6";
		String pinE = "12A4";
		System.out.println(validatePin(pinA));
		System.out.println(validatePin(pinB));
		System.out.println(validatePin(pinC));
		System.out.println(validatePin(pinD));
		System.out.println(validatePin(pinE));
	}
	
}
