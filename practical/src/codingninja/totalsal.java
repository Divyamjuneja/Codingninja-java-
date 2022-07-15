package codingninja;
import java.util.*;
public class totalsal {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
			int basic = sc.nextInt();
			char grade = sc.next().charAt(0);
			
			if(basic>=0 && basic<=7500000) {
				
			
				double hra = 0.2 * basic;
				double da = 0.5 * basic;
				int allow = 0;
				double pf = 0.11 * basic;
				
				if(grade == 'A') {
					allow = 1700;
				}
				else if(grade == 'B') {
					allow = 1500;
				}
				else {
					allow = 1300;
				}
			
				int total = (int)(basic+hra+da+allow-pf);
				int last = Math.round(total);
				System.out.print(last);
			}}}
