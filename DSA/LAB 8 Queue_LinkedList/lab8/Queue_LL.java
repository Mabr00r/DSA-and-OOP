package lab8;

import java.util.*;

public class Queue_LL {
	Compliant c;
	private Compliant c1;

	public Queue_LL() {
		c = null;
	}

	public void Enqueve() {
		Compliant x = new Compliant();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Id");
		x.id = sc.nextInt();
		System.out.println(" name");
		x.name = sc.next();
		sc.nextLine();
		System.out.println("Complain");
		x.complian = sc.nextLine();
		// x.n=null;
		if (c == null) {
			c = x;
		} else {
			Compliant t = c;
			while (t.n != null) {
				t = t.n;
			}
			t.n = x;
		}
	}

	public void Dequeve() {
		if (c == null) {
			System.out.println("list is Empty");
		} else {
			c = c.n;
		}

	}

	public void Display() {
		if (c == null) {
			System.out.println("list is Empty");
		} else {
			Compliant t = c;
			while (t != null) {
				System.out.println("ID :" + t.id);

				System.out.println("Name :" + t.name);
				System.out.println("Complian :" + t.complian);
				t = t.n;
			}
		}
	}

}
