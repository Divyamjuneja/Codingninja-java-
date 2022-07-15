package codingninja;
import java.util.*;
public class sumoftwoarrays {
	public static void main(String args[]) {
		int arr1[] = {1,2,3,4};
		int arr2[] = {4,8,8};
		int arr3[] = {0,0,0,0};
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k=arr3.length-1;
		int count=0;
		int count1 = 0;
		int le1 =0;
		int le2=0;
		int total =0;
		while(k>=0) {	
				while(i-count>=0) {
			
				le1 = arr1[i-count];
				//System.out.println(arr1[i-count]);
				count++;
				break;
			}
			System.out.println();
			while(j-count1>=0) {
				//System.out.println("j=" + arr2[j-count1]);
				le2 = arr2[j-count1];
				count1++;
				break;
			}
			
			
			System.out.println();
			if(i>j) {
				for(int z=0;z<i-j;z++) {
					arr3[] =  
				}
				arr3[k] = le1 + le2;
			}
			else if(i<j) {
				arr1[0] = 0;
			}	
			
				if(arr3[k]>9) {
					
					int diff = arr3[k] - 10;
					int div = arr3[k]/10;
					
					arr1[i-count]= arr1[i-count] + div;
					arr3[k] = diff;
				}
				System.out.print(arr3[k]);
				k--;
		}
		
	}
}
