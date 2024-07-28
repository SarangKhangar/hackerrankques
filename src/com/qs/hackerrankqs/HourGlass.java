package com.qs.hackerrankqs;

import java.util.List;

public class HourGlass {

	//java code to conver small case name into sentance case
	public static String replace(String s) {
		StringBuilder sb = new StringBuilder();
		int acsii = (int) s.charAt(0);
		//System.out.println(acsii);

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				char c = (char) (acsii - 32);
				//System.out.println(c);
				sb.append(c);
				//System.out.println(sb.toString());
			} 
			else {
				sb.append(s.charAt(i));
				//System.out.println(sb.toString());
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String s = "sarang khangar";
		String[] ss = s.split(" ");
		System.out.println(ss.length);
		String[] nss = new String[ss.length];
		System.out.println(nss.length);

		for (int i = 0; i < nss.length; i++) {
			String sx = replace(ss[i]);
			nss[i] = sx;
		}

		for (String sf : nss) {
			System.out.println(sf);
		}

		// code of array to fine bigger of smallest neighbour

//		
//		int[] nums = {5,10,20,15};//{20, 5, 10, 15} {5, 10, 15, 20}
//		int re = 0;
//		for(int i=1; i<nums.length; i++) {
//			if(i==nums.length-1) {
//				break;  
//			}
//			else if(nums[i]>nums[i+1] && nums[i]>nums[i-1]) {
//			  re=nums[i];
//			  System.out.println(re);
//			}
//		}
	}
}
