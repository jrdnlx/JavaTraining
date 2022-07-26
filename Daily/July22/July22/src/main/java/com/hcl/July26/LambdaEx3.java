package com.hcl.July26;

import java.util.function.Predicate;

public class LambdaEx3 {
	
	@FunctionalInterface
	interface Vehicle{
		void speed();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = (s)->s.length() > 0;

		p.test("Name1");
		p.negate().test("name2");
		
		
	}

}
