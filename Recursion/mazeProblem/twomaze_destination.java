package mazeProblem;

public class twomaze_destination {
    
    private static void twomaze(int cr,int cc,int er,int ec,String ans)
    {
        if(cr==er && cc==ec)
        {
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec)
        {
            return;
        }
        twomaze(cr,cc+1,er,ec,ans+"R");
        twomaze(cr+1,cc,er,ec,ans+"D");
        
    }
	public static void main(String[] args) {
	    twomaze(0,0,2,2,"");
	}
}
