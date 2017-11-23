
public class BinarySearchTree 
{
	//data members
	public Node root;
	private static int height;
	
	/**
	 * 
	 */
	public BinarySearchTree()
	{
		root = null; 
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public boolean findName(String n)
	{
		Node current = root;
		while(current != null)
		{
			if(current.data.getName().equals(n))
				return true;
			else{
			if(!compareNameLessThan(n, current.data.getName()))
				current = root.right;
			else
				current = root.left;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param n
	 * @param num
	 */
	public void insert(String n, int num)
	{
		int h = 1;
		Node newNode = new Node(new Pokemon(n, num));
		if(root == null)
		{
			root = newNode;
			height = 1;
		}
		else
		{
			Node current = root;
			Node parent = null;
			boolean leftFlag = false;
			while(current != null)
			{
				parent = current;
				if(compareNameLessThan(current.data.getName(), n))
				{
					current = current.right;
					leftFlag = false;
					h++;
				}
				else
				{
					current = current.left;
					leftFlag = true;
					h++;
				}
			}
			if(leftFlag)
				parent.left = newNode;
			else
				parent.right = newNode;
		}
		if(h > height)
			height = h;
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public boolean delete(String n)
	{
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(!current.data.getName().equals(n))
		{
			parent = current;
			if(compareNameLessThan(current.data.getName(),n))
			{
				current = current.right;
				isLeftChild = false;
			}
			else
			{
				current = current.left;
				isLeftChild = true;
			}
			if(current == null)
				return false;
		}
		//if no children
		if(current.left == null && current.right == null)
		{
			if(current == root)
				root = null;
			if(isLeftChild == true)
				parent.left = null;
			else
				parent.right = null;
		}
		//if has one child
		else if(current.right == null)
		{
			if(current == root)
				root = current.left;
			else if(isLeftChild)
				parent.left = current.left;
			else
				parent.right = current.left;
		}
		else if(current.left == null)
		{
			if(current == root)
				root = current.right;
			else if(isLeftChild)
				parent.left = current.right;
			else
				parent.right = current.right;
		}
		//has two children
		else if(current.left != null && current.right != null)
		{
			Node successor = getSuccessor(current);
			if(current == root)
				root = successor;
			else if(isLeftChild)
			{
				parent.left = successor;
			}
			else
				parent.right = successor;
			successor.left = current.left;
		}
		return true;
	}
	/**
	 * when deleting node, get successor
	 * @param deleNode
	 * @return
	 */
	public Node getSuccessor(Node deleNode)
	{
		Node successor = null;
		Node successorsParent = null;
		Node current = deleNode.right;
		while(current != null)
		{
			successorsParent = successor;
			successor = current;
			current = current.left;
		}
		if(successor != deleNode.right)
		{
			successorsParent.left = successor.right;
			successor.right = deleNode.right;
		}
		return successor;
	}
	
	/**
	 * print in order
	 * @param root
	 */
	public void inOrder(Node root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print("" + root.data + " ");
			inOrder(root.right);
		}
	}
	
	/**
	 * get the right most data from the left branch
	 * @return
	 */
	public Node getPredeccessor()
	{
		Node parent = null;
		Node current = root;
		if(current != null)
			current = current.left;
		else
			return current;
		while(current != null)
		{
			parent = current;
			current = current.right;
		}
		return parent;	
	}
	
	/**
	 * display, root - left - right
	 * @param root
	 */
	public void preOrder(Node root)
	{
		if(root != null)
		{
			System.out.print("" + root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	/**
	 * display left - right - root
	 * @param root
	 */
	public void postOrder(Node root)
	{
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print("" + root.data + " ");
		}
	}
	
	public boolean compareNameLessThan(String n1, String n2)
	{
		int charPos = 0;
		if (n1.charAt((charPos)) == n2.charAt(charPos)) 
		{
			while (n1.charAt(charPos) == n2.charAt(charPos)) 
			{
				charPos++;
				if(charPos == n1.length() - 1 || charPos == n2.length() - 1){
					if(n1.length() < n2.length())
						return true;
					else
						return false;
				}
			}
			if (n1.charAt(charPos) < n2.charAt(charPos)) 
			{
				return true;
			}
		}
		else
		{
			if(n1.charAt((charPos)) < n2.charAt(charPos))
				return true;
		}
		return false;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public boolean isIsomorphic(Node tree1, Node tree2)
	{
		if(tree1 == null && tree2 == null)
			return true;
		if(tree1 == null || tree2 == null)
			return false;
		return (isIsomorphic(tree1.left, tree2.left) && isIsomorphic(tree1.right, tree2.right)) 
			 || (isIsomorphic(tree1.left, tree2.right) && isIsomorphic(tree1.right, tree2.left));
		
	}

}
