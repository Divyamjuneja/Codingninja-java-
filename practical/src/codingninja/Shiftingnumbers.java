package codingninja;
import java.util.*;
public class Shiftingnumbers {
	
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int currentrow=1;
            int n = sc.nextInt();
            
            while(currentrow <= n){
                int value = (2*currentrow) -1;
            	int curr = n;
            
            
            while(curr>0){
                System.out.print(value);
                value +=2;
            if(value>(2*n)-1){
                value = 1;
            }    
             curr -=1;   
            }
            System.out.println();
            currentrow ++;
        }
	}}