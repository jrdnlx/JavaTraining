package com.hcl.AS3;

public class Student {
	
	String name;
	
	boolean Average(int mark1, int mark2, int mark3) {
		
		return ((mark1 + mark2 + mark3) / 3) > 50;
	};
	
	String getName(String name) {
		
		this.name = name;
		
		return this.name;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
