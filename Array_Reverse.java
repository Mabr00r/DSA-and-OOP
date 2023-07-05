
public class ArrayReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("________________");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
