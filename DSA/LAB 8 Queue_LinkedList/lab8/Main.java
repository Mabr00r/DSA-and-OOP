package lab8;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_LL l = new Queue_LL();

		int op;
		int a;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter Choice");
			System.out.println("Press 1 for Enqueve");
			System.out.println("Press 2 for Dequeve");
			System.out.println("Press 3 for Display");
			op = sc.nextInt();
			switch (op) {
				case 1:
					l.Enqueve();
					break;
				case 2:
					l.Dequeve();
					break;
				case 3:
					l.Display();
			}
		} while (op != 4);

	}

}
