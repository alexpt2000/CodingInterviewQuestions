package ArrayMissingNumber;

public class missingNumber {

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 4, 5, 6, 7 }; // return 0
		int[] list2 = { 0, 1, 2, 3, 4, 5, 6, 7 }; // return Null
		int[] list3 = { 0, 1, 2, 3, 5, 6, 7 }; // return 4
		int[] list4 = { 0, 2, 3, 4, 5, 7 }; // return 1

		System.out.println(missingList(list1));
		System.out.println(missingList(list2));
		System.out.println(missingList(list3));
		System.out.println(missingList(list4));
	}

	public static Integer missingList(int[] listMissing) {
		int count = 0;
		int key = 0;

		for (int i = 0; i < listMissing.length; i++) {
			if (count != listMissing[i])
				return listMissing[i] - 1;

			if (key != listMissing[0])
				return key;

			count += 1;
		}
		return null;
	}
}
