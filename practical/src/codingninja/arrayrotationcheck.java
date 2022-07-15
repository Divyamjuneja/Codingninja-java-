package codingninja;

public class arrayrotationcheck {
	public static void main(String args[]) {
		int arr[] = {10,20,30,1};
		int arr1[] = new int[arr.length-1];
		int k=arr[1] - arr[0] ;
		int index=0;
		for(int i=0;i<arr.length-1;i++) {
			int j = arr[i+1] - arr[i];
			arr1[i] = j;
			System.out.print(j);
			}
		for(int j=0;j<arr1.length;j++) {
			if(arr1[j] != arr1[j+1]) {
				index = j;
				break;
			}
		}
		System.out.println(index);
	}
	
}
