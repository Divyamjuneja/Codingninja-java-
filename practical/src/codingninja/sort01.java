package codingninja;
import java.util.*;
public class sort01 {
    public static void sortZeroesAndOne(int[] arr) {
    	int countof0 =0;
    	int countof1 =0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] == 0) {
    			countof0++;
    		}
    		else {
    			countof1++;
    		}
    	}
    	for(int i=0;i<countof0;i++) {
    		arr[i] = 0;
    	}
    	for(int i=countof0;i<arr.length;i++) {
    		arr[i] = 1;
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
}}
