import java.util.Iterator;


public class SortedLinkedList implements Iterable<Integer>, Iterator<Integer> {
	
	private Node head = null, tail = null;
	private int index = 0, length = 0;
	
	public static void main(String[] args) {
		SortedLinkedList sll = new SortedLinkedList();
		sll.add(12);
		sll.add(0, 13);

	}
	
	public void sort() {
	}
	
	public void add(int index, int data) {
		if (tail == null) {
			head = tail = new Node(data);
			length++;
		} else {
			if (index == 0) {
				Node n = new Node(data);
				n.next = head;
				head = n;
			}
			Node toAttach = head;
			for (int i = 1; i < index; i++) {
				toAttach = toAttach.next;
			}
			Node n = new Node(data);
			n.next = toAttach.next;
			toAttach.next = n;
			length++;
		}
	}
	
	public void add(int data) {
		if (tail == null) {
			head = tail = new Node(data);
			length++;
		} else {
			tail.next = new Node(data);
			tail = tail.next;
			length++;
		}
	}
	
	
	public int length() {
		return length;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<Integer> iterator() {
		return this;
	}

	private class Node {
		int data;
		Node next, previous;
		
		public Node(int data) {
			this.data = data;
		}
		
		public boolean isLast() {
			return next == null;
		}
	}

}

