package com.hcl.AS4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Collections.swap(list, 3, 7);
		

		System.out.println(list);
	}

}
