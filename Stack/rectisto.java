import java.util.Stack;

public class rectisto {
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[arr.length];
        int[] nse=new int[arr.length];
        st.add(0);
        //PSE
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                pse[i]=st.peek();
            }
            else{
                pse[i]=-1;
            }
            st.push(i);
        }
        for(int j:pse)
        {
            // System.out.println(j);
        }
        while(!st.isEmpty())
        {
            st.pop();
        }
        
        //NSE
        st.push(0);
        for(int i=1;i<arr.length;i++)
        {
            // System.out.println("element is "+arr[i]+" --->"+" top is "+st.peek() );
            while(!st.isEmpty() && arr[i]<arr[st.peek()])
            {
                nse[st.peek()]=i;
                st.pop();
            }
            
            st.push(i);
        }
        int i=0;
        while(i<nse.length)
        {
            if(nse[i]==0)
            {
                nse[i]=nse.length;
            }
            i++;
        }
        for(int f=0;f<arr.length;f++)
        {
            System.out.println(nse[f]+"  "+pse[f]);
        }
        //Areas
        int max=Integer.MIN_VALUE;
        for(int k=0;k<nse.length;k++)
        {
            int width=nse[k]-pse[k]-1;
            int area=width*arr[k];
            if(area>max)
            {
                max=area;
            }
        }
        System.out.println(max);

    } 
    
}
