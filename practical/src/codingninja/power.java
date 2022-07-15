
package codingninja;
import java.util.*;

public class power {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p = sc.nextInt();
			
			int ans = (int)Math.pow(n, p);
			System.out.print(ans);
		}
}
