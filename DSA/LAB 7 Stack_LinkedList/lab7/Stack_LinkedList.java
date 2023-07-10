package lab7;

public class Stack_LinkedList {
	Node top; // top OR head
	Node top2;

	Stack_LinkedList() {
		top = null;
		top2 = null;
	}

	// insert at first
	public void puch(int d) {
		Node n = new Node(d);
		if (top == null) {
			top = n;
		} else {
			n.next = top;
			top = n;
		}
	}

	public void puch2(int d) {
		Node n = new Node(d);
		if (top2 == null) {
			top2 = n;
		} else {
			n.next = top2;
			top2 = n;
		}
	}

	// delete first
	public int pop() {
		if (top == null) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int d = top.data;
			top = top.next;
			return d;
		}
	}

	public void print() {
		Node curr = top;
		while (curr != null) {

			System.out.println(curr.data + "-> ");
			curr = curr.next;
		}
	}

	public void print2() {
		Node curr = top2;
		while (curr != null) {

			System.out.println(curr.data + "-> ");
			curr = curr.next;
		}
	}
	/*
	 * int e=0,o=0; int a;
	 * for(int i=s.top;i>=0;i--){
	 * a =s.pop();
	 * if((a%2)==0){
	 * even.push(a);
	 * e++;
	 * 
	 * }else{
	 * odd.push(a);
	 * o++;
	 * }
	 * }
	 * System.out.println("EVEN "+e);
	 * even.print();
	 * System.out.println("ODD "+o);
	 * odd.print();
	 */

	public void MoveEvenNumber(Stack_LinkedList s) {
		Stack_LinkedList even = new Stack_LinkedList();
		Stack_LinkedList odd = new Stack_LinkedList();
		Node curr = top;
		while (curr != null) {
			int a = s.pop();
			if (a % 2 == 0) {
				even.puch(a);
			} else {
				odd.puch(a);
			}
			curr = curr.next;
		}
		Node c = odd.top;
		while (c != null) {
			int bb = odd.pop();
			puch2(bb);
			s.puch(bb);
			c = c.next;
		}

		System.out.println("Even NUmber");
		even.print();
		System.out.println("ODD NUmber");
		s.print();
	}
}
