

/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.

 

Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 

Constraints:

1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.


*/



package p05_CheckEquivalenceOfTwoStrings;

public class CheckEquivalenceOfTwoStrings {

	public static void main(String[] args) {
		
		String [] word1 = {"a", "bc"};
		String [] word2 = {"ab", "c"};
		
		System.out.println(arrayStringsAreEqual(word1, word2));
		
	}
	
	static public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(String s1 : word1) {
			sb1.append(s1);
		}		
		
		for(String s2 : word2) {
			sb2.append(s2);
		}
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		
		System.out.println(s2);
		if(s1.equals(s2))
			return true;
		return false;
	}

}
