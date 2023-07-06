package carCaseStudy;

public class LinkedList {
	Node head;

	public void insertAtStart(Car c) {
		Node n = new Node(c);
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public int count() {
		Node curr = head;
		int count = 0;
		if (head == null) {
			return 0;
		} else {
			while (curr != null) {
				count++;
				curr = curr.next;
			}
			return count;
		}
	}

	public void charge() {
		Node curr = head;
		while (curr != null) {
			if ((curr.data.model) > 2015) {
				curr.data.price = (curr.data.price + 20000);
			} else if ((curr.data.model) < 2010) {
				curr.data.price = (curr.data.price - 5000);
			}
			curr = curr.next;
		}

	}

	public void display(int model) {
		Node curr = head;
		if (curr == null) {
			System.out.println("Linked Not Exist");
		} else {
			while (curr != null) {

				if (curr.data.model == model) {
					System.out.println(curr.data.regNum + " " + curr.data.model + " "
							+ curr.data.price);
				}
				curr = curr.next;
			} // while
		}
	}

}
