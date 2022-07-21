package com.hcl.AS2;
import java.util.Scanner; 

public class Prime {

	static boolean primeNums(int pr) {

		boolean n = true;
		
		if(pr % 2 == 0) {
			n = false;
		}
		
		return n;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter a Prime Number: ");

        String nums = myObj.nextLine();  // Read user input
        
       
        if(primeNums(Integer.parseInt(nums))) {
        	System.out.println(nums + " is a prime number"); 
        }
        else {
        	System.out.println(nums + " is not a prime number");
        }
         
	}

}
