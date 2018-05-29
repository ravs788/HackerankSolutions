package algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] bill = new int[n];
		for(int i=0; i<n; i++){
			bill[i] = scan.nextInt();
		}
		int b = scan.nextInt();
		int sum = 0;
		for(int j=0; j<n; j++){
			if(j!=k) sum+= bill[j];
		}
		if((sum/2) == b) System.out.println("Bon Appetit");
		else System.out.println(b-sum/2);
		scan.close();
	}
}
