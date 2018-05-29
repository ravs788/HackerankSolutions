package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		// Complete this function
		HashMap<Integer, Integer> sockpair = new HashMap<>();
		for(int i=0; i<n; i++){
			if(sockpair.containsKey(ar[i])){
				int count = sockpair.get(ar[i]);
				sockpair.put(ar[i], ++count);
			}
			else sockpair.put(ar[i], 1);
				
		}
		int totCount=0;
		for (int val: sockpair.keySet()){
			totCount += (sockpair.get(val)/2);
		}
		return totCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}
