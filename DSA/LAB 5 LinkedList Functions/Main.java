
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedLIST ll = new LinkedLIST();
		int id, pos;
		String name;
		int choice;
		do {
			System.out.println("Enter Choice");
			System.out.println("1:  To Insert Start");
			System.out.println("2:  To Insert End");
			System.out.println("3:  To Insert At ANy POsition");
			System.out.println("4:  TO Delete First");
			System.out.println("5:  TO Delete Last");
			System.out.println("6:  TO Delete At Any Posioton");
			System.out.println("7:  To Delete Second_Last");
			System.out.println("8:  TO Display");
			System.out.println("9:  To Search");
			System.out.println("10: To Update");
			System.out.println("11: To Count Nodes");
			System.out.println("12: To Exit");

			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter Id :");
					id = sc.nextInt();
					System.out.println("Enter NAme :");
					name = sc.next();
					ll.addFirst(id, name);
					break;

				case 2:
					System.out.println("Enter Id :");
					id = sc.nextInt();
					System.out.println("Enter NAme :");
					name = sc.next();
					ll.addLast(id, name);
					break;

				case 3:
					System.out.println("Enter Position");
					pos = sc.nextInt();
					System.out.println("Enter Id :");
					id = sc.nextInt();
					System.out.println("Enter NAme :");
					name = sc.next();
					ll.insertAtSpecific(pos, id, name);
					break;

				case 4:
					ll.delFirst();

					break;
				case 5:
					ll.delLast();
					break;
				case 6:
					System.out.println("Enter Position");
					pos = sc.nextInt();
					ll.delAny(pos);
					break;
				case 7:
					ll.delSecLast();
					break;
				case 8:
					ll.printList();
					break;
				case 9:
					System.out.println("Enter ID TO search");
					id = sc.nextInt();
					ll.search(id);
					break;
				case 10:
					System.out.println("Enter ID TO UPdate Record");
					id = sc.nextInt();
					ll.Update(id);
					break;
				case 11:
					ll.sizeofList();
					break;
				case 12:
					System.exit(0);
					break;

			}
		} while (choice != 12);

	}

}
