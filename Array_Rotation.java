
import java.util.*;

public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] rotateArray = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array");
		for (int i = 0; i < rotateArray.length; i++) {
			System.out.println(rotateArray[i]);
		}
		System.out.println("Enter No of Rotation");
		int val = sc.nextInt();
		int index = 0;
		for (int i = 0; i < val; i++) {
			int temp = rotateArray[0];
			for (int j = 0; j < rotateArray.length - 1; j++) {
				rotateArray[j] = rotateArray[j + 1];
			}
			rotateArray[rotateArray.length - 1] = temp;
		}
		System.out.println("Array After Location");
		for (int i = 0; i < rotateArray.length; i++) {
			System.out.println(rotateArray[i]);
		}

	}

}
