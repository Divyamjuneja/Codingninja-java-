package codingninja;
import java.util.*;
public class rotatearray {
	public static void rotate(int[] arr, int d) {
		int n = arr.length;
		int arr1[] = new int[d];
		int k =0;
		for(int i=0;i<d;i++) {
			arr1[i] = arr[i];
		}
		for(int i=0;i<arr.length-d;i++) {
			arr[i] = arr[i+d];	
		}
		for(int i=arr.length-d;i<arr.length;i++) {
		arr[i] = arr1[k];
		k++;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		System.out.println();
				
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int arr[] = new int[in];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int d= sc.nextInt();
		rotate(arr,d);
}}
