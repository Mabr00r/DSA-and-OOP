
import java.util.*;

public class Arrays {

	int id;
	int name;
	static int index;
	Scanner sc = new Scanner(System.in);

	public void insert() {
		System.out.println("ENter your id");
		id = sc.nextInt();
		System.out.println("ENter YOUR NAMe");
		name = sc.nextInt();
	}

	public void dislay() {
		System.out.println("ENter your id" + id);

		System.out.println("ENter YOUR NAMe" + name);

	}

	public void search(Arrays[] std) {
		System.out.println("ENter id too search");
		int sid = sc.nextInt();
		for (int i = 0; i < index; i++) {
			if (std[i].id == sid) {
				System.out.println("Your record found at position" + (i + 1));
				break;
			}
		}
	}

	public void display() {

	}

	public static void main(String[] args) {
		Arrays obj = new Arrays();
		Arrays[] std = new Arrays[10];

		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Press 1 to insert");
			System.out.println("Press 2 to display");
			System.out.println("Press 3 to search");
			choice = sc.nextInt();
			if (choice == 1) {
				std[index] = new Arrays();
				std[index].insert();
				index++;
			}
			if (choice == 2) {
				for (int i = 0; i < index; i++) {
					std[i].dislay();
				}
			}
			if (choice == 3) {
				obj.search(std);

			}
			if (choice == 4) {

			}

		} while (choice != 5);
	}

}
