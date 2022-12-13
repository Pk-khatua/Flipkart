package com.antra.distbt.candy2;

public class DistCandy {
	private static void distribute( int x,int y) {
		int [] arr=new int[y];
		int temp=0;
		while(x>0)
		{
		for(int i=0;i<y;i++) {
			temp++;
			if(x<=0) {
				break;
			}
			else {
				if(temp<x) {
					arr[i]=arr[i]+temp;
				}
				else {
					arr[i]=arr[i]+x;
				}
				x=x-temp;
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
		DistCandy.distribute(x, y);
	}

}
