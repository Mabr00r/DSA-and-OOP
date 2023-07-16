package lab11;

import java.util.*;

public class TREE {

	BOOK root;
	Scanner sc = new Scanner(System.in);

	public void Inert(BOOK x) {

		if (root == null) {
			root = x;
		} else {
			BOOK temp = root;
			while (true) {
				if (temp.id < x.id) {
					if (temp.r == null) {
						temp.r = x;
						break;
					} else {
						temp = temp.r;
					}
				} // if end

				else {
					if (temp.l == null) {
						temp.l = x;
						break;
					} else {
						temp = temp.l;
					}
				} // else end

			} // while

		} // else
	}// function

	public void display() {
		BOOK temp = root;
		do {
			System.out.println("ID :" + temp.id);
			System.out.println("EDITION :" + temp.edition);
			System.out.println("TITLE :" + temp.title);
			temp = temp.r;
		} while (temp != null);

	}

	public void search() {
		if (root == null) {
			System.out.println("EMpty");
		} else {
			int srch_age;
			System.out.println("Enter ID to Search");
			srch_age = sc.nextInt();
			BOOK t = root;

			while (t != null) {
				if (t.id == srch_age) {
					System.out.println("ID :" + t.id);
					System.out.println("EDITION :" + t.edition);
					System.out.println("TITLE :" + t.title);
					break;
				} else if (t.id < srch_age) {
					t = t.r;
				} else {
					t = t.l;
				}

			} // while
			if (t == null) {
				System.out.println("Not Found");
			}
		}

	}

	// InOrder //PostOrder // PreOrder

	// PostOrder
	public void traversePOST(BOOK t) {
		if (t == null)
			return;
		else {
			traversePOST(t.l);
			traversePOST(t.r);
			System.out.println("ID :" + t.id);
			System.out.println("EDITION :" + t.edition);
			System.out.println("TITLE :" + t.title);

		}
	}

	// PREORDER
	public void traversePRE(BOOK t) {
		if (t == null)
			return;
		else {
			System.out.println("ID :" + t.id);
			System.out.println("EDITION :" + t.edition);
			System.out.println("TITLE :" + t.title);
			traversePRE(t.l);
			traversePRE(t.r);
		}
	}

	// INORDER

	public void traverseIN(BOOK t) {
		if (t == null)
			return;
		else {
			traverseIN(t.l);
			System.out.println("ID :" + t.id);
			System.out.println("EDITION :" + t.edition);
			System.out.println("TITLE :" + t.title);
			traverseIN(t.r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TREE tr = new TREE();

		int ch;
		do {
			BOOK t = new BOOK();
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER CHOICE");
			System.out.println("1: INSERT");
			System.out.println("2: DISPLAY");
			System.out.println("3: SEARCH");
			System.out.println("4: Traverse POST_ORDER");
			System.out.println("5: Traverse PRE_ORDER");
			System.out.println("6: Traverse IN_ORDER");
			System.out.println("7: Exit");
			ch = sc.nextInt();

			switch (ch) {
				case 1:

					System.out.println("Enter ID");
					t.id = sc.nextInt();
					System.out.println("Enetr EDITIOn");
					t.edition = sc.next();

					System.out.println("Enter Title");
					t.title = sc.next();
					tr.Inert(t);
					break;
				case 2:
					tr.display();
					break;
				case 3:
					tr.search();
					break;
				case 4:
					tr.traversePOST(tr.root);
					break;
				case 5:
					tr.traversePRE(tr.root);
					break;
				case 6:
					tr.traverseIN(tr.root);
					break;
				case 7:
					System.exit(0);
			}
		} while (ch != 7);

	}

}
