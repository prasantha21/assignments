package assignment;
public class Prime_numbers {
	public static void main(String[] args) {
	    int i =0;
	       int a =0;

	       String  primeNumbers = "";

	       for (i = 2; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(a =i; a>=1; a--)
		  {
	             if(i%a==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {

		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 2 to 100 are");
	       System.out.println(primeNumbers);
	}

}
