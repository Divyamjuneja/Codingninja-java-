package codingninja;
import java.util.*;
public class leader
{
    // function for finding leaders
    public static void leaderprint(int input[])
    {
        for (int i = 0; i < input.length; i++)
        {
            for (int j = i; j < input.length; j++)
            {
                if (input[i] < input[j])
                {
                    break;
                }
	
                if (j == input.length - 1)
                    System.out.print(input[i]);
            }
        }
    }
    
    public static void main (String[] args)
    {
        int arr[] = { 7, 6, 4, 5, 0, 1 ,5};
        int n = arr.length;
		
        // calling function
        leaderprint(arr);
    }
}