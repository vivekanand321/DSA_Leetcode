public class fibonacci {
 
    private static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int c1=fib(n-1);
        int c2=fib(n-2);
        return c1+c2;
    }
	public static void main(String[] args) {
	    System.out.println(fib(4));
	    
	}
}


    

