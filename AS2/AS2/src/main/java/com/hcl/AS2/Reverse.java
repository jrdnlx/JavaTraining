package com.hcl.AS2;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuilder obj = new StringBuilder();
		//obj.reverse();
		
		
		String arrayString = "Reverse this string";
		String reversedString = "";
		for (int i = arrayString.length() - 1; i > 0; i--) {
			reversedString += arrayString.charAt(i);
		}
		System.out.println(reversedString);
		
	}

}
