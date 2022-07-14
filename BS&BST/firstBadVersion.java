//if havre to find minm ,tyhen we pich the right pointer else 
//if we have to find largest maximun than we use left pointer
public class firstBadVersion {
    private static boolean isbad(char cc)
    {
        if(cc=='B')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        char[] version={'G','G','G','B','B'};
        int n=version.length;
        int l=0;int r=n-1;
        int mid=(l+r)/2;
        while(r>l+1)
        {
            mid=(l+r)/2;
            if(isbad(version[mid]))
            {
                r=mid;
            }
            else{
                l=mid;
            }
            
        }
        System.out.println("index is "+r);
    }
    
}
