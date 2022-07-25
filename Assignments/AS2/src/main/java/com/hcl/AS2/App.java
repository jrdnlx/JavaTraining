package com.hcl.AS2;
import java.util.Scanner; 

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	static int fibonacci(int n) {
		
		
		int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
	}
	
    public static void main( String[] args )
    {
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("Enter A Number: ");

        String nums = myObj.nextLine();  // Read user input
        
       
        System.out.println("Fibonacci Sequence is: " + fibonacci(Integer.parseInt(nums)));  
        
    
        myObj.close();
    }
}
