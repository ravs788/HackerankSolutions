package algorithms;

import java.io.*;
import java.util.*;

public class DrawingBook {

	/*
	 * Complete the pageCount function below.
	 */
	static int pageCount(int n, int p) {
		/*
		 * Write your code here.
		 */
		int startCount = 0;
		int endCount = 0;
		if(p%2==0) startCount = p/2;
		else startCount = (p-1)/2;
		
		if(n%2==0){
			if(p%2==0) endCount = (n-p)/2;
			else endCount = (n-p+1)/2;
		}
		else
		{
			if(p%2==0) endCount = (n-p-1)/2;
			else endCount = (n-p)/2;
		}
		
		return startCount > endCount ? endCount : startCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int p = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int result = pageCount(n, p);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

