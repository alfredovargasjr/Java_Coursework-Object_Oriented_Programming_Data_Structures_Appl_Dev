
public class CircularlyLinkedList {
	// implement the Circularly linked list class.
	// With all the method in the linked list class besides rotate() method
	private Node tail;
	private int size;
	
	/**
	 * default constructor 
	 */
	public CircularlyLinkedList()
	{
		tail = null;
		size = 0;
	}
	
	/**
	 * 
	 * @return if size == 0
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	//return first element
	public Element first()
	{
		if(isEmpty())
			return null;
		return tail.getNext().getElement();
	}
	
	//return last element
	public Element last()
	{
		if(isEmpty())
			return null;
		return tail.getElement();
	}
	
	//rotate the link, set last to first
	public void rotate()
	{
		if(tail != null)
			tail = tail.getNext();
	}
	
	//add element to front
	public void addFirst(Element e)
	{
		Node newest = new Node(e, null);
		if(tail == null)
		{	
			tail = newest;
			tail.setNext(tail);
		}
		else
		{
			newest.setNext(tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	//add element at tail
	public void addLast(Element e)
	{
		if(tail != null){
			addFirst(e);
			tail = tail.getNext();
		}
	}
	
	//remove first element 
	public Element removeFirst()
	{
		if(isEmpty())
			return null;
		else
		{
			tail.setNext(tail.getNext().getNext());
			size--;
		}
		return tail.getNext().getElement();
	}
	
	//remove last element 
	public Element removeLast()
	{
		if(isEmpty())
			return null;
		else{
			Node pointer = tail.getNext();
			for(int i = 1; i < size - 1; i++)
			{
				pointer = pointer.getNext();
			}
			pointer.setNext(tail.getNext());
			tail = pointer;
			size--;
		}
		return tail.getElement();
	}
	
	//add an element at any index
	public void add(Element data, int index) {
		Node pointer = tail;
		for(int i = 1; i < index; i++)
		{
			pointer = pointer.getNext();
		}
		if (index == 1)
			addFirst(data);
		else {
			Node newest = new Node(data, pointer.getNext());
			pointer.setNext(newest);
		}
		size++;
	}
	
	//remove any element at any index
	public void remove(int index) {
		Node pointer = tail;
		for(int i = 1; i < index; i++)
		{
			pointer = pointer.getNext();
		}
		pointer.setNext(pointer.getNext().getNext());
		size--;
	}
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Element getElement(int index)
	{
		Node pointer = tail;
		for(int i = 1; i < index; i++)
		{
			pointer = pointer.getNext();
		}
		return pointer.getElement();
	}
	
	/**
	 * return description
	 */
	public String toString()
	{
		String output = "";
		
		if(tail != null)
		{
			Node head = tail.getNext();
			tail.setNext(null);
			Node current = head;
			while(current != null)
			{
				output = output + "[" + current.getElement().toString() + "]" + " "; 
				current = current.getNext();
			}
			tail.setNext(head);
		}
		return output;
	}
}