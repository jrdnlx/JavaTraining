package com.hcl.AS2;
import java.util.Scanner; 

public class Sum {

	
	static boolean twoSum(int val, int val2, int res) {
		
		return val + val2 == res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        // System.out.println("Enter a Prime Number: ");

        // String nums = myObj.nextLine();  // Read user input
        
        
        System.out.println(twoSum(1,3, 5));
        
	}

}
