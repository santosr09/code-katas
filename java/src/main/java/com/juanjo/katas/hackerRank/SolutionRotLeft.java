package com.juanjo.katas.hackerRank;
import java.io.*;
import java.util.*;

public class SolutionRotLeft {
	
	// Complete the rotLeft function below.
	static int[] rotLeft(int[] arr, int numRotations) {
		int length = arr.length;
		int[] rotatedArr = new int[length];
		for (int i = 0; i < length; i++) {
			int currentIndex = i;
			int newIndex;
			if((currentIndex - numRotations) < 0){
				newIndex = length + (currentIndex - numRotations);
			}else{
				newIndex = (currentIndex - numRotations);
			}
			rotatedArr[newIndex] = arr[i];
		}
		return rotatedArr;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		/*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		String[] nd = scanner.nextLine().split(" ");
		
		int n = Integer.parseInt(nd[0]);*/
		
		//int d = Integer.parseInt(nd[1]);
		
		//int[] a = new int[n];
		
		int d = 3;
		int[] a = {4, 7, 3, 2, 8};
		
		/*String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}*/
		
		int[] result = rotLeft(a, d);
		
		/*for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));
			
			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}
		
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();*/
	}
}

