package lab7;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_LinkedList s1 = new Stack_LinkedList();
		Stack_LinkedList s2 = new Stack_LinkedList();
		int choice, val;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println();
			System.out.println("Press 1 to PUsh s1");
			System.out.println("Press 2 to PUsh s2");
			System.out.println("Press 3 to Move Even number to s2");
			System.out.println("Press 4 to Print s1");
			System.out.println("Press 5 to Pop s1");
			System.out.println("Press 6 to Print s2");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter Data");
					val = sc.nextInt();
					s1.puch(val);
					break;
				case 2:
					System.out.println("Enter Data");
					val = sc.nextInt();

					s1.puch2(val);
					break;
				case 3:
					s1.MoveEvenNumber(s1);
					break;
				case 4:
					s1.print();
					break;
				case 5:
					int bb = s1.pop();
					System.out.println(bb);
					break;
				case 6:
					s1.print2();
			}

		} while (choice != 8);
	}

}
