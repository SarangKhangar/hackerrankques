package com.qs.hackerrankqs;

public class CountZeros {
	
	public static int check(int[] a) {
		int count=0;
		for(int n : a) {
			if(n==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] ar = {1, 1, 1, 1, 0, 0};
		
		System.out.println(check(ar));

    }
}	
