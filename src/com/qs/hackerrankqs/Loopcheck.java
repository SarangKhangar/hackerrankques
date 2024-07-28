package com.qs.hackerrankqs;

import java.util.ArrayList;
import java.util.List;

public class Loopcheck {

	public static void main(String[] args) {

		List<Integer> one = new ArrayList<>();
		List<Integer> two = new ArrayList<>();

		one.add(2);
		one.add(6);
		two.add(24);
		two.add(36);

		System.out.println(check(one, two));

	}

	public static int check(List<Integer> a, List<Integer> b) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			// System.out.println(i);
			if (isFactorOfArray(i, a) && isMultipleOfArray(i, b)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isFactorOfArray(int num, List<Integer> arr) {
		System.out.println("into method factor");
		for (int element : arr) {
			System.out.println("element - " + element);
			System.out.println("num or i - " + num);
			if (num % element != 0) {
				System.out.println("false returned");
				return false;
			}
		}
		System.out.println("true returned");
		return true;
	}

	public static boolean isMultipleOfArray(int num, List<Integer> arr) {
		System.out.println("into method multiple");
		for (int element : arr) {
			System.out.println(element);
			if (element % num != 0) {
				System.out.println("false returned");
				return false;
			}
		}
		System.out.println("true returned");
		return true;
	}

}
