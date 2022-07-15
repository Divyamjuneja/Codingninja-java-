package codingninja;

public class ncr {
	public static void main(String args[]) {
		int n = 6;
		int r =3;		//n! / (n-r)! * r!
		int num =1;
		int den1=1;
		int den2=1;
		
		for(int i=1;i<=n;i++) {
			num = num*i;
		}
		for(int i=1;i<=n-r;i++) {
			den1 = den1 *i;
		}
		for(int i=1;i<=r;i++) {
			den2 = den2 *i;
		}
		int ans = num / (den1 * den2);
		System.out.println(ans);
	}
}
