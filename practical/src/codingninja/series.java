package codingninja;

public class series {
		public static void main(String args[]) {
			int n=10;
			int a=1;
			int i=1;
			int j=1;
			for(i=1;i<=n;i++) {
				int b = 3 * j +2;
				
				if(b%4!=0) {
					System.out.print(" " + b);

				}
				else if(b%4==0) {
					j++;
					 b = 3 * j +2;

					System.out.print(" " + b);
				}
				j++;

			}
		}
}
