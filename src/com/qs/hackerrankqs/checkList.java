package com.qs.hackerrankqs;

import java.util.LinkedList;

public class checkList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer>  ii = new LinkedList<>();
		LinkedList<Integer>  ri = new LinkedList<>();

		
		ii.add(1);
		ii.add(2);
		
		for(int i=ii.size()-1; i>=0; i--) {
			ri.add(ii.get(i));
		}
		
		for(int j : ri) {
			System.out.println(j);
		}
		
	}

}
