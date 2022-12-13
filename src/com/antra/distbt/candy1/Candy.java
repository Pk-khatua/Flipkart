package com.antra.distbt.candy1;

public class Candy {
	private static void distcnd(int x,int y) {
		int [] arr=new int[x];
		int j=0;
		while(y>0) {
			for(int i=0;i<x;i++) {
				j++;
				if(y<=0) {
					break;
				}
				else {
					if(j<y) {
						arr[i]=arr[i]+j;
					}
					else {
						arr[i]=arr[i]+y;
					}
					y=y-j;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int x=3;int y=10;
		Candy.distcnd(x, y);
	}

}
