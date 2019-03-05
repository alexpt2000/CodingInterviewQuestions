package StringsNonRepeating;

import java.util.HashMap;

public class stringsNonRepeating {

	public static void main(String[] args) {
		String test1 = "abcab"; // should return 'c'
		String test2 = "abab"; // should return null
		String test3 = "aabbbc"; // should return 'c'
		String test4 = "aabbdbc"; // should return 'd'
		     
        System.out.println(nonRepeating(test1));
        System.out.println(nonRepeating(test2));
        System.out.println(nonRepeating(test3));
        System.out.println(nonRepeating(test4));
	}
	
    public static Character nonRepeating(String s) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char i : s.toCharArray()) {
            if (charCount.containsKey(i)) {
                Integer newVal = charCount.get(i) + 1;
                charCount.put(i, newVal);
            } else {
                charCount.put(i, 1);
            }
        }
        for (char i : s.toCharArray()) {
            if (charCount.get(i) == 1) return i;
        }
        return null;
    }

}
