package com.qs.hackerrankqs;

public class CheckWithNum {
	
	public static boolean check(int[] arr, int a) {
		
		int count=0;
		
		for(int n : arr) {
			if(n==a) {
				count++;
			}
		}
		if(count>=(arr.length/2)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 3, 3, 3, 10};
		int x = 3;
		
		if(check(nums, x)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}
