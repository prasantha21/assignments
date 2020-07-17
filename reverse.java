package assignment;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		int num = 0; 
		int temp = 0;
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = sc.nextInt();

	while(num>0) {
		temp = num% 10;
		num = num/10;
		rev = (rev*10) + temp ;


	}
	System.out.println(rev);
	}
}
