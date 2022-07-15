package codingninja;

import java.util.Scanner;

public class uniquearray {
			public static int findUnique(int[] arr){
				for(int a=0;a<arr.length;a++) {
					int flag=0;
					
					for(int b=0;b<arr.length;b++) {
						if(a!=b) {
							if(arr[a] == arr[b]) {
								flag = flag + 1;
								}
							
							
					}
						}
					if(flag>=1) {
						int k = arr[a];
								return k;
					}	
					
				} 
				return -1;
								
			}
			public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				int test = sc.nextInt();
				for(int j=1;j<=test;j++) {
					int in = sc.nextInt();
				
				int arr[] = new int[in];
				for(int i=0;i<arr.length;i++) {
					arr[i] = sc.nextInt();
				}
				
				int ans = findUnique(arr);
				if(ans==-1) {
					
				}
				else {
					System.out.println(ans);
				}
				}
}
}