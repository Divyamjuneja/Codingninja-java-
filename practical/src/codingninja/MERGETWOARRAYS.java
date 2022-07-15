package codingninja;
import java.util.*;
public class MERGETWOARRAYS {
	public static int[] mergeArrays(int arr1[], int[] arr2) {
		int i=0;
		int j=0;
		int k=0;
		
		int ans[] = new int[arr1.length + arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			}else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
		
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[sc.nextInt()];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[sc.nextInt()];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		int ans[] = mergeArrays(arr1,arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}
}
