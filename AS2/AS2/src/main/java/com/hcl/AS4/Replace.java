package com.hcl.AS4;

import java.util.LinkedList;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		list.set(1, 22);
		list.set(5, 100);
		
		System.out.println(list);

	}

}
