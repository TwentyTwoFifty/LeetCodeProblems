

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 

Constraints:

1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.

*/





package p03_ReverseWordsOfStrings3;

public class ReverseWordsOfString3 {

	public static void main(String[] args) {
		
		String s = "Let's take LeetCode contest";
		
		System.out.println(reverseWords(s));

	}
	
	static public String reverseWords(String s) {
        
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = null;		
		String [] strArr = s.split("\\s");
		
		for(String st : strArr) {
			sb1 = new StringBuilder();
			sb1.append(st);
			sb1= sb1.reverse();
			
			sb.append(sb1+" ");
		}		
		
		return sb.toString().trim();
		
		
		
		
    }

}
