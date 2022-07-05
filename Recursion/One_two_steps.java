import java.util.*;

public class One_two_steps
{
    private static int steps(int n,int curr)
    {
        if(curr==n)
        {
            return 1;
        }
        if(curr>n)
        {
            return 0;
        }
        int c1=steps(n,curr+1);
        int c2=steps(n,curr+2);
        return c1+c2;
           
    }
	public static void main(String[] args) {
	    System.out.println(steps(1,0));
	
	}
}

