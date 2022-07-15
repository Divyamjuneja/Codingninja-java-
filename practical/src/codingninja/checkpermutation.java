package codingninja;

public class checkpermutation {
	public static boolean isPermutation(String str1, String str2) {
		int count =0;
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					//two.replace(two.charAt(i), 'Z');
					count++;
					break;
				}
			}}
			if(count == str1.length()) {
				
				return true;
			}
			else {
				return false;
			}
	
	}
		public static void main(String args[]) {
		String one = "abc";
		String two = "bac";
		isPermutation(one,two);
}
}