package codingninja;
import java.util.*;
public class checknumsequence {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			int x=0;
			for(int a =0;i>a;a++) {
				int in = sc.nextInt();
				if(in>x) {
					System.out.print(true);
				}
				x = in;
				
			}
		}
}
