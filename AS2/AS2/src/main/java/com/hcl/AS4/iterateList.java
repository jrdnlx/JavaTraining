package com.hcl.AS4;

import java.util.LinkedList;

public class iterateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		int i = 0;
		
		while(i < list.size())
		{
			System.out.println(list.get(i));	
			i++;
		}

	}

}
