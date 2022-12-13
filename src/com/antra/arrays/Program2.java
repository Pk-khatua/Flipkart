package com.antra.arrays;

import java.util.Arrays;

public class Program2 {
	public static void main(String[] args) {
		int []a= {1,4,2};
		int []b= {6,3}; 
		int x=0;
		int y=0;
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		x=a[a.length-1];
		y=b[0];
		System.out.println(x-y);
	}

}
