package assignment;
import java.util.Scanner;
public class ncr {
	public static int fact(int a)
    {
        int fact=1;
        for(int i=1; i<=a; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of n : ");
         int n = sc.nextInt();
        System.out.println("Enter Value of r : ");
        int r = sc.nextInt();

        System.out.println("NCR = " +(fact(n)/(fact(n-r)*fact(r))));

    }

}
