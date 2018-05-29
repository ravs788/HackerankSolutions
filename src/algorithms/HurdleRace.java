package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HurdleRace {

	static int hurdleRace(int k, int[] height) {
		// Complete this function
		int maxHeight = -1;
		for(int i=0; i<height.length; i++){
			if(height[i]>maxHeight) maxHeight=height[i];
		}
		if (maxHeight>k) return maxHeight-k;
		else return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] height = new int[n];
		for(int height_i = 0; height_i < n; height_i++){
			height[height_i] = in.nextInt();
		}
		int result = hurdleRace(k, height);
		System.out.println(result);
		in.close();
	}
}
