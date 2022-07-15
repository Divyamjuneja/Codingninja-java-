package codingninja;
import java.util.*;
public class ftoctable {

	public static void printFahrenheitTable(int start, int end, int step) {
		int c=0;
		for(int j=start;j<=end;j+=step) {
			c = (j-32) * 5/9;
			System.out.println(j + " " +c);
		}
	}

		public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int e = sc.nextInt();
	int i = sc.nextInt();
	printFahrenheitTable(s,e,i);
	
}
}
