public class Nqeen {

    private static boolean canplace(int[][] board,int cr,int cc,int n)
    {
        //up
        for(int i=0;i<n;i++)
        {
            if(board[i][cc]==1)
            {
                return false;
            }
            
        }
        int row=cr;
        int column=cc;
        //right diagonal
        while(row>=0 && column<n)
        {
            if(board[row][column]==1)
            {
                return false;
            }
            row--;
            column++;
        }
        row=cr;
        column=cc;
        //left diagonal
        while(row>=0 && column>=0)
        {
            if(board[row][column]==1)
            {
                return false;
            }
            row--;
            column--;
        }
        return true;
        
    }

    private static void sol(int[][] board , int n ,int cr)
    {
        if(cr==n)//as it goes out of board
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(board[i][j]==1)
                    {
                    System.out.print("Q");
                    }
                    else
                    {
                        System.out.print("_");
                    }
                    
                }
                System.out.println();
                }
            System.out.println();
                System.out.println();
            return;
        }
        for(int cc=0;cc<n;cc++)
        {
            if(canplace(board,cr,cc,n)==true)
            {
                board[cr][cc]=1;
                sol(board,n,cr+1);
                board[cr][cc]=0;
                
            }
        }
        return;
    }
    
	public static void main(String[] args) {
	    int n=4;
	    int [][] board=new int[n][n];
	    sol(board,n,0);
	}
    
}
