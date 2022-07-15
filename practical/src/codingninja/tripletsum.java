package codingninja;

import java.util.Scanner;

public class tripletsum {
	public static int pairSum(int arr[], int x) {
    	int sum=0;
		int flag =0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) { 
				for(int k=j+1;k<arr.length;k++){
				if (i!=j) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum == x) {
						count++;
					}
					
				}
			}}
		}	
		System.out.println(count);
		return count;
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int arr[] = new int[sc.nextInt()];
		for(int i =0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		pairSum(arr,x);
		
	}
}
