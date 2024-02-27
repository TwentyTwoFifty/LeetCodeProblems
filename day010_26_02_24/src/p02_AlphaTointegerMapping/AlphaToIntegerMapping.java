
/*

You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
 

Constraints:

1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.

*/

package p02_AlphaTointegerMapping;

import java.util.HashMap;
import java.util.Map;

public class AlphaToIntegerMapping {

	public static void main(String[] args) {

		String s = "1326#";
		System.out.println(freqAlphabets(s));
	}

	static public String freqAlphabets(String s) {

//		int number = 0;		
//		StringBuilder sb = new StringBuilder();
//		
//		for (int i = s.length()-1; i>=0; i--) {
//			System.out.println(" i = "+i);
//			
//			if(s.charAt(i)=='#') {
//				System.out.println("here");
//				number = Character.getNumericValue(s.charAt(i-1)) ;
//				
//				number = number + 10*Character.getNumericValue(s.charAt(i-2));
//				
//				i = i - 2;				
//				
//			}else {
//				number = Character.getNumericValue(s.charAt(i));
//			}
//			
//			sb.insert(0, (char)(number + 96));		
//		}
//				
//		return sb.toString();

		StringBuilder sb1 = new StringBuilder("");
		int num = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '#') {
				num = Character.getNumericValue(s.charAt(i-1)) +10*Character.getNumericValue(s.charAt(i-2));
				i = i-2;
			} else {
				num = Character.getNumericValue(s.charAt(i));
			}
			
			sb1.insert(0, (char)(num+96));
		}
		return sb1.toString();
	}
}
