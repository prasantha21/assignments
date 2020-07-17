package assignment;
import java.util.Scanner;
public class Digit_word {
	public static void main(String[] args) {
	
		int a;
		String [] numbers={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        a = sc.nextInt();
        if(numbers.length <= a || a>=0) {
        	System.out.print("Entered number:"+numbers[a-1]);
        }
	}
}
