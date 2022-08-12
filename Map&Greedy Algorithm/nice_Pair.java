import java.util.*;
public class nice_Pair {
    private static int rev(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={42,11,1,97,97,97};
        int ans=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr)
        {
            int r=rev(i);
            int res=i-r;
            if(!mp.containsKey(res))
            {
                mp.put(res,1);
            }
            else
            {
                int l=mp.get(res);
                
                ans=ans+l;
                l++;
                
                mp.put(res,l);
            }
        }
        System.out.println(ans);
    }
    
}
