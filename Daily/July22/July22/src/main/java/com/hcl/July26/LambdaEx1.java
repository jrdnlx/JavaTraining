package com.hcl.July26;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<String> names = Arrays.asList("Name1", "Name2", "Name3");
		
		Collections.sort(names, (String a, String b)->{
			return b.compareTo(a);
		});
		
		names.forEach(word-> word.toUpperCase());
		
		System.out.println(names);
	}
}

