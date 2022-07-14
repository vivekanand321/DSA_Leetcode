

public class edit_distane {
    private static int sol(String s1,String s2,int n, int m)
    {
        if(m==0 && n==0)
        {
            return 0;
        }
        if(n==0)
        {
            return m;
        }
        if(m==0)
        {
            return n;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
                                     return sol(s1,s2,n-1,m-1);
        }
        int insert=sol(s1,s2,n,m-1);
        int replace=sol(s1,s2,n-1,m-1);
        int delete=sol(s1,s2,n-1,m);
        return Math.min(insert,Math.min(replace,delete))+1;
    }
    public static void main(String[] args) {
        String s1="horse";
        String s2="ros";
        int p=sol(s1,s2,s1.length(),s2.length());
        System.out.println("p is "+p);
       
    
}

}
