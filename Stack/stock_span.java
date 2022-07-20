import java.util.Stack;
//we are usingstackto calculate the previous maximum valued index than current index and for that we are using stack.
//with the help of stack we are storing span to spanarray. 
public class stock_span {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int n=arr.length;
        int[] span=new int[n];
        span[0]=1;
        Stack<Integer> st=new Stack<>();
        st.add(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                System.out.println("poping "+st.pop());
            }
            int l=st.isEmpty()?i+1:i-st.peek();//giving span for particular index
            span[i]=l;
            st.add(i);//storing curent index at peek
            //exception whern graph is in increasing order than we add 1 to curr.
        }
        for(int k:span)
        {
            System.out.println(k);
        }
    }
    
}
