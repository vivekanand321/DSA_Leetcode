public class lexography {
    private static void lexo(int start,int end)
    {
        
        if(start>end)
        {
            return;
        }
        System.out.println(start);
        int call=0;
        if(start==0)
        {
            call=1;
        }
        while(call<=9)
        {
            lexo(start*10+call,end);
            call++;
        }

    }
	public static void main(String[] args) {
	    lexo(0,100);
	}
}
