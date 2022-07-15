package codingninja;

public class reverseString {
	public static void main(String args[]) {
		String str = "hello";
		String astr = ""; 
		for(int i=str.length()-1;i>=0;i--) {
			astr += str.charAt(i); 
			
		}
		System.out.println(astr);
	}
}
