package assignment;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int factorial = 1;

		System.out.println("Enter the number");
		num = sc.nextInt();
		for(int i=1; i<= num ; i++) {

				 factorial = factorial * i;
		}
		System.out.println("Factorial of num is " + factorial);
	}
	
}
