package codingninja;
import java.util.*;
public class diamonds {
	public static void main(String args[]) {
	 
	            int n, i, j, space = 1;


	            Scanner s = new Scanner(System.in);

	            n = 15;

	            space = n/2;

	            for (j = 1; j <= (n/2)+1; j++) 

	            {

	                for (i = 1; i <= space; i++) 

	                {

	                    System.out.print(" ");
	                    
	                }
	                space--;


	                for (i = 1; i <= 2 * j - 1; i++) 

	                {

	                    System.out.print("*");                

	                }

	                System.out.println("");

	            }

	          
	            for (j = 1; j <= n/2; j++) 
	            	
	            {

	                for (i = 1; i <= j; i++) 

	                {

	                    System.out.print(" ");

	                }
	                space++;

	                for (i = 1; i <= n - (2*j); i++) 

	                {

	                    System.out.print("*");

	                }

	                System.out.println("");

	            }

	        }

	    }
