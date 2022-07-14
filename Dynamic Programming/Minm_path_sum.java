public class Minm_path_sum {
    private static int sol(int[][] arr,int cr,int cc,int er,int ec)
    {
        if(cr>er || cc>ec)
        {
            return Integer.MAX_VALUE;
        }
        if(cr==er && cc==ec)
        {
            return arr[cr][cc];
        }
        int c1=sol(arr,cr,cc+1,er,ec);
        int c2=sol(arr,cr+1,cc,er,ec);
        return Math.min(c1,c2)+arr[cr][cc];//have to return value where curr is present
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(sol(arr,0,0,2,2));
    }
    
}
