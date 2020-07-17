package assignment;
import  java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		int a=0;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		a = sc.nextInt();
		 if(a==0||a==1){  
			   System.out.println(a+" is not prime number");      
			  }else{  
			   for(int i=2;i<=(a/2);i++){      
			    if(a%i==0){      
			     System.out.println(a+" is not prime number");      
			      flag=1;      
			     break;      
			    }      
			}      
		    if(flag==0)  { System.out.println(a+" is prime number"); }  
		}
	}    

}
