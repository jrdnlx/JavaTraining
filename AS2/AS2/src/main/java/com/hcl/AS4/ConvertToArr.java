package com.hcl.AS4;

import java.util.HashSet;
import java.util.Set;

public class ConvertToArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();

		for(int i = 0; i < 10; i++) {
			set.add(i);
		}
		
		String arr[] = new String[set.size()];

		set.toArray(arr);
		
		for(String str : arr)
		{
			System.out.println(str);
		}
		
		
	}

}
