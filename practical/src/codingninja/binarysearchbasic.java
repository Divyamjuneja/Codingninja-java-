package codingninja;
import java.util.*;
public class binarysearchbasic {
	public static int binarySearch(int arr[] ,int key) {
		int first=0,last=arr.length-1,mid;
		
		mid=first/last;
		while(first<=last) {
			if(arr[mid]<key) {
				first = mid+1;
				mid = (first+last)/2;
			}
			else if(arr[mid] == key) {
				System.out.print("key found at " + mid);
				break;
			}
			else {
				last = mid-1;
				mid = (first+last)/2;
			}
		}
		if(first>last) {
			return -1;
		}
		return mid;
	
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int test = sc.nextInt();
		
		for(int j=0;j<test;j++){
			int key = sc.nextInt();
			int result = binarySearch(arr,key);
			if(result == -1) {
				System.out.println(-1);
			}
		}
		}
}