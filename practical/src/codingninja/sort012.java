package codingninja;
import java.util.*;
import java.util.Scanner;

public class sort012 {
	public static void sortZeroesAndOne(int[] arr) {
    	int countof0 =0;
    	int countof1 =0;
    	int countof2=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == 0) {
    			countof0++;
    		}
    		else if(arr[i] == 1){
    			countof1++;
    		}
    		else{
    			countof2++;
    		}
    	}
    	for(int i=0;i<countof0;i++) {
    		arr[i] = 0;
    	}
    	for(int i=countof0;i<arr.length - countof2;i++) {
    		arr[i] = 1;
    	}
    	for(int i=arr.length - countof2;i<arr.length;i++) {
    		arr[i] = 2;
    	}
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]);
    	}
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
		int test=sc.nextInt();
		for(int z= 0;z<test;z++) {
		int arr[] = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sortZeroesAndOne(arr);
				
			}
}
}
