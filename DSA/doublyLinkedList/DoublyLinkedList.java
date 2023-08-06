package doublyLinkedList;

public class DoublyLinkedList {
	NodeD head;// head || start || first
	NodeD tail;// tail || final || last

	public void addFirst(int d) {
		NodeD n = new NodeD(d);
		if (head == null) {
			head = n;
			tail = n;

			n.next = head;
		} else {
			head.prev = n;
			n.next = head;
			head = n;
		}
	}

	public void addLast(int d) {
		NodeD n = new NodeD(d);
		if (head == null) {
			head = n;
			tail = n;
			n.next = head;
		} else {
			n.prev = tail;
			tail.next = n;
			tail = n;
		}
	}

	public void insrtSpecific(int pos, int val) {
		NodeD n = new NodeD(val);
		if (head == null) {
			head = n;
			tail = n;
			n.next = head;
		} else if (pos == 0 || pos == 1) {
			/*
			 * n.next = head;
			 * head = n;
			 * tail.next=head;
			 */
			n.prev = tail;
			tail.next = n;
			tail = n;
		} else {
			NodeD currNode = head;
			for (int i = 1; i < (pos - 1); i++) {
				currNode = currNode.next;
			}
			n.next = currNode.next;
			currNode.next = n;

		}
	}

	public void delFirst() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		else if (head == tail) {// head==tail -> vheck If one node
			head = null;
			tail = null;
			// head=tail=null;
			return;
		} else {
			head = head.next;
			head.prev = null;
		}

	}

	public void delLast() {
		if (head == null) {
			System.out.println("Lsit Empty");
			return;
		} else if (head == tail) {
			head = null;
			tail = null;
			return;
		} else {
			tail = tail.prev;
			tail.prev.next = null;// it remove secondlast location ky next ko nuul kry ga

		}
	}

	// For SINGLY & Doubly List
	public void printList() {
		if (head == null) {
			System.out.println("List Is Empty");
			return;
		} else {
			NodeD curr = head;
			while (curr != null) {
				System.out.print(curr.data + "->");
				curr = curr.next;
			}
		}
	}

	public void count() {
		NodeD temp = head;
		int count = 0;
		if (head == null) {
			System.out.println("Count is :" + count);

			return;
		}

		do {
			temp = temp.next;
			count++;
		} while (temp != head);

		System.out.println("Count is :" + count);

	}
}

/*
 * Node curr;
 * while(curr.next!=null){
 * curr=curr.next; // To get Last Node using loop
 * }
 */

/*
 * tail.next=newNode; //To get Last Node using tail
 */
