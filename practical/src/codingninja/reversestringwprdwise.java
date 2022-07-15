package codingninja;
import java.util.Scanner;

public class reversestringwprdwise {
	public static String reverseWordWise(String input) {
		String sc="";
		int a=input.length();
		for(int i=input.length()-1;i>=0;i--) {
			if(input.charAt(i) == ' ') {
				sc= sc + input.substring(i+1,a) + " ";
				a = i;
				//System.out.print(sc);
			}
			if(i == 0) {
				sc= sc + input.substring(i,a) + " ";
				a = i;
				//System.out.print(sc);
			}
		}
		System.out.print(sc);
		return sc;
	}
	public static void main(String args[]) {
		String input = "My name is divyam";
		reverseWordWise(input);
	}
}