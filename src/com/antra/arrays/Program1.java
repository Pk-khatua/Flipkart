package com.antra.arrays;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
	int [] a= {100,150,200,500};
	int[] array2 = new int[(a.length-a.length)+3];
	int[] array3 = new int[a.length - array2.length];

	System.arraycopy(a, 0, array2, 0, array2.length);
	System.arraycopy(a, array2.length, array3, 0,array3.length);
	System.out.println(Arrays.toString(array2));
	System.out.println(Arrays.toString(array3));
	int x=0;
	int y=0;
	Arrays.sort(array2);
	Arrays.sort(array3);
	System.out.println(Arrays.toString(array2));
	System.out.println(Arrays.toString(array3));
	x=array2[array2.length-1];
	y=array3[0];
	System.out.println(x-y);
	}
}
