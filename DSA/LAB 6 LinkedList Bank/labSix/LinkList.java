package labSix;

public class LinkList {
	Nod head;

	public void createAccount(int aid, String fName, double cBal) {
		Nod n = new Nod(aid, fName, cBal);
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void checkBalance(int account_id) {
		Nod curr = head;
		if (curr == null) {
			System.out.println("Linked Not Exist");
		} else {
			while (curr != null) {

				if (curr.account_id == account_id) {
					System.out.println(curr.currbal + " " + curr.account_id);
				}
				curr = curr.next;
			} // while

		}

	}

	public void withdraw(int account_id, int amount) {
		Nod curr = head;
		if (curr == null) {
			System.out.println("Linked Not Exist");
		} else {
			while (curr != null) {

				if (curr.account_id == account_id) {
					curr.currbal = curr.currbal - amount;
				}
				curr = curr.next;
			} // while

		}

	}

	public void deposit(int account_id, int amount) {
		Nod curr = head;
		if (curr == null) {
			System.out.println("Linked Not Exist");
		} else {
			while (curr != null) {

				if (curr.account_id == account_id) {
					curr.currbal = curr.currbal + amount;
				}
				curr = curr.next;
			} // while

		}

	}

	public void Display(int account_id) {
		Nod curr = head;
		if (curr == null) {
			System.out.println("Linked Not Exist");
		} else {
			while (curr != null) {

				if (curr.account_id == account_id) {
					System.out.println("Current Balance :" + curr.currbal + "Account ID: " + curr.account_id
							+ "Name :" + curr.fullName);
				}
				curr = curr.next;
			} // while

		}

	}

}