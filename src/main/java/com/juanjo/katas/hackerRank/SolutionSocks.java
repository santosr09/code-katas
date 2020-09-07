package com.juanjo.katas.hackerRank;
import java.io.*;
import java.util.*;

public class SolutionSocks {
	
	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		TreeMap<Integer, Integer> socksMap = new TreeMap();
		for(int item: ar){
			int count = (socksMap.get(item)!=null)? (int) socksMap.get(item) :0;
			socksMap.put(item, ++count);
		}
		int pairsCounter = 0;
		for(int item: socksMap.keySet()){
			int socksQty = socksMap.get(item);
			pairsCounter = (socksQty / 2 ) + pairsCounter;
		}
		System.out.println("pairsCounter: "+pairsCounter);
		return pairsCounter;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		int[] ar2 = new int[]{1,3,2,3,2,4,5,1,1,2,3};
		
		
/*		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[n];
		
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}*/
		
		int result = sockMerchant(4, ar2);
		
/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();*/
		
		scanner.close();
	}
}
