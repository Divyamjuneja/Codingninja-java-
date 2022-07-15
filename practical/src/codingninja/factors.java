package codingninja;
import java.util.*;

public class factors {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 2;
		if(num>0 && num<=10000) {
			while(num>a) {
		
			if (num%a==0) {
				System.out.println(a);
			}
			a++;
	}
		
	}
}}
