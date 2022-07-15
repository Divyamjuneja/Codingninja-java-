package codingninja;
import java.util.*;

public class reversingnum {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
			int x=a,y=0,z=0;
			if(a==0) {
				System.out.print("0");
			}//7653403
			else {
				while(x!=0) { 
				if(z==0 & y==0) {
					while(x%10==0) {
				
					y=x%10; //0
					x=x/10;
					}		
					}
					z=y;
					y=x%10;  
				
			    x=x/10;
				System.out.print(y+" ");
				
				}
					
		}}}

