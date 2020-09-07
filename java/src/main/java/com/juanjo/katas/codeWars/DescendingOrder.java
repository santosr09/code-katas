package com.juanjo.katas.codeWars;

import java.util.Comparator;
import java.util.stream.Collectors;

// 1, 2, 3, 4, 5
public class DescendingOrder {
	
	public static int sortDesc(final int num) {
		return Integer.parseInt(String.valueOf(num)
		.chars().mapToObj(value -> String.valueOf(Character.getNumericValue(value)))
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.joining()));
	}

/*public class DescendingOrder {
	public static int sortDesc(final int num) {
		char[] charArray = Integer.toString(num).toCharArray();
		for(int j=0; j <= charArray.length; j++){
			for (int index = 0; index <= charArray.length; index++ ){
				if(index+1 == charArray.length)break;
				char currentValue = charArray[index];
				char nextValue = charArray[index+1];
				if(currentValue < nextValue){
					charArray[index] = nextValue;
					charArray[index+1] = currentValue;
				}
			}
		}
		return Integer.valueOf(String.valueOf(charArray));
	}*/
	
	public static void main(String[] args){
		sortDesc(12345);
		System.out.println(sortDesc(12345));
	}
}
