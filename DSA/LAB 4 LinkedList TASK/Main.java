
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList l = new LinkedList();

		int choice;
		do {
			System.out.println("Enter Choice");
			System.out.println("1: To Insert Start");
			System.out.println("2: TO Display");
			System.out.println("3: To Insert End");
			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					l.addFirst();
					break;
				case 2:
					l.printList();
					break;
				case 3:
					l.addLast();
					break;

			}
		} while (choice == 1 || choice == 2 || choice == 3);

	}

}
