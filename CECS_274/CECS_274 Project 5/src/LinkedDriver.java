
public class LinkedDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		System.out.println(list);
		Element e = new Element("A", 1);
		Element e1 = new Element("B", 2);
		Element e2 = new Element("C", 3);
		Element e3 = new Element("D", 4);
		list.addFirst(e);
		list.addFirst(e1);
		list.addFirst(e2);
		list.addFirst(e3);
		System.out.println(e);
		System.out.println(list);
		list.addLast(e3);
		System.out.println(list);
		list.add(e3, 2);
		System.out.println(list);
		list.addLast(e3);
		System.out.println(list);
		// insert in the circularly linked list
		System.out.println("\nCircularly Linked List");
		CircularlyLinkedList cList = new CircularlyLinkedList();
		cList.addFirst(e);
		cList.addFirst(e1);
		cList.addFirst(e2);
		cList.addFirst(e3);
		System.out.println(cList);
		cList.addFirst(e1);
		System.out.println("Add First\n" + cList);
		cList.removeFirst();
		System.out.println("Remove First\n" + cList);
		cList.addLast(e3);
		System.out.println("Add Last\n" + cList);
		cList.removeLast();
		System.out.println("Remove Last\n" + cList);
		cList.rotate();
		System.out.println("Rotate \n" + cList);
		cList.add(e2, 2);
		System.out.println("Add in element 2 \n" + cList);
		cList.remove(3);
		System.out.println("Remove element 3 \n" + cList);
		cList.add(e1, 2);
		System.out.println(cList);
	}


}
