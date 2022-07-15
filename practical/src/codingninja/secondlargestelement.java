package codingninja;
import java.util.*;
public class secondlargestelement {
    public static int secondLargestElement(int[] arr) {  
    		if(arr.length == 0) {
				System.out.print(Integer.MIN_VALUE);
				return Integer.MIN_VALUE;
    		}
    		int largest = arr[0] ;
    		int second=0;		
    		for(int i=0;i<arr.length-1;i++) {
    			if(arr[i+1]>largest) {
    				second = largest;
    				largest = arr[i+1];
    				}
    			if(second<arr[i+1] && arr[i+1]<largest) {
    				second =arr[i+1];
    			}
    			if(largest == arr[i+1] && arr[i+1] == arr[i+2]) {
    				System.out.print(Integer.MIN_VALUE);
    				return Integer.MIN_VALUE;
    			}
    	}
    		System.out.print(second);
    		return second;
    		}
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();

		for(int j=0;j<test;j++) {
		int arr[] = new int[sc.nextInt()];
		if(arr.length == 0) {
				System.out.print(Integer.MIN_VALUE);
		}
		else {
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int ans =secondLargestElement(arr);
}}}

}