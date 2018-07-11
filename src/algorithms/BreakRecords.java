package algorithms;

import java.io.*;
import java.util.*;

public class BreakRecords {

	/*
	 * Complete the breakingRecords function below.
	 */
	static int[] breakingRecords(int[] score) {
		/*
		 * Write your code here.
		 */
		long minScore = 1000000000;
		long maxScore = -1;
		int[] breakRecord = {-1, -1};
		for(long i: score){
			if(i<minScore){
				minScore = i;
				breakRecord[1] += 1;
			}
			if(i>maxScore){
				maxScore = i;
				breakRecord[0] += 1;
			}
		}
		return breakRecord;
		
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] score = new int[n];

		String[] scoreItems = scan.nextLine().split(" ");

		for (int scoreItr = 0; scoreItr < n; scoreItr++) {
			int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
			score[scoreItr] = scoreItem;
		}

		int[] result = breakingRecords(score);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
//			bw.write(String.valueOf(result[resultItr]));
			System.out.println(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
//				bw.write(" ");
				System.out.println();
			}
		}

//		bw.newLine();
//
//		bw.close();
	}
}
