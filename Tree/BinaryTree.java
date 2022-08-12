import java.util.Scanner;

public class BinaryTree {

	private Scanner sc = new Scanner(System.in);

	public class Node {

		int val;
		Node left;
		Node right;
	}

	private Node root;
	//constructor
	public BinaryTree() {

		this.root = construct(null, true);
	}

	// parent -> null(root)
	// ilc -> true(User wants to give input for left child)
	// ilc -> false(User wants to give input for right child)
	private Node construct(Node parent, boolean isLeftChild) {
		// TODO Auto-generated method stub

		if (parent == null) {
			System.out.println("Enter the data for root node!");
		} else {
			if (isLeftChild) {
				System.out.println("Enter the data for left child of " + parent.val);
			} else {
				System.out.println("Enter the data for right child of " + parent.val);
			}
		}

		int val = sc.nextInt();

		Node node = new Node();
		node.val = val;

		System.out.println("Kya " + node.val + "ka left child hai?");

		boolean kyaLeftHai = sc.nextBoolean(); // true

		if (kyaLeftHai) {
			node.left = construct(node, true);
		}

		System.out.println("Kya " + node.val + "ka right child hai?");

		boolean kyaRightHai = sc.nextBoolean(); // true

		if (kyaRightHai) {
			node.right = construct(node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node root) {
		// TODO Auto-generated method stub

		if (root == null) {
			return;
		}

		String str = "";

		if (root.left != null) {
			str += root.left.val;
		} else {
			str += "_";
		}

		str += " -> " + root.val + " <- ";

		if (root.right != null) {
			str += root.right.val;
		} else {
			str += "_";
		}

		System.out.println(str);

		display(root.left);
		display(root.right);
	}

	public int maxDepth() {
		return this.maxDepth(this.root);
	}
	private int maxDepth(Node root) {

		if(root == null) {
			return 0;
		}
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		
		int meriHeight = Math.max(leftHeight, rightHeight) + 1;
		
		return meriHeight;
	}
	public void preorder()
	{
		this.preorder(this.root);
	}
	private void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println(root.val+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder()
	{
		this.postorder(this.root);
	}
	private void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val+" ");
	}
	public void inorder()
	{
		this.inorder(this.root);
	}
	private void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		
		System.out.println(root.val);
		
		inorder(root.right);

	}
	
	
}