package lab10;

import java.util.Scanner;

public class BST {
	Students root;
	Scanner sc = new Scanner(System.in);

	public void Inert(Students x) {

		if (root == null) {
			root = x;
		} else {
			Students temp = root;
			while (true) {
				if (temp.age < x.age) {
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

	public void search() {
		if (root == null) {
			System.out.println("EMpty");
		} else {
			int srch_id;
			System.out.println("Enter ID to Search");
			srch_id = sc.nextInt();
			Students t = root;

			while (t != null) {
				if (t.id == srch_id) {
					System.out.println("Found");
					System.out.println("AGE :" + t.age);
					System.out.println("ID :" + t.id);
					System.out.println("NAMe :" + t.name);
					System.out.println("CGPA :" + t.cgpa);
					break;
				} else if (t.age < srch_id) {
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

	public void MINIMUM(Students t) {
		if (t == null) {
			return;
		} else {
			if (t.cgpa < 2.0) {
				System.out.println("ID" + t.id);
				System.out.println("Name" + t.name);
				System.out.println("Age" + t.age);
				System.out.println("CGPA" + t.cgpa);
			}
			MINIMUM(t.r);

			MINIMUM(t.l);

		}
	}

	public void MAXIMUM(Students t) {
		if (t == null) {
			return;
		} else {
			/*
			 * while(t1!=null){
			 * if(t1.cgpa>=2.0){
			 * System.out.println("MAXIMUM");
			 * System.out.println("AGE :"+t1.age);
			 * System.out.println("ID :"+t1.id);
			 * System.out.println("NAMe :"+t1.name);
			 * System.out.println("CGPA :"+t1.cgpa);
			 * 
			 * }//if
			 * else if(t1.cgpa<2.0)
			 * t1=t1.r;
			 * else
			 * t1=t1.l;
			 * }//while
			 */

			if (t.cgpa >= 2.0) {
				System.out.println("ID" + t.id);
				System.out.println("Name" + t.name);
				System.out.println("Age" + t.age);
				System.out.println("CGPA" + t.cgpa);
			}
			MAXIMUM(t.r);

			MAXIMUM(t.l);

		} // else
	}

	public void UPDATE(int id) {
		if (root == null) {
			System.out.println("EMpty");
		} else {
			Students t = root;

			while (t != null) {
				if (t.id == id) {
					int AGE;
					int ID;
					double CGPA;
					String NAME;

					System.out.println("ENTER NEW RECORD");
					System.out.println("ENter name");
					NAME = sc.next();
					System.out.println("Enter ID");
					ID = sc.nextInt();
					System.out.println("Enetr AGE");
					AGE = sc.nextInt();
					System.out.println("Enter CGPA");
					CGPA = sc.nextDouble();

					t.age = AGE;
					t.name = NAME;
					t.id = ID;
					t.cgpa = CGPA;
					break;
				} else if (t.age > id) {
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

	// PostOrder
	public void traversePOST(Students t) {
		if (t == null)
			return;
		else {
			traversePOST(t.l);
			traversePOST(t.r);
			System.out.println("ID" + t.id);
			System.out.println("Name" + t.name);
			System.out.println("Age" + t.age);
			System.out.println("CGPA" + t.cgpa);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tr = new BST();
		int ch;
		do {
			Students t = new Students();
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER CHOICE");
			System.out.println("1: INSERT");
			System.out.println("2: DISPLAY/Traverse POST_ORDER");
			System.out.println("3: SEARCH BY ID");
			System.out.println("4: SEARCH Minimum / MAximum student ");
			System.out.println("5: UPDATE RECORD");
			System.out.println("6: Traverse IN_ORDER");
			System.out.println("7: Exit");
			ch = sc.nextInt();

			switch (ch) {
				case 1:

					System.out.println("ENter name");
					t.name = sc.next();
					System.out.println("Enter ID");
					t.id = sc.nextInt();
					System.out.println("Enetr AGE");
					t.age = sc.nextInt();
					System.out.println("Enter CGPA");
					t.cgpa = sc.nextDouble();
					tr.Inert(t);
					break;
				case 2:
					tr.traversePOST(tr.root);
					break;
				case 3:
					tr.search();
					break;
				case 4:
					System.out.println("ENter CHOICE");
					System.out.println("1 DISPLAY CGPA<2.0");
					System.out.println("2 Display CGPA>2.0");
					int choice = sc.nextInt();
					if (choice == 1)
						tr.MINIMUM(tr.root);
					else
						tr.MAXIMUM(tr.root);
					break;
				case 5:
					System.out.println("ENTER ID TO UPDATE");
					ch = sc.nextInt();
					tr.UPDATE(ch);
					break;
				case 7:
					System.exit(0);
			}
		} while (ch != 7);
	}

}
