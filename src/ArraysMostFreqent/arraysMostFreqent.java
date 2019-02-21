package ArraysMostFreqent;

import java.util.HashMap;

public class arraysMostFreqent {

	public static void main(String[] args) {

		int[] array1 = { 0, -1, 10, 10, -1, 10, -1, -1, -1, 1 };
		System.out.println(mostFreqent(array1));

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

}
