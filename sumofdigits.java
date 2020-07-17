package assignment;

import java.util.Scanner;

public class sumofdigits {
 
	public static void main(String[] args) {
		 int sum = 0; 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int n=sc.nextInt();
	        while (n > 0 || sum > 9)  
	        { 
	            if (n == 0) { 
	                n = sum; 
	                sum = 0; 
	            } 
	            sum += n % 10; 
	            n /= 10; 
	        } 
	     System.out.println("sum of digits\n" +sum);
	    } 
	      
}
