
import java.util.*;

public class Methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int[] array = { 1, 2, 3, 4, 5 };
		do {
			System.out.println("ENter Choice");
			System.out.println("1 TO Display");
			System.out.println("2 TO Insert At End");
			System.out.println("3 TO Insert At Start");
			System.out.println("4 To Insert At Any Index");
			System.out.println("5 To Delete Any Number");
			System.out.println("6 To Delete At End");
			System.out.println("7 To Delete At Start");
			System.out.println("8 To Update any value ");
			System.out.println("9 To Search any value ");
			choice = sc.nextInt();
			switch (choice) {

				case 1:
					Display(array);
					break;

				case 2:
					insertAtEnd(array);
					break;

				case 3:
					insertAtStart(array);
					break;

				case 4:
					insertAtAny(array);
					break;

				case 5:
					Delete(array);
					break;

				case 6:
					DeleteAtEnd(array);
					break;

				case 7:
					DeleteAtStart(array);
					break;

				case 8:
					Update(array);
					break;

				case 9:
					Search(array);
					break;
			}
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 ||
				choice == 7 || choice == 8 || choice == 9);
	}

	public static void insertAtEnd(int[] array) {
		Scanner sc = new Scanner(System.in);
		int val;
		System.out.println("ENter VAlue ");
		val = sc.nextInt();

		int[] nray = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			nray[i] = array[i];
		}

		nray[nray.length - 1] = val;

		for (int i = 0; i < nray.length; i++) {
			System.out.println(nray[i]);

		}

	}

	public static void insertAtStart(int[] array) {
		Scanner sc = new Scanner(System.in);
		int val;
		System.out.println("ENter VAlue ");
		val = sc.nextInt();

		int[] nray = new int[array.length + 1];
		nray[0] = val;

		for (int i = 0; i < array.length; i++) {
			nray[i + 1] = array[i];
		}

		for (int i = 0; i < nray.length; i++) {
			System.out.println(nray[i]);

		}

	}

	public static void insertAtAny(int[] array) {
		Scanner sc = new Scanner(System.in);
		int val, loc;
		System.out.println("ENter value");
		val = sc.nextInt();
		System.out.println("ENter Location");
		loc = sc.nextInt();
		int[] insrtArray = new int[array.length + 1];
		for (int i = 0; i < array.length + 1; i++) {
			if (i < (loc - 1)) {
				insrtArray[i] = array[i];
			} else if (i == (loc - 1)) {
				insrtArray[i] = val;
			} else {
				insrtArray[i] = array[i - 1];
			}
		}

		for (int i = 0; i < insrtArray.length; i++) {
			System.out.println(insrtArray[i]);
		}

	}

	public static void Delete(int[] array) {
		Scanner sc = new Scanner(System.in);

		int val;
		System.out.println("ENter value");
		val = sc.nextInt();

		int[] delArray = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			if (i < (val - 1)) {
				delArray[i] = array[i];
			} else if (i == (val - 1)) {
				delArray[i] = array[i + 1];
			} else {
				delArray[i] = array[i + 1];
			}
		}

		for (int i = 0; i < delArray.length; i++) {
			System.out.println(delArray[i]);
		}

	}

	public static void Update(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Location");
		int location = sc.nextInt();
		System.out.println("ENter New Value");
		int value = sc.nextInt();
		array[location] = value;
	}

	public static void Search(int[] array) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		System.out.println("ENter value to search");
		int srchval = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (srchval == array[i]) {
				index = i;
			}

		}
		if (index != 0) {
			System.out.println("Search value found at index " + index);
		} else {
			System.out.println("search value not found");
		}
	}

	public static void DeleteAtEnd(int[] array) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println(array[i]);
		}

	}

	public static void DeleteAtStart(int[] array) {
		for (int i = 1; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static void Display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
