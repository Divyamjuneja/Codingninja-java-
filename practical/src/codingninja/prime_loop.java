package codingninja;
import java.util.*;

public class prime_loop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b=2;
		
		while(b<=a-1) {
			if (a%b==0) {
			System.out.println("Not a prime");
				return;
			
			}
			b++;
		}
		System.out.println("prime");

	}
}
