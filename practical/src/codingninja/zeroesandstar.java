package codingninja;

import java.util.Scanner;

public class zeroesandstar {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= 5;
		for(int i=0;i<n;i++) {
			int j=n;
			while(j != 0) {	
			if(j == n-i) {
				System.out.print("*");
			}
			else {
			System.out.print("0");
			}
			j--;
		}
			System.out.print("*");
			j=n;
			while(j != 0) {	
				if(j == i+1) {
					System.out.print("*");
				}
				else {
				System.out.print("0");
				}
				j--;
			}
			
		System.out.println();
		}
	}
}
