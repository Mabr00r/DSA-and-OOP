
import java.util.*;

public class LinkedList {

	Node head;
	Node start = null;

	public void addFirst() {
		Scanner sc = new Scanner(System.in);
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

	public void addLast() {
		Scanner sc = new Scanner(System.in);
		Node n = new Node();
		// Hmeyn Memory m 1 chunk mill gya hy
		System.out.println("Enter Id :");
		n.id = sc.nextInt();

		System.out.println("Enter Name :");
		n.name = sc.next();

		System.out.println("Enter Salary :");
		n.salary = sc.nextInt();

		// Next Portion By default Null hota hy
		Node next = null;
		if (start == null) {
			start = n;
		} else {
			Node temp = start;
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
}
