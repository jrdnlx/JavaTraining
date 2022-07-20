package com.hcl.AS2;
import java.util.Scanner; 

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter A Number: ");

        String nums = myObj.nextLine();  // Read user input
        System.out.println("Inputted Number is: " + nums);  
        
        while(nums != "exit" ) {
        	
        System.out.println("Enter A Number: ");

        nums = myObj.nextLine();  // Read user input
        System.out.println("Inputted Number is: " + nums);  // Output user input
        }
        myObj.close();
    }
}
