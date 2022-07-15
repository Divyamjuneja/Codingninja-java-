package codingninja;
import java.util.*;
public class sumorproduct {
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
		
			int c=sc.nextInt();
			int n = sc.nextInt();
			int i=1;
			int j=0;
			if (c==1) {
				for(i=1;i<=n;i++) {
					j=j+i;
				}
				System.out.print(j);
			}
			if(c==2) {
				j=1;
				for(i=1;i<=n;i++) {
					j=j*i;
				}
				System.out.print(j);
			}
			else if(c!=1 && c!=2) {
				System.out.println("-1fff");
			}
			
		}
}
