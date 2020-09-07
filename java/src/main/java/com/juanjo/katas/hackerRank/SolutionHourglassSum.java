package com.juanjo.katas.hackerRank;

import java.io.*;
import java.util.*;

public class SolutionHourglassSum {
	
	static int hourglassSum(int[][] arr) {
		int countHourglasses = 0;
		int initialColumn = 0;
		int initialRow = 0;
		TreeMap<Integer, Integer> hourglassesMap = new TreeMap();
		int hourglassLine = 1;
		int lineSum = 0;
		do {
			for(int i=initialRow; i<=(initialRow + 2) && ((initialRow + 2) < arr.length); i++){
				if(hourglassLine == 2){
					lineSum = lineSum + arr[i][initialColumn + 1];
					hourglassLine++;
					continue;
				}
				for(int j = initialColumn; j<=(initialColumn + 2) && ((initialColumn + 2) < arr[i].length) ; j++){
					lineSum = lineSum + arr[i][j];
				}
				hourglassLine++;
				if(hourglassLine == 4 && initialColumn == 3){
					initialRow++;
					initialColumn = 0;
					hourglassLine = 1;
					hourglassesMap.put(lineSum, countHourglasses++);
					lineSum = 0;
					break;
				}else if(hourglassLine == 4){
					hourglassLine = 1;
					initialColumn++;
					hourglassesMap.put(lineSum, countHourglasses++);
					lineSum = 0;
				}
			}
		}while(initialRow<4);
		int firstEntry = hourglassesMap.firstEntry().getKey();
		int lastEntry = hourglassesMap.lastEntry().getKey();
		return firstEntry > lastEntry ? firstEntry:lastEntry;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
/*		int[][] arr = {
				{0,0,1,1,2,3},
				{1,5,8,3,2,3},
				{9,3,1,0,2,0},
				{6,3,1,0,6,7},
				{5,9,0,2,1,2},
				{0,1,2,0,4,5}
		};*/
		
		int[][] arr = {
				{-9,-9,-9, 1,1,1},
				{ 0,-9, 0, 4,3,2},
				{-9,-9,-9, 1,2,3},
				{ 0, 0, 8, 6,6,0},
				{ 0, 0, 0,-2,0,0},
				{ 0, 0, 1, 2,4,0}
		};
		
		
		/*int[][] arr = {
				{1,1,1,0,0,0},
				{0,1,0,0,0,0},
				{1,1,1,0,0,0},
				{0,0,2,4,4,0},
				{0,0,0,2,0,0},
				{0,0,1,2,4,0}
		};*/
		
		
		
		//int[][] arr = new int[6][6];
		
/*		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}*/
		
		int result = hourglassSum(arr);
		
/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();*/
		
		scanner.close();
	}
}