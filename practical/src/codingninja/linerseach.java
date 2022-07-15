package codingninja;
import java.util.*;

public class linerseach {
    public static int linearSearch(int arr[], int x) {
    	int n = arr.length;
    	for(int i = 0;i<n; i++) {
    		if(arr[i] == x) {
    			return i;
    		}
    	}
    	return -1;
    }
    	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int testcase = sc.nextInt();
			for(int j=1;j<=testcase;j++) {
					int size = sc.nextInt(); 
					int arr[] = new int[size];
					int last = arr[arr.length-1];
					for(int i=0;i<=arr.length-1;i++) {
						arr[i]=sc.nextInt();
					}
					 System.out.println("Enter number to be searched");
					 int x = sc.nextInt();
			int res = linearSearch(arr , x);
			if(res == -1) {
				System.out.print(-1);
			}
			else {
				System.out.print(res);
			}
			
			/*Scanner sc = new Scanner(System.in);
				int testcase = sc.nextInt();
				for(int j=1;j<=testcase;j++) {
						int size = sc.nextInt(); 
						int arr[] = new int[size];
						int last = arr[arr.length-1];
						for(int i=0;i<=arr.length-1;i++) {
							arr[i]=sc.nextInt();
						}
						 System.out.println("Enter number to be searched");
						 int x = sc.nextInt();
						 //System.out.println(arr[2]);
						 for(int i=0;i<=arr.length-1;i++) {
							 if(x == arr[i]) {
							 System.out.println(i);
							 break;
						 }
							if(a!=arr[arr.length-1]) {
								System.out.println(-1);
								 break;
							}
							 }
				}*/
}
}}