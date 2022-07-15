package codingninja;

public class patternwithstar {
	public static void main(String args[]) {
		int i=1,j;
		int n=9;
		System.out.println("*");
		while(i<=n) {
			j=1;
			System.out.print("*");
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			j=1;
			while(j<i) {
				System.out.print(i-j);
				j++;
			}
			System.out.println("*");
			i++;
		}
		int k=1;;
		i=1;
		while(i<=n-1) {
			j=1;
			System.out.print("*");
			while(j<=n-i) {
				System.out.print(j);
				j++;
				k=n-i;
			}
			j=1;
			int a=k-1;;
			while(j<k) {
				System.out.print(a);
				j++;
				a--;
			}
			System.out.println("*");
			k--;
			i++;
		}
		System.out.println("*");
		
}}
