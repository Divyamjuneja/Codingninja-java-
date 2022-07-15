package codingninja;

public class palindromestring {
	public static boolean palindromecheck(String in) {
		int counter=0;
		for(int i=0;i<in.length()/2;i++) {
			if(in.charAt(i) == in.charAt(in.length()-i-1)){
				counter++;
				
			}
		}
		if(counter >= in.length()/2) {
			return true;
		}
		return false;

	}
		public static void main(String args[]) {
			String abc = "abcdcba";
			boolean func =  palindromecheck(abc);
			if(func == true) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
}
