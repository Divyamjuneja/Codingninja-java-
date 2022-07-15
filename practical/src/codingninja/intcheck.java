package codingninja;
import java.util.*;

public class intcheck {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int even = 0,odd=0;
			while(a!=0) {
				int num= a%10;
				if (num % 2 == 0) {
					even = even + num;
				}
				else {
					odd = odd+ num;
				}
				a = a/10;
			}
			System.out.println(odd + "," + even);

		}
}
