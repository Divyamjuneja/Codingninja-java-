package codingninja;
import java.util.*;
public class trianglepatternsum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int sum=0;
			while(j<=i) {
				sum=sum+j;
				if(j == i) {
					
					System.out.print(j + "=" + sum);
				}
				else if(j<i) {
					System.out.print(j + "+");
				}
				j++;
			}
				
			System.out.println();
			i++;
		}
	}
}
