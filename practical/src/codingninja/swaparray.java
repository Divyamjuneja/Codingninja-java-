package codingninja;
import java.util.*;
public class swaparray {
    public static void swapAlternate(int arr[]) {
    	int temp=0;
    	for(int i=0;i<arr.length;i++) {
			if(i%2!= 0 ) {
				arr[i-1] = arr[i]; 
				arr[i] = temp;
			
		}
			else if(i%2==0) {
				temp = arr[i];
				
			}
			}
    }			
	public static void main(String args[]) {
					Scanner sc = new Scanner(System.in);
					int test = sc.nextInt();
					for(int j=0;j<test;j++) {
							int in = sc.nextInt();
							int arr[] = new int[in];
							for(int i=0;i<arr.length;i++) {
								arr[i] = sc.nextInt();
							}
							swapAlternate(arr);
							
							for(int i=0;i<arr.length;i++) {
								System.out.print(arr[i] + " ");
							}
							
									}}
}
