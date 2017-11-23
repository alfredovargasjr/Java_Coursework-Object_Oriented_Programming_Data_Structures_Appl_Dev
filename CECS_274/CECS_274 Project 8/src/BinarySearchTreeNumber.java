
public class BinarySearchTreeNumber 
{
	public Node root;
	private static int height;
	
	public BinarySearchTreeNumber()
	{
		root = null; 
	}
	
	public boolean findName(int n)
	{
		Node current = root;
		while(current != null)
		{
			if(current.data.getNumber() == n)
				return true;
			else{
			if(!compareNumberLessThan(n, current.data.getNumber()))
				current = root.right;
			else
				current = root.left;
			}
		}
		return false;
	}
	
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
				if(compareNumberLessThan(current.data.getNumber(), num))
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
	
	public boolean delete(int n)
	{
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(!(current.data.getNumber() == n))
		{
			parent = current;
			if(compareNumberLessThan(current.data.getNumber(),n))
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
	
	public void inOrder(Node root)
	{
		if(root != null)
		{
			inOrder(root.left);
			System.out.print("" + root.data + " ");
			inOrder(root.right);
		}
	}
	
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
	
	public void preOrder(Node root)
	{
		if(root != null)
		{
			System.out.print("" + root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(Node root)
	{
		if(root != null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print("" + root.data + " ");
		}
	}
	
	public boolean compareNumberLessThan(int n1, int n2)
	{
		if(n1 <= n2)
			return true;
		return false;
	}

	public int getHeight()
	{
		return height;
	}
}
