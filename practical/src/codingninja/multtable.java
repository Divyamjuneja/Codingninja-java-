package codingninja;
import java.util.*;
public class multtable {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int m = 1;
		int n= sc.nextInt();
	    int ans=0;
	    if (n>=0 && n<=10000) {
	    	while(m<=10){
	    		ans = m*n;
		        System.out.println(ans);
		            m++;
		    
		}
	    	}
	        
    	
}}
