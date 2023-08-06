package doublyLinkedList;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {

		DoublyLinkedList dl = new DoublyLinkedList();

		Scanner sc = new Scanner(System.in);
		int choice, val, pos;
		do {
			System.out.println();
			System.out.println("Enter Choice");
			System.out.println("1: To Insert At First");
			System.out.println("2: To Insert At End");
			System.out.println("3: TO Insert AT Any ");
			System.out.println("4: To Delete First");
			System.out.println("5: To Delete Last");
			System.out.println("6: To Delete Any ");
			System.out.println("7: TO Display");
			System.out.println("8: To Get Size OF list");
			System.out.println("9: To Exit");

			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter Value To Add At First");
					val = sc.nextInt();
					dl.addFirst(val);
					break;

				case 2:
					System.out.println("Enter Value To Add At First");
					val = sc.nextInt();
					dl.addLast(val);
					break;

				case 3:
					System.out.println("Enter position");
					pos = sc.nextInt();
					System.out.println("Enter Value To Add");
					val = sc.nextInt();
					dl.insrtSpecific(pos, val);
					break;

				case 4:
					dl.delFirst();
					break;

				case 5:
					dl.delLast();
					break;

				case 6:
					break;

				case 7:
					dl.printList();
					break;
				case 8:
					dl.count();
					break;

				case 9:
					System.exit(0);
					break;

			}
		} while (choice != 9);

	}

}
