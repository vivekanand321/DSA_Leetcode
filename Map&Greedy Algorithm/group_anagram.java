import java.util.*;
public class group_anagram {
    public static void main(String[] args) {
        String[] arr={""};
        Map<String ,List<String>> mp=new HashMap<>();
        //in O(n2),making frequency array
        
        for(String st:arr)
        {
            int[] farr=new int[26];
            for(int i=0;i<st.length();i++)
            {
                char cc=st.charAt(i);
                farr[cc-'a']++;
            }
            String ans=Arrays.toString(farr);
            // System.out.println(Arrays.toString(farr).getClass());
            if(!mp.containsKey(ans))
            {
                List<String> lt=new ArrayList<>();
                lt.add(st);
                mp.put(ans,lt);
            }
            else{
                mp.get(ans).add(st);
            }
        }
        System.out.println(mp.values());







        //One way Through sorting,its complexity is o(n3)
        // for(String str:arr)
        // {
        //     char[] chararr=str.toCharArray();
           // Arrays.sort(chararr);
        //    String p=new String(chararr);
        //     if(mp.containsKey(p))
        //     {
        //         mp.get(p).add(str);
        //     }
        //     else{   
        //         List<String> kt=new ArrayList<>();
        //         kt.add(str);
        //         mp.put(p,kt);
        //     }
        // }
        // System.out.println(mp.values());
        
    }
    
}
