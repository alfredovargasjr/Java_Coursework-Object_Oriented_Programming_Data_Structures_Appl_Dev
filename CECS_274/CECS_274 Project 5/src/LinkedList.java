
public class LinkedList {
	private static int size;
	private Node head;
	private Node tail;
	//default constructor
	//construct an initially empty list
	public LinkedList() {
		size = 0;
		head = null;
		tail = null;
	}

	/**
	 *
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 *
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	// returns (but does not remove) the first element
	public Element first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}

	// returns (but does not remove) the last element
	/**
	 *
	 * @return
	 */
	public Element last() {
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	// add element to the front of the list
	/**
	 *
	 * @param e
	 */
	// add element to the front of the list
	public void addFirst(Element e) {
		// create and link a new node
		head = new Node(e, head);
		// special case: new node becomes tail
		if (size == 0)
			tail = head;
		size++;
	}

	// add element to the end of the list
	public void addLast(Element e) {
		Node newest = new Node(e, null);
		tail.setNext(newest);
		tail = newest;
		if (size == 0)
			head = tail;
		size++;
	}

	// remove and return the first element
	public Element removeFirst() {
		if(size == 0)
			tail = head;
		head = head.getNext();
		size--;
		return head.getElement();
	}

	// inserts the specified element at the specified position in this list
	public void add(Element data, int index) {
		Node pointer = head;
		for(int i = 1; i < index - 1; i++)
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

	// returns the element at the specified position in this list.
	public Element get(int index) {
		Node pointer = head;
		for(int i = 0; i < index - 1; i++)
		{
			pointer = pointer.getNext();
		}
		return pointer.getElement();
	}

	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		Node pointer = head;
		for(int i = 1; i < index - 1; i++)
		{
			pointer = pointer.getNext();
		}
		pointer.setNext(pointer.getNext().getNext());
		size--;
		return size == 0;	
	}

	public String toString() {
		String output = " HERE ";
		if (head != null) {
			output = "[" + head.getElement().toString() + "]";
			Node current = head.getNext();
			while (current != null) {
				output += "[" + current.getElement().toString() + "]";
				current = current.getNext();
			} // while
		} // if
		return output;
	}// toString()
}
