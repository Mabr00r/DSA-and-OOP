
public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 10, 9, 3, 7 };
		// Ascending Order
		System.out.println("Ascending Order");
		for (int i = 1; i < a.length; i++) {
			int current = a[i];
			int j = i - 1;
			while (j >= 0 && current < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			// placement
			a[j + 1] = current;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// Descending Order
		System.out.println("Descending Order");

		for (int i = 1; i < a.length; i++) {
			int current = a[i];
			int j = i - 1;
			while (j >= 0 && current > a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			// placement
			a[j + 1] = current;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}