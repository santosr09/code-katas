package com.juanjo.katas.hackerRank;
import java.util.*;

public class SolutionNewYearChaos {
	
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] arr) {
		boolean unsorted = true;
		int accum = 0;
		while (unsorted){
			unsorted = false;
			for(int index = 0; index < arr.length; index++){
				int value = arr[index];
				if((value != (index+1))){
					if(value - (index + 1) >= 3){
						System.out.println("Too chaotic");
						return;
					}else if (value > arr[index + 1]){
						int nextElement = arr[index + 1];
						arr[index] = nextElement;
						arr[index + 1] = value;
						accum++;
						unsorted = true;
					}
				}
			}
		}
		System.out.println("Bribing operations: " + accum);
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int[] a = {4, 7, 3, 2, 8};
		
		//int[] a = {2, 1, 5, 3, 4};
		//int[] a = {5, 1, 2, 3, 7, 8, 6, 4};
		
		int[] a = {1, 2, 5, 3, 7, 8, 6, 4};
		//int[] a = {2, 5, 1, 3, 4};
		
		/*int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			int[] q = new int[n];
			
			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}
			
			minimumBribes(q);
		}
		
		scanner.close();*/
		
		minimumBribes(a);
	}
}

