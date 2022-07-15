package codingninja;
import java.util.Scanner;

public class sumofn {
		/*public static void main(String arg[]) {
			Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int m=1;
			int k=0;
			while(m<=n) {
				System.out.println("m=" + m);
				k = k+m;
				m++;
				
			}
			System.out.println("k=" + k);*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=1;
        int sum=0;
        
        while(m<=n){
        	if (m%2==0){
                sum = sum+m;
            }
            m++;

        }
    	System.out.println(sum);
 
       
        
			
}
}