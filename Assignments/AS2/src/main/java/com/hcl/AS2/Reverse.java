package com.hcl.AS2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String arrayString = "Reverse this string";
		String reversedString = "";
		for (int i = arrayString.length() - 1; i >= 0; i--) {
			reversedString += arrayString.charAt(i);
		}
		System.out.println(reversedString);
		
	}

}
