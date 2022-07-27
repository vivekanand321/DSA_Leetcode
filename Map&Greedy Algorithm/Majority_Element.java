import java.util.*;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int n=arr.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr)
        {
            if(mp.containsKey(i))
            {
                int value=mp.get(i);
                value++;
                mp.put(i,value);
            }
            else{
            mp.put(i,1);
            }
        }
        
        for(int k:mp.keySet())
        {
            int val=mp.get(k);
            if(val>n/2)
            {
                System.out.println(k);
            }
           
        }
        

    }
    
}
