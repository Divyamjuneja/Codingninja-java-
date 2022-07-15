package codingninja;
import java.lang.Math;
import java.util.*;
public class armstrong {
	public static void main(String args[]) {
		int n=1634;
		int in = n;
		int i=n;
		
		int count=0;
		while(i!=0) {
			i = i/10;
			
			count++;
		}
		int j=count;
		int k;
		int tot=0;
		while(j!=0) {
			k = n%10;
			n = n/10;
			tot = (int) (tot + (Math.pow(k, count)));
			j--;
		}
		   System.out.println(tot);
		if(tot == in){
            System.out.println("true");
            }
            else{
            System.out.println("false");
                
            }
		//System.out.print(count);
	}
}
