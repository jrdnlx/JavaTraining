package com.hcl.AS2;

//Write  a Java program to swap two variables.
public class Swap {

	int val = 11, val2 = 20;
	
	 void swapTwoVariables(int val1, int val2) {
		
		int temp = val1;
		this.val = val2;
		this.val2 = temp;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swap s = new Swap();
		
		System.out.println("Entering " +  s.val + " " + s.val2);
		s.swapTwoVariables(s.val, s.val2);
		System.out.println("Returning " +  s.val + " " + s.val2);
	}

}
