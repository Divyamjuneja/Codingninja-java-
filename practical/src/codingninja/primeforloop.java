package codingninja;
import java.util.*;
public class primeforloop {
		public static void main(String args[]) {
			Scanner sc= new Scanner(System.in);
			int i;
			int k =0;
			int n= sc.nextInt();
		
			for(i=2;i<=n;i++) {				
				k=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0) {
						k=k+1;
						
					}
				}
				if(k>=3) {
					System.out.println(i+" is not prime");
				}
				else {
					System.out.println(i+" is prime");
				}
			}
		}
}
