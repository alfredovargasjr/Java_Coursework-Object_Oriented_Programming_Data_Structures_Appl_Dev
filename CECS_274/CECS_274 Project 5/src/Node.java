
public class Node {
	// data carried by this node. could be of any type you need.
	private Element e;
	// reference to the next node in the chain, or null if there isn't one.
	private Node next;
	/**
	*
	* @param e
	* @param n
	*/
	public Node(Element e, Node n){
	this.e = e;
	next = n;
	}
	/**
	*
	* @param E
	*/
	public void setE(Element E){
	e = E;
	}
	/**
	*
	* @param nextValue
	*/
	public void setNext(Node nextValue){
	next = nextValue;
	}
	/**
	*
	* @return
	*/
	public Node getNext(){
	return next;
	}
	/**
	*
	* @return
	*/
	public Element getElement(){
	return e;
	}
	/**
	*
	*/
	public String toString(){
	return "" + e.getName() + " " + e.getScore() + " ";
	}
}
