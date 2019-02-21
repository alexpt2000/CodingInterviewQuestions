package StringsNonRepeating;

import java.util.HashMap;

public class stringsNonRepeating {

	public static void main(String[] args) {
		String test1 = "abcab"; // should return 'c'
		String test2 = "abab"; // should return null
		String test3 = "aabbbc"; // should return 'c'
		String test = "aabbdbc"; // should return 'd'
		     
        System.out.println(nonRepeating(test));
	}
	
    public static Character nonRepeating(String s) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                Integer newVal = charCount.get(c) + 1;
                charCount.put(c, newVal);
            } else {
                charCount.put(c, 1);
            }
        }
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) return c;
        }
        return null;
    }

}
