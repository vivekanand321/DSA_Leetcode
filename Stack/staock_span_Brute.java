public class staock_span_Brute {
    public static void main(String[] args) {
        int[] arr={50,20,30,40,10};
        int n=arr.length;
        int[] span=new int[n];
        span[0]=1;
        for(int i=1;i<n;i++)
        {
            span[i]=1;
            for(int j=i-1;j>0;j--)
            {
                if(arr[j]<arr[i])
                {
                    span[i]++;
                }
                else{
                    break;
                }
            }
        }
        for(int k:span)
        {
            System.out.println(k);
        }
    }
    
}
