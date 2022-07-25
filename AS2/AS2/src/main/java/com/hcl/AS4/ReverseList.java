package com.hcl.AS4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Collections.reverse(list);
		
		list.forEach(System.out::println);
	}

}
