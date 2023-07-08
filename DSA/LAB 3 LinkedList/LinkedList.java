
import java.util.*;

public class LinkedList {

	Scanner sc = new Scanner(System.in);
	Node head;

	public void addLast() {

		Node n = new Node();
		// Hmeyn Memory m 1 chunk mill gya hy
		System.out.println("Enter Id :");
		n.id = sc.nextInt();

		System.out.println("Enter Name :");
		n.name = sc.next();

		System.out.println("Enter Salary :");
		n.salary = sc.nextInt();

		// Next Portion By default Null hota hy
		// Node next=null;
		if (head == null) {
			head = n;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			// Address is in n
			// A12
			// B12
			// C12
			// D12
		}
	}

	public void addFirst() {

		Node n = new Node();

		System.out.println("Enter NAme :");
		n.name = sc.nextLine();
		System.out.println("Enter Id :");
		n.id = sc.nextInt();

		System.out.println("Enter Salary :");
		n.salary = sc.nextInt();

		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void insertAt() {
		Node n = new Node();
		System.out.println("Enter Position");
		int pos = sc.nextInt();

		System.out.println("Enter Id :");
		n.id = sc.nextInt();

		System.out.println("Enter Salary :");
		n.salary = sc.nextInt();

		System.out.println("Enter NAme :");
		n.name = sc.next();

		if ((pos - 1) == 0) {
			n.next = head;
			head = n;
		} else {
			Node currNode = head;
			for (int i = 1; i < (pos - 1); i++) {
				currNode = currNode.next;
			}
			n.next = currNode.next;
			currNode.next = n;

		}
	}

	public void printList() {
		if (head == null) {
			System.out.println("List Empty");
		}
		Node currNode = head;

		while (currNode != null) {
			System.out.println("ID :" + currNode.id + " ");
			System.out.println("Name :" + currNode.name + " ");
			System.out.println("Salary :" + currNode.salary + " ");
			System.out.println();
			currNode = currNode.next;
		}

	}

	public void delFirst() {
		Node n = new Node();
		if (head == null) {
			System.out.println("Lsit IS Empty");
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			head = head.next;

		}
	}

	public void delAny() {
		Node n = new Node();
		if (head == null) {
			System.out.println("List Empty");
			return;
		}

		Node temp = head;
		System.out.println("Enter Position");
		int pos = sc.nextInt();

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

	public void count() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Count is :" + count);
	}

	public void delLast() {
		if (head == null) {
			System.out.println("Lsit Empty");
		} else if (head.next == null) {
			head = null;
		} else {
			Node secondlast = head;
			while (secondlast.next.next != null) {
				secondlast = secondlast.next;
			}
			secondlast.next = secondlast.next.next;
		}
	}

}
