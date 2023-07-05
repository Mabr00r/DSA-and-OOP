
public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 2, 4, 6 };

		for (int i = 0; i < a.length - 1; i++) {
			int small = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[small] > a[j]) {
					small = a[j];
				}
			}
			int temp = a[small];
			a[small] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
