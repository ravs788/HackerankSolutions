package algorithms;

import java.io.*;
import java.util.*;

public class BetweenTwoSets {

	/*
	 * Complete the getTotalX function below.
	 */
	static int getTotalX(int[] a, int[] b) {
		/*
		 * Write your code here.
		 */
		int aMax = -1;
		int bMin = 10000;
		for(int i: a){
			if(i>aMax) aMax = i;
		}

		for(int j: b){
			if(j<bMin) bMin = j;
		}

		boolean bFlag = false;
		int totCount=0; 

		for(int num=aMax; num<=bMin; num++){
			for(int i: a){
				if(num%i == 0) bFlag = true;
				else{
					bFlag = false;
					break;
				}
			}
			if(bFlag){
				for(int j: b){
					if(j%num ==0) bFlag = true;
					else{
						bFlag = false;
						break;
					}
				}
			}
			if(bFlag == true) totCount++;
		}
		return totCount;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scan.nextLine().split(" ");

		int n = Integer.parseInt(nm[0].trim());

		int m = Integer.parseInt(nm[1].trim());

		int[] a = new int[n];

		String[] aItems = scan.nextLine().split(" ");

		for (int aItr = 0; aItr < n; aItr++) {
			int aItem = Integer.parseInt(aItems[aItr].trim());
			a[aItr] = aItem;
		}

		int[] b = new int[m];

		String[] bItems = scan.nextLine().split(" ");

		for (int bItr = 0; bItr < m; bItr++) {
			int bItem = Integer.parseInt(bItems[bItr].trim());
			b[bItr] = bItem;
		}

		int total = getTotalX(a, b);

		System.out.println(String.valueOf(total));
		//		bw.newLine();
		//
		//		bw.close();
	}
}
