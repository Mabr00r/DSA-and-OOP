package labSix;

import java.util.Scanner;

import labFive.LinkedLIST;

public class Bank_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkList l = new LinkList();
		int id, pos;
		String name;
		int amount;
		int cBal;
		int choice;
		do {
			System.out.println("Enter Choice");
			System.out.println("1:  Create Account");
			System.out.println("2:  Check Balance ");
			System.out.println("3:  Withdraw");
			System.out.println("4:  Deposit");
			System.out.println("5:  Display");

			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
				case 1:

					System.out.println("Enter Id :");
					id = sc.nextInt();
					System.out.println("Enter NAme :");
					name = sc.next();
					System.out.println("Enter Balnnce:");
					cBal = sc.nextInt();
					l.createAccount(id, name, cBal);
					break;

				case 2:
					System.out.println("Enter Id :");
					id = sc.nextInt();

					l.checkBalance(id);
					break;

				case 3:
					System.out.println("Enter  amount");
					amount = sc.nextInt();
					System.out.println("Enter Id :");
					id = sc.nextInt();

					l.withdraw(id, amount);

					break;

				case 4:
					System.out.println("Enter amount");
					amount = sc.nextInt();
					System.out.println("Enter Id :");
					id = sc.nextInt();
					l.deposit(id, amount);
					break;
				case 5:
					System.out.println("Enter Id :");
					id = sc.nextInt();

					l.Display(id);
					break;

			}
		} while (choice != 6);

	}

}
