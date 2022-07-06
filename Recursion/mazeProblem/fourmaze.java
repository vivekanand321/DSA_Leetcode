package mazeProblem;

public class fourmaze {
    private static void gen(int cr,int cc,int er,int ec,String ans,boolean[][] vis)
    {
        if(cr<0 || cc<0 || cr>er || cc>ec ||vis[cr][cc]==true)
        {
            return;
        }
        if(cr==er && cc==ec)
        {
            System.out.println(ans);
            return;
        }
        vis[cr][cc]=true;
        
        gen(cr-1,cc,er,ec,ans+"U",vis);
        gen(cr,cc+1,er,ec,ans+"D",vis);
        gen(cr+1,cc,er,ec,ans+"L",vis);
        gen(cr,cc-1,er,ec,ans+"R",vis);
        vis[cr][cc]=false;
        
    }
	public static void main(String[] args) {
	    boolean[][] arr=new boolean[3][3];
	    gen(0,0,2,2,"",arr);
	}
}
