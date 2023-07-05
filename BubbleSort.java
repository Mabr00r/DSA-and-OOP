
public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 7, 8, 3, 11, 2, 1 };

		// Ascending Order
		System.out.println("Ascending Order");

		for (int i = 0; i < a.length - 1; i++) {// n-1
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					// swap
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// Descending ORder
		System.out.println("Descending ORder");
		for (int i = 0; i < a.length - 1; i++) {// n-1
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					// swap
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
