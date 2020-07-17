package assignment;

import java.util.Scanner;

public class range {
	
	public static void main(String[] args) {
		 Scanner sc= new Scanner (System.in);
		 int a=sc.nextInt ();
		 int b=sc.nextInt ();
		System.out.println("The numbers within the range are :"  );
		for(int i = a ; i<=b; i ++) {
			System.out.print("  " +i );
		}

	}
}
