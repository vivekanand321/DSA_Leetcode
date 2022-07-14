import java.util.*;
public class largest_Increasing_subsequence {
    private static int sol(int[] arr,int prev,int curr,int n,int[][] dp)
    {
        // System.out.println("prev is "+prev+" curr is "+curr);
        int inc=0;int exc=0;
        if(curr>=n)
        {
            return 0;
        }
        
        if(dp[prev+1][curr]!=-1)
        {
            return dp[prev+1][curr];
        }
        if(prev==-1 ||arr[curr]>arr[prev])
        {
            
            inc=1+sol(arr,curr,curr+1,n,dp);
        }
        exc=sol(arr,prev,curr+1,n,dp);
        return dp[prev+1][curr]=Math.max(inc,exc);
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        int k=arr.length;
        int[][] dp=new int[k+1][k];
        for(int[] j:dp)
        {
            Arrays.fill(j,-1);
        }
        
        System.out.println(sol(arr,-1,0,arr.length,dp));

    }
    
}
