
import java.util.*;

public class DelOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = { 3, 4, 3, 5, 3 };
		System.out.println("Enter value to delete => ");
		int val = sc.nextInt();
		updateArray(array, val);
	}

	public static void updateArray(int[] array, int val) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == val) {
				count++;
			}
		}

		int[] newArray = new int[array.length - count];
		int idx = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != val) {
				newArray[idx] = array[i];
				idx = idx + 1;
			}
		}
		System.out.println("Enter value");
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i] + " ");
		}

	}
}
