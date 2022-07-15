package codingninja;
import java.util.Scanner;

public class ftoc {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int S = sc.nextInt();
			int E = sc.nextInt();
			int W = sc.nextInt();
			int c=0;
			if(0<=S && S<=90 && S<=E && E<=900 && 0<=W && W<=80) {
				while(S<=E) {
				
					c = (S-32) * 5/9;
				
				System.out.println(S + "=" + c);
				
				
				S=S+W;

			}
				}
		}
}
