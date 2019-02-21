import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class arrays {

	public static void main(String[] args) {

		int[] array1 = { 0, -1, 10, 10, -1, 10, -1, -1, -1, 1 };
		System.out.println(mostFreqent(array1));

		// **********************************************************
		int[] array1A = { 1, 3, 4, 6, 7, 9 };
		int[] array2A = { 1, 2, 4, 5, 9, 10 };

		int[] array1B = { 1, 2, 9, 10, 11, 12 };
		int[] array2B = { 0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15 };

		int[] array1C = { 0, 1, 2, 3, 4, 5 };
		int[] array2C = { 6, 7, 8, 9, 10, 11 };

		System.out.println(Arrays.toString(commonElements(array1A, array2A)));

		// **********************************************************
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] list2a = { 4, 5, 6, 7, 8, 1, 2, 3 };
		int[] list2b = { 4, 5, 6, 7, 1, 2, 3 };
		int[] list2c = { 4, 5, 6, 9, 1, 2, 3 };
		int[] list2d = { 4, 6, 5, 7, 1, 2, 3 };
		int[] list2e = { 4, 5, 6, 7, 0, 2, 3 };
		int[] list2f = { 1, 2, 3, 4, 5, 6, 7 };
		
		System.out.println(isRotation(list1, list2d));

		// **********************************************************
	}

	public static Integer mostFreqent(int[] givenArray) {
		Integer maxCount = -1;
		Integer maxItem = null;
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int i : givenArray) {
			if (count.containsKey(i)) {
				Integer newVal = count.get(i) + 1;
				count.put(i, newVal);
			} else {
				count.put(i, 1);
			}
			if (count.get(i) > maxCount) {
				maxCount = count.get(i);
				maxItem = i;
			}
		}
		return maxItem;
	}

	public static Integer[] commonElements(int[] array1, int[] array2) {
		int p1 = 0;
		int p2 = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while (p1 < array1.length && p2 < array2.length) {
			if (array1[p1] == array2[p2]) {
				result.add(array1[p1]);
				p1 += 1;
				p2 += 1;
			} else if (array1[p1] > array2[p2]) {
				p2 += 1;
			} else {
				p1 += 1;
			}
		}
		// Convert the result to a regular array.
		Integer[] resultInArray = new Integer[result.size()];
		return result.toArray(resultInArray);
	}

	public static Boolean isRotation(int[] list1, int[] list2) {
		if (list1.length != list2.length) {
			return false;
		}

		int key = list1[0];
		int key_loc = -1;

		for (int i = 0; i < list2.length-1; i++) {
			if (list2[i] == key) {
				key_loc = i;
				break;
			}
		}
		if (key_loc == -1) {
			return false;
		}

		for (int i = 0; i < list1.length-1; i++) {
			int j = (key_loc + i) % list1.length;
			if (list1[i] != list2[j]) {
				return false;
			}
		}

		return true;
	}
}
