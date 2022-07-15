package codingninja;

public class alphabetpattern {
	public static void main(String args[]) {
		/*int a=4;
		int i=1;
		int k=0;
		
		while(i<=a) {
			int j=0;
			k=i-2;
			while(j+1<=i) {
				k++;
				System.out.print((char)('A' + k));
				j++;
			}
			i++;
			System.out.println();
		}*/
		int n=5;
		int i=1;
		int k=0;
		
		while(i<=n) {
			int j=0;
			k=n-i;
			while(j+1<=i) {
				System.out.print((char)('A' + k));
				k++;
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
