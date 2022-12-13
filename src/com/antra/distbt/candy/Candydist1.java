package com.antra.distbt.candy;

public class Candydist1 {
	private static void candies(int stu,int can) {
		int[] arr=new int[stu];
		int j=0;
		while(can>0) {
			for(int i=0;i<stu;i++) {
				j++;
				if(can<=0) {
					break;
				}
				else {
					if(j<can) {
						arr[i]=arr[i]+j;
					}
					else {
						arr[i]=arr[i]+can;
					}
					can=can-j;
				}
			}
		}
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		int stu=3;
		int can=10;
		Candydist1.candies(stu, can);
	}

}
