package codingninja;


import java.util.*;

public class arraymultipletestcases {
	public static int sum(int[] arr) {
		int n = arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int j=1;j<=test; j++) {
			int terms = sc.nextInt();
			int arr[] = new int[terms];
				for(int i=0;i<terms;i++) {
					arr[i] = sc.nextInt();
			}
			int s=sum(arr);
			System.out.print(s);
		}
	}

	}
/*		public static void print(int arr[]) {
for(int i=0;i<arr.length;i++) {
System.out.println(arr[i] + " ");
}
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
while(t>0){
int arrSize = sc.nextInt();
int arr[] = new int[arrSize];
for(int i =0;i<arrSize;i++) {
	arr[i] = sc.nextInt();
}
print(arr);
t--;
}
}
*/