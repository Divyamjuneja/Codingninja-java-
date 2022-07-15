package codingninja;

import java.util.*;

public class largestvalueinarray {
	public static int largestinArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		return max;

	}
	public static int[] takeinput() { 		//int[] is written to return array
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int arr[] = new int[in];
		for (int i=0;i<in;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		return arr;
	}
	
	public static void print(int arr[]) {		//void is the return type as we dont need a return from it
		int in = arr.length;
		for(int i=0;i<in;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] =  takeinput();
		print(arr);
		int largest = largestinArray(arr);
		System.out.println(largest);
		}
}
