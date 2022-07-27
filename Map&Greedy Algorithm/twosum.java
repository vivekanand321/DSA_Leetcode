import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int tar=14;
        Map<Integer,Integer> mp=new HashMap<>();
        //[2]O(n),substracting from target and check that element,one exceptiion aises when we search fro 14 it will provide[1,1] to resolve it we are going to put condition 
        List<Integer> lt=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],i);
        }
        for(var i:mp.entrySet())
        {
            int find=tar-i.getKey();
            int val=i.getValue();
            if(mp.containsKey(find) && mp.get(find)!=val)
            {
                lt.add(i.getValue());
                lt.add(mp.get(find));
                break;
            }

        }
        //[1]BruteForce
        //List<Integer> lt=new ArrayList<>();
        // for(int i=0;i<mp.size();i++)
        // {
        //     for(int j=i+1;j<mp.size();j++)
        //     {
        //         if((mp.get(i)+mp.get(j))==tar)
        //         {
                    
        //             lt.add(i);
        //             lt.add(j);
        //         }
        //     }
        // }
        System.out.println(lt);

    }
    
}
