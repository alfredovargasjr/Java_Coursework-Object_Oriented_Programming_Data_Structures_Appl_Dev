import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TreeDriver {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
		BinarySearchTreeNumber treeNum = new BinarySearchTreeNumber();
		System.out.println("Enter the number of Pokemon.");
		int numPokemon = scan.nextInt();
		File inputfile = new File("C://Users//Alfredo//Desktop//pokemon.txt");
		Scanner inF = new Scanner(inputfile);
		for(int i = 0; i < numPokemon; i++)
		{
			String name = inF.next();
			int num = inF.nextInt();
			tree.insert(name, num);
			treeNum.insert(name, num);
		}
		tree.insert("Alfredo", 101);
		tree.delete("Alfredo");
		System.out.println("inOrder:");
		tree.inOrder(tree.root);
		System.out.println("\n\npreOrder:");
		tree.preOrder(tree.root);
		System.out.println("\n\npostOrder:");
		tree.postOrder(tree.root);
		System.out.println();
		Node pred = tree.getPredeccessor();
		System.out.println();
		if(pred != null)
			System.out.println("Predecessor: " + pred.data.toString());
		else
			System.out.println("No predecessor");
		System.out.println("\nHeight: " + tree.getHeight());
		if(tree.isIsomorphic(tree.root, tree.root))
			System.out.println("\nThey are isomorphic.");
		else
			System.out.println("\nThey are not isomorphic");
		
		//binary tree using number
		System.out.println("\nNumber.");
		System.out.println("inOrder:");
		treeNum.inOrder(treeNum.root);
		System.out.println("\n\npreOrder:");
		treeNum.preOrder(treeNum.root);
		System.out.println("\n\npostOrder:");
		treeNum.postOrder(treeNum.root);
		System.out.println();
		Node preds = treeNum.getPredeccessor();
		System.out.println();
		if(preds != null)
			System.out.println("Predecessor: " + preds.data.toString());
		else
			System.out.println("No predecessor");
		System.out.println("\nHeight: " + treeNum.getHeight());
		if(tree.isIsomorphic(tree.root, treeNum.root))
			System.out.println("\nThey are isomorphic.");
		else
			System.out.println("\nThey are not isomorphic");
	}
}
