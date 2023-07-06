
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Arryfuntions l = new Arryfuntions();
		Scanner sc = new Scanner(System.in);
		int choice, index;
		do {
			student s = new student();
			System.out.println("1:insert ");
			System.out.println("2:Display Inorder");
			System.out.println("3:Display Preorder");
			System.out.println("4:Display Postorder");
			System.out.println("5:SEARCH");
			System.out.println("6:Exit Menu");
			choice = sc.nextInt();
			if (choice == 1) {

				l.insert(s);
			}

			else if (choice == 2) {
				System.out.println("Enter index NO:");
				index = sc.nextInt();
				l.inorder(0);
			} else if (choice == 3) {
				System.out.println("Enter index NO:");
				index = sc.nextInt();
				l.preorder(index, l);
			} else if (choice == 4) {
				System.out.println("Enter index NO:");
				index = sc.nextInt();
				l.postorder(0);
			} else if (choice == 5) {
				System.out.println("ENter ID");
				int id = sc.nextInt();
				l.search(id, l);
			} else {
				System.exit(0);
			}
		} while (choice != 5);
	}
}
