package assignment;
import  java.util.Scanner;
public class digitsum {
	public static void main(String[] args) {
		int a =0 ;
		int rem = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextInt();

		while(a>0) {

			rem = a % 10;
			sum = sum + rem;
			a = a/10 ;
		}

		System.out.println("The sum of digits " + sum);
	}
}
