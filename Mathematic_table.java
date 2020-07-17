package assignment;
import java.util.Scanner;
public class Mathematic_table {
	
		public static void main(String[] args) {
			int a= 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to get table");
			a = sc.nextInt();
			System.out.println("Enter the last nuumber");
			int b=sc.nextInt();
	        for(int i = 1; i <= b; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", a, i, a * i);
	        }
	    }
}
