package com.qs.hackerrankqs;

public class CombineSortAlgo {
	
	public static void combine(int[] a,int[] b) {
		
		int s = a.length + b.length;
		int[] n = new int[s];
		
		for(int i=0; i<a.length; i++) {
				n[i]=a[i];
		}
		for(int j=0; j<b.length; j++) {
			n[j+b.length]=b[j];
		}
		
		for(int ii : n) {
			System.out.println(ii);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] aa = {1,2,3,4,5};
		int[] bb = {6,7,8,9,0};
		
		combine(aa, bb);
		
		//System.out.println(aa.length);
		
	}

}
