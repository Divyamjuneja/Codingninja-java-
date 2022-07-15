package codingninja;

import java.util.Scanner;

public class pushzeroestoend {
		public static void pushzeroestoend(int arr[]) {
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					arr[count++] = arr[i];
				}
			}
			while(count < arr.length) {
				arr[count++] = 0;
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);		
			int test = sc.nextInt();
			for(int j = 0;j<test;j++) {
				int arr[] = new int[sc.nextInt()];
				for(int i = 0;i<arr.length;i++) {
					arr[i] = sc.nextInt();
				}
				pushzeroestoend(arr);

		}
}}
