package ArraysIsRotation;

public class arraysIsRotation {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] list2a = { 4, 5, 6, 7, 8, 1, 2, 3 };
		int[] list2b = { 4, 5, 6, 7, 1, 2, 3 };
		int[] list2c = { 4, 5, 6, 9, 1, 2, 3 };
		int[] list2d = { 4, 6, 5, 7, 1, 2, 3 };
		int[] list2e = { 4, 5, 6, 7, 0, 2, 3 };
		int[] list2f = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(isRotation(list1, list2f));
	}

	public static Boolean isRotation(int[] list1, int[] list2) {
		if (list1.length != list2.length) {
			return false;
		}

		int key = list1[0];
		int key_loc = -1;

		for (int i = 0; i < list2.length; i++) {
			if (list2[i] == key) {
				key_loc = i;
				break;
			}
		}
		if (key_loc == -1) {
			return false;
		}

		for (int i = 0; i < list1.length; i++) {
			int j = (key_loc + i) % list1.length;
			if (list1[i] != list2[j]) {
				return false;
			}
		}

		return true;
	}
}
