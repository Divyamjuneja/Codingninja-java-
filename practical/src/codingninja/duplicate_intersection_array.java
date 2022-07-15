package codingninja;
import java.util.*;

public class duplicate_intersection_array {
	    public static void intersections(int arr1[], int arr2[]) {
	    	for(int i = 0; i<arr1.length;i++) {
				for(int j = 0; j<arr2.length;j++) {
					if(arr1[i] == arr2[j] ) {
						System.out.print(arr2[j]);
						arr2[j] = Integer.MAX_VALUE; 
						break;
					}
			}}
	    }		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);		
			int test = sc.nextInt();
			for(int j = 0;j<test;j++) {
				int arr1[] = new int[sc.nextInt()];
				for(int i = 0;i<arr1.length;i++) {
					arr1[i] = sc.nextInt();
				}
				
				int arr2[] = new int[sc.nextInt()];
				for(int i = 0;i<arr2.length;i++) {
					arr2[i] = sc.nextInt();
				}
				intersections(arr1,arr2);
						
				}}
}
