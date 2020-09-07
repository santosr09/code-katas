import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionCakeCandles {
	
	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		//Java 7
		TreeMap candlesMap = new TreeMap();
		for(int item: ar){
			System.out.println("item: " + item);
			int count = (candlesMap.get(item)!=null)? (int) candlesMap.get(item) :0;
			candlesMap.put(item, ++count);
		}
		return (int) candlesMap.get(candlesMap.lastKey());
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		int[] ar2 = new int[]{3,2,1,3};
		
/*		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int arCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[arCount];
		
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}*/
		
		int result = birthdayCakeCandles(ar2);
		
		System.out.println("result: " + result);
/*		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();*/
		
		scanner.close();
	}
}
