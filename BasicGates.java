
import java.util.*;

public class BasicGates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Press 1 for AND GATE");
			System.out.println("Press 2 for OR GATE");
			System.out.println("Press 3 for NOT GATE");
			System.out.println("Press 4 for NAND GATE");
			System.out.println("Press 5 for NOR GATE");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					AND();
					break;
				case 2:
					OR();
					break;
				case 3:
					NOT();
					break;
				case 4:
					NAND();
					break;
				case 5:
					NOR();
					break;
			}
		} while (choice != 6);

	}

	public static void AND() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number ");
		int n1 = sc.nextInt();
		System.out.println("ENter Number ");
		int n2 = sc.nextInt();
		int n3 = n1 * n2;
		System.out.println(n1 + " " + n2 + " : " + n3);

	}

	public static void OR() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number 1");
		int n1 = sc.nextInt();
		System.out.println("ENter Number 2");
		int n2 = sc.nextInt();
		int n3 = n1 + n2;

		if (n3 == 2) {
			n3 = 1;
		}
		System.out.println("Output IS :" + n3);

	}

	public static void NOT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number");
		int n1 = sc.nextInt();
		if (n1 == 0) {
			n1 = 1;
		} else {
			n1 = 0;
		}

		System.out.println("Output IS : " + n1);

	}

	public static void NAND() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number 1");
		int n1 = sc.nextInt();
		System.out.println("ENter Number 2");
		int n2 = sc.nextInt();
		int n3 = n1 * n2;
		if (n3 == 0) {
			n3 = 1;
		} else {
			n3 = 0;
		}

		System.out.println("Output IS : " + n3);

	}

	public static void NOR() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number 1");
		int n1 = sc.nextInt();
		System.out.println("ENter Number 2");
		int n2 = sc.nextInt();
		int n3 = n1 + n2;
		if (n3 == 0) {
			n3 = 1;
		} else if (n3 == 2) {
			n3 = 0;
		} else {
			n3 = 0;
		}

		System.out.println("Output IS : " + n3);

	}

}
