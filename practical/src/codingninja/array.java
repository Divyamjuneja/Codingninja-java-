package codingninja;

public class array {
	public static void mul(int [] arr)
	{
	    for(int i=0;i<5;i++)
	    arr[i]=arr[i]*i;		//	0	2	9	16	25						0	2	6	12	20			

	}
	public static void main (String[] args) {
	    int arr[]={1,2,3,4,5};
	    mul(arr);
	    for(int i=0;i<5;i++)
	    {
	        System.out.print(arr[i]);
	    }
	}
}
