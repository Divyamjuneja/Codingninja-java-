package codingninja;
import java.util.*;
public class charofstrings {
	  public static int countWords(String str) {	
			int count =0;
			int ans=0;
			for(int i=0;i<str.length();i++) {
				char a = str.charAt(i);
				
				if( a == ' ') {
					count++;
				}
			}
			if(str.length()>0) {
			ans =count+1;
			}
			//System.out.print(count+1);
			 return ans;
	  }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int op = countWords(str);
}
}