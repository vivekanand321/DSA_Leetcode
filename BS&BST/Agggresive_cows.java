
import java .util.*;

class Aggressive_cows
{
    private static boolean canplace(int[] stalls,int cows,int mindist)
    {
        int posplaced=stalls[0];//placing a cow at initial position
        int numplaced=1;//so the coubnt will increase by one
        for(int curr=1;curr<stalls.length;curr++)
        {
            if(numplaced==cows)
            {
                return true;
            }
            if(stalls[curr] -posplaced >=mindist)
            {
                numplaced++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] stalls={1,2,4,8,13};
        int cows=3;
        Arrays.sort(stalls);
        int n=stalls.length;
        int l=0;
        int r=stalls[n-1]-stalls[l];//iyer and jethalal
        while(r>l+1)
        {
            int mindist=(l+r)/2;
            if(canplace(stalls,cows,mindist))
            {
                l=mindist;
            }
            else
            {
                r=mindist;
            }
        }
        System.out.println(l);
    }
}