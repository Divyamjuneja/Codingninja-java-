package codingninja;
import java.util.Scanner;

public class TwoDArrayInput{
	public static void print2DArray(int input[][]) {
		       int k=input.length; 
		       
       System.out.print("\nData you entered : \n");
       for (int i = 0; i< input.length; i++) {
       	for(int a=0;a<k;a++) {
       	for (int j = 0; j< input[i].length; j++) {
           	System.out.print(input[i][j] + " ");
           }
 
           System.out.println();
       }
           k--;
}
	}

    public static void main(String args[]){
        
       System.out.print("Enter 2D array size : ");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       int k=rows; 
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        
        /* for(int []x:twoD){
            for(int y:x){
            System.out.print(y+"        ");
            }
            System.out.println();
        }*/
        
    }  
    
}