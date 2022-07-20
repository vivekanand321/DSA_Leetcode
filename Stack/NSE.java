import java.util.*;
public class NSE {    
    public static void main(String[] args) {
        int[] arr={50,31,14,35,20};
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int[] nge=new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                nge[st.pop()]=arr[i];
                // System.out.println(arr[st.pop()]+" -> "+arr[i]);
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            nge[st.pop()]=-1;
            // System.out.println(arr[st.pop()]+" -> "+ -1);
        }
        for(int k:nge)
        {
            System.out.println(k);
        }
    }
}
