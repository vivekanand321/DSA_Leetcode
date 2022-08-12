class Node {

    int val;
    Node left;
    Node right;
}
public class sum_root_of_leanumber {
    
    StringBuilder sum=new StringBuilder();
    int tsum=0;
    public int sumNumbers(Node root) {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            sum.append(root.val);
            // System.out.println(sum);
            int l=sum.length();
            int len=l;
            for(int i=0;i<l;i++)
            {
                int k=sum.charAt(i)-'0';
                tsum+=k*Math.pow(10,len-1);  
                // System.out.println(k+" "+tsum);
                len--;
            }
            sum.deleteCharAt(sum.length() - 1);
            System.out.println(tsum);
            return tsum;
        }
        sum.append(root.val);
        int left= sumNumbers(root.left);
        int right=sumNumbers(root.right);
        
        return tsum;
        
    }
    public static void main(String[] args) {
        Node root=new Node();
        root.val=1;
        root.left=new Node();
        root.left.val=2;
        root.right=new Node();
        root.right.val=3;
        sum_root_of_leanumber sm=new sum_root_of_leanumber();
        sm.sumNumbers(root);
    }
    
}
