
/*

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 

Constraints:

1 <= columnNumber <= 2^(31) - 1


*/


package p04_ExcelSheetColumnTitle;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(2));
	}

	static public String convertToTitle(int columnNumber) {
		int q= columnNumber, count = 0, r =0;
		
		while(r==0) {
			r=q%26;
			q = q/26;
			count++;
		}

		
		
		
		System.out.println("Quotient = "+q+", count = "+ count + ", remainder = "+ r);
		
		
		return "";
	}

}
