package com.qs.hackerrankqs;

import java.util.Arrays;
import java.util.stream.Stream;

public class MedianOfTwoArray {
	
	public static int combine(Integer[] a, Integer[] b) {
		Integer[] c = Stream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray(Integer[]::new);
        for(Integer j : c) {
        	System.out.println(j);
        }
		int re = findMedian(c);
        	return re;
	}
	
	public static int findMedian(Integer[] aa) {
//this code in to find average
//		int count =0;
//		for(int i=0; i<aa.length; i++) {
//			count = count + aa[i];
//		}
//		return count/aa.length;
		
//this code is to find median
			return aa[aa.length/2];
	}
	
	public static void main(String[] args) {
		Integer[] one = {-5, 3, 6, 12, 15}; 
		Integer[] two = {-12, -10, -6, -3, 4, 10};
		
		System.out.println(combine(one, two));
	}

}
