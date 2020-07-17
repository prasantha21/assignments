package assignment;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 0;
		int temp = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num1 = sc.nextInt();
		num= num1;
	while(num>0) {
		temp = num% 10;
		num = num/10;
		rev = (rev*10) + temp ;
}
	if(num1 == rev) {

		System.out.println("Palindrome");
		}
	else {
		System.out.println("Not a palindrome");
		}
	}
}
