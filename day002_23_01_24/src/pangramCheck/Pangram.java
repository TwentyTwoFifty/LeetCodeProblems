package pangramCheck;

import java.util.HashMap;
import java.util.Map;

public class Pangram {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		if (checkIfPangram(sentence)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean checkIfPangram(String sentence) {

		Map<Character, Integer> myMap = new HashMap<>();

		for (char c : sentence.toCharArray()) {
			myMap.put(c, myMap.getOrDefault(c, 0));
			
			System.out.println((int)c);
			
			if ((int) c < 97 || (int) c > 122) {
				return false;
			}
		}

		if (myMap.size() != 26) {
			return false;
		}

		return true;
	}

}
