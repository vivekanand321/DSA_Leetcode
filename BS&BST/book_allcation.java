import javax.sound.sampled.SourceDataLine;

public class book_allcation {
    private static boolean canreadall(int[] arr,int maxnopage,int noofsudent)
    {
        int countstu=1;
        int sumpage=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("i is"+i+" "+countstu+" "+sumpage+" "+maxnopage);
            if(countstu>noofsudent)
            {
                return false;
            }
            
            if(sumpage+arr[i]<=maxnopage)
            {
                sumpage+=arr[i];
            }
            else
            {
                countstu++;
                sumpage=arr[i];
            }
        }
        if(countstu>noofsudent)
            {
                return false;
            }
        return true;

    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int nostudent=2;
        int l=0;
        int r=100;
        while(r>l+1)
        {
            int maxnopage=(l+r)/2;
            System.out.println(l+"  "+r+" mide Point is"+maxnopage);
            System.out.println(canreadall(arr,maxnopage,nostudent));
            if(canreadall(arr,maxnopage,nostudent))
            {
                r=maxnopage;
            }
            else
            {
                l=maxnopage;
            }
        }
        System.out.println(r);

    }

}