
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
			System.out.println("2: To Insert End");
			System.out.println("3: TO Insert AT any");
			System.out.println("4: To Delete First");
			System.out.println("5: To Delete Last");
			System.out.println("6: To Delete_Second_Last");
			System.out.println("7: To Delete Any ");
			System.out.println("8: To Count Nodes");
			System.out.println("9: TO Display");

			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					l.addFirst();
					break;
				case 2:
					l.addLast();
					break;
				case 3:
					l.insertAt();
					break;
				case 4:
					l.delFirst();
					break;
				case 5:
					l.delLast();
					break;
				case 6:
					l.delSecLast();
					break;
				case 7:
					l.delAny();
					break;
				case 8:
					l.count();
					break;
				case 9:
					l.printList();
					break;
			}
		} while (choice >= 1 || choice <= 9);

	}

}