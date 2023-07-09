
import java.util.Scanner;

public class LinkedLIST {
	Scanner sc = new Scanner(System.in);

	Node head = null;

	public void addFirst(int id, String name) {

		Node n = new Node(id, name);
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void printList() {
		if (head == null) {
			System.out.println("List Empty");
		} else {
			Node currNode = head;
			while (currNode != null) {
				System.out.println("ID :" + currNode.id + " ");
				System.out.println("Name :" + currNode.name + " ");
				System.out.println();
				currNode = currNode.next;
			}
		}
	}

	public void addLast(int id, String name) {
		Node n = new Node(id, name);
		// Hmeyn Memory m 1 chunk mill gya hy

		// Next Portion By default Null hota hy
		Node next = null;
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	/*
	 * public void insertAtSpecific(int pos, int id,String name) {
	 * Node n = new Node(id,name);
	 * if(head==null){
	 * head=n;
	 * }
	 * else if (head.next==null) {
	 * n.next = head;
	 * head = n;
	 * } else {
	 * Node currNode = head;
	 * for (int i = 0; i < (pos - 1); i++) {
	 * currNode = currNode.next;
	 * }
	 * n.next = currNode.next;
	 * currNode.next = n;
	 * }
	 * }
	 */

	public void insertAtSpecific(int pos, int id, String name) {

		Node n = new Node(id, name);
		if (head == null) {
			head = n;
		} else if ((pos - 1) == 0) {
			n.next = head;
			head = n;
		} else {

			Node currNode = head;
			for (int i = 1; i == (pos - 1); i++) {

				currNode = currNode.next;
			}
			n.next = currNode.next;
			currNode.next = n;
		}

	}

	public void delFirst() {
		if (head == null) {
			System.out.println("Lsit IS Empty");
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;
		}
	}

	public void delAny(int pos) {

		if (head == null) {
			System.out.println("List Empty");
			return;
		}
		Node temp = head;
		if (pos == 0 || pos == 1) {
			head = temp.next;
			return;
		}

		for (int i = 1; temp != null && i < pos - 1; i++) {
			temp = temp.next;
		}
		if (temp == null || temp.next == null) {
			return;
		}
		Node next = temp.next.next;
		temp.next = next;
	}

	public void sizeofList() {
		int count = 0;
		if (head == null) {
			System.out.println("Size is :" + count);
			return;
		}
		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Size is :" + count);
	}

	public void delLast() {
		if (head == null) {
			System.out.println("Lsit Empty");
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			Node secondlast = head;
			while (secondlast.next.next != null) {
				secondlast = secondlast.next;
			}
			secondlast.next = secondlast.next.next;
		} // End Else
	}

	public void delSecLast() {
		if (head == null) {
			System.out.println("List Empty");
		} else if (head.next == null) {
			// head=null;
			System.out.println("One Node");
		} else if (head.next.next == null) {
			head = head.next;
		} else {
			Node secondlast = head;
			while (secondlast.next.next.next != null) {
				secondlast = secondlast.next;
			}
			secondlast.next = secondlast.next.next;

		}
	}

	public boolean search(int x) {
		Node current = head; // Initialize current
		while (current != null) {
			if (current.id == x) {
				System.out.println("Value found");
				System.out.println("ID :" + current.id + " Name: " + current.name);
				return true; // data found
			}
			current = current.next;
		}
		System.out.println("Value Not Found");
		return false; // data not found
	}

	public void Update(int x) {
		if (head == null) {
			System.out.println("List IS Empty");
			return;
		}

		int val;
		String name1;

		Node current = head;
		while (current != null) {
			if (current.id == x) {
				System.out.println("ENter New ID");
				val = sc.nextInt();
				System.out.println("Enter New Name");
				name1 = sc.next();
				current.id = val;
				current.name = name1;
			}
			current = current.next;
		}

	}

}
