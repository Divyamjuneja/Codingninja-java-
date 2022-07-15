package codingninja;
import java.util.*;
public class fashionarr {
    public static void arrange(int[] arr, int n) {
		if(n==0) {
		
		}
		else {
			int k=1,l=2,y=(n/2)+1;
		
    	for(int i=0;i<=n/2;i++) {		//3  5
			arr[i] = k;
			k+=2;
			}
		if(n%2==0) {
			for(int i=n-1;i>=n/2;i--) {		//4  3
				arr[i] = l;
				l+=2;
			}}
		
		else {
				for(int i=n-1;i>=y;i--) {		//4  3
					arr[i] = l;
					l+=2;
			}
			}
		for(int i = 0;i<n;i++) {
		System.out.print(arr[i] + " ");	
		}
	}}
    
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i =1;i<=test;i++) {
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			
			arrange(arr,n);
		}
		
}}
