package com.antra.distbt.candy;

public class Candydist {
	private static void candis(int k,int s) {
		int[] arr=new int[s];
		int j=0;
		while(k>0) {
			for(int i=0;i<s;i++) {
				j++;
				if(k<=0) {
					break;
				}
				else {
					if(j<k) {
						arr[i]=arr[i]+j;
					}
					else {
						arr[i]=arr[i]+k;
					}
					k=k-j;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int s=3;
		int k=10;
		Candydist.candis(k,s);
	}

}
