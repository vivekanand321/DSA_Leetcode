import java.lang.*;
import java.util.*;
public class coin_change1
{
    private static int ways(int[] arr,int amount,int curr,int[][] dp)
    {
        int include=0;
        int disclude=0;
        if(amount==0)
        {
            
            return 1;
        }
        if(curr>=arr.length || amount<0)
        {
            return 0;
        }
        if(dp[curr][amount]!=-1)
        {
            return dp[curr][amount];
        }
        if(arr[curr]<=amount)
        {
           include=ways(arr,amount-arr[curr],curr,dp);
        }
       disclude=ways(arr,amount,curr+1,dp);
       return dp[curr][amount]=include+disclude;
    }
	public static void main(String[] args) {
	    int amount=2;
	    int[] arr={1,2,5};
	    int[][] dp=new int[arr.length+1][amount+1];
	    for(int[] row:dp)
	    {
	        Arrays.fill(row,-1);
	    }
	    System.out.println(ways(arr,amount,0,dp));
	}
}

