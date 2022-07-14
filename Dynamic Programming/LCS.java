public class LCS {
    public static int sol(String s1,String s2,int n,int m)
    {
        // System.out.println("n is "+n+" m is "+m);
        if(n==0 ||m==0)
        {
            return 0;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1))
        {
            return 1+sol(s1,s2,n-1,m-1);
        }
        int c1=sol(s1,s2,n,m-1);
        int c2=sol(s1,s2,n-1,m);
        return Math.max(c1,c2);

    }
    public static void main(String[] args) {
        String s1="abc";
        String s2="bce";
        System.out.println(sol(s1,s2,s1.length(),s2.length()));
    }
    
}
