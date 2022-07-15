package codingninja;
import java.util.*;
public class arraywithfunctions {
	public static int[] takeinput() { 		//int[] is written to return array
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i=0;i<=4;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		return arr;
	}
	
	public static void print(int arr[]) {		//void is the return type as we dont need a return from it
		for(int i=0;i<=4;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] =  takeinput();
		print(arr);
		
	}
	
}
