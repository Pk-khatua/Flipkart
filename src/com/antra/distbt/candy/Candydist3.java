package com.antra.distbt.candy;

public class Candydist3 {
	private static void cdistribution(int x,int y) {
		int[]arr=new int[y];
		int j=0;
		while(x>0) {
			for(int i=0;i<y;i++) {
				j++;
				if(x<=0) {
					break;
				}
				else {
					if(j<x) {
						arr[i]=arr[i]+j;
					}
					else {
						arr[i]=arr[i]+x;
					}
					x=x-j;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int x=10;
		int y=3;
		Candydist3.cdistribution(x, y);
	}

}
