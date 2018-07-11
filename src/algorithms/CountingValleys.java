package algorithms;

import java.util.*;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		// Complete this function
		char[] stepsArray = s.toCharArray();
		int position = 0;
		int valCount = 0;
		for(char c: stepsArray){
			if(c == 'U') position++;
			else if(c == 'D') position--;
			if(position == 0 && c=='U') valCount++; 
		}
		return valCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
