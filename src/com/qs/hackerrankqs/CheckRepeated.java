package com.qs.hackerrankqs;

public class CheckRepeated {

	public static int check(int[] arr) {
		int one = 0;
		int two = 0;
		int res = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					one++;
				}
			}
			if (one > two) {
				res = arr[i];
				two = one;
			}
			one = 0;
		}
		return res;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 3, 4, 3, 10 };

		System.out.println(check(arr));

	}

}
