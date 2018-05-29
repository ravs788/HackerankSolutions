package dataStructures;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArrayDS {

	/*
	 * Complete the reverseArray function below.
	 */
	static int[] reverseArray(int[] a) {
		/*
		 * Write your code here.
		 */
		int[] reverseArr = new int[a.length];
		for(int i = a.length-1; i>=0; i--){
			reverseArr[i] = a[a.length-i-1];
		}
		return reverseArr;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		Scanner scanner = new Scanner(System.in);
		
		int arrCount = Integer.parseInt(scanner.nextLine().trim());

		int[] arr = new int[arrCount];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int arrItr = 0; arrItr < arrCount; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		int[] res = reverseArray(arr);

		for (int resItr = 0; resItr < res.length; resItr++) {
//			bufferedWriter.write(String.valueOf(res[resItr]));
			System.out.println(String.valueOf(res[resItr]));

			if (resItr != res.length - 1) {
//				bufferedWriter.write(" ");
				System.out.println(" ");
			}
		}

//		bufferedWriter.newLine();
		System.out.println();

//		bufferedWriter.close();
		scanner.close();
	}
}
