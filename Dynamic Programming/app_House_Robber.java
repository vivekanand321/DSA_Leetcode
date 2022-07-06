//grom given array find max point if element selected .the value will added and the neibhoun+1,n-1, will be deleted.
import java.util.*;
public class app_House_Robber
{
    private static int sol(int[] fholder,int curr,int n,int[] dp)
    {
        if(curr>n)
        {
            return 0;
        }
        if(dp[curr]!=0)
        {
            return dp[curr];
        }
        int rob=fholder[curr]+sol(fholder,curr+2,n,dp);
        int notrob=sol(fholder,curr+1,n,dp);
        // System.out.println("rob is "+rob+ " notrob is "+notrob);
        
        return dp[curr]=Math.max(rob,notrob);
        
    }
    private static void freq(int[] house)
    {
        int k=Integer.MIN_VALUE;
        for(int s:house)
        {
            k=Math.max(s,k);
        }
        // System.out.println("value of k is "+k);
        int[] fholder=new int[k+1];
        for(int x:house)
        {
            fholder[x]+=x;
        }
        System.out.println(Arrays.toString(fholder));
        int[] dp=new int[k+1];
        System.out.println(sol(fholder,0,k,dp));
        System.out.println("dp is"+" "+Arrays.toString(dp) );
        
    }
	public static void main(String[] args) {
	    int[] house={3,4,2};
	    freq(house);

	}
}

