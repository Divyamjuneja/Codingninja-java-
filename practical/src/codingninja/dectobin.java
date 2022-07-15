package codingninja;
import java.util.*;
public class dectobin {
	/*	public static void main(String args[]) {
			 // decimal number
		    Scanner sc = new Scanner(System.in);
			int num = 5000;

		    // call method to convert to binary
		    convertDecimalToBinary(num);

		    }

		  public static long convertDecimalToBinary(int n) {

		    long binaryNumber = 0;
		    long remainder, i = 1, step = 1;

		    while (n!=0) {
		      remainder = n % 2;	
		        n /= 2;				

		        binaryNumber += remainder * i;	
		        i *= 10;
		    }
		    System.out.println(binaryNumber);
		    
		    return binaryNumber;
		    }	
		}*/
			public static void main(String[] args) {
		        Scanner s=new Scanner(System.in);
		        int n = s.nextInt();
		        long binary =0, pow=1;
		        while(n>0){
		            int lb = n%2;
		            binary+=lb*pow;//1100
		            pow*=10;
		            n=n/2;
		        }
		        System.out.println(binary);
		    }
		}

//12 = 110024 