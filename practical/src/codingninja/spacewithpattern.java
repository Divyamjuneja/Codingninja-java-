package codingninja;
import java.util.*;
public class spacewithpattern {
	public static void main(String args[]) {
		/*int n = 4;
		int i = 1;
		int k = 1;
		while(n>=i) {
			int j=1;
			k=n-i;
			while(j<=k) {
				System.out.print(" ");
			j++;
			}
			j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			j=1;
			while(i-1>=j) {
				System.out.print(i-j);
				j++;
			}
			
			System.out.println();
			i++;
		}
		*/
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i =1;
		int a=1;
		while(i<=n) {
			int j=1;
			int k = n-i;
			
			while(j<=k) {
				System.out.print( " ");
				j++;
			}
			j=1;
			a = i;
			while(j<=i) {
				System.out.print(a);
				a++;
				j++;
			}
			a=i;
			j=1;
			a=a*2-2;
			while(j<=i-1) {
				System.out.print(a);
				a--;
				j++;
			}
			System.out.println();
			i++;
		}
				
		
		
	
	}
}
