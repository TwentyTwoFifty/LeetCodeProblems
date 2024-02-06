
/*

The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

 

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
 

Constraints:

1 <= num.length <= 10000
0 <= num[i] <= 9
num does not contain any leading zeros except for the zero itself.
1 <= k <= 10000

*/

package p04_AddToArrayFormOfInteger;

import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {

	public static void main(String[] args) {
		int[] arr = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		int k = 1;

		for (int i : addToArrayForm(arr, k))
			System.out.println(i);
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {

		List<Integer> myList = new ArrayList<Integer>();

		List<Integer> kList = new ArrayList<Integer>();

		while (k != 0) {
			kList.add(0, k % 10);
		}

		int lengthOfK = kList.size();

		int minSize = Math.min(lengthOfK, num.length);
		
		
		int largerList = 0;

		if (minSize == lengthOfK) {
			largerList = num.length;
		} else {
			largerList = lengthOfK;
		}

		for (int i = 0; i < minSize; i++) {
			int carry = 0;

			int placeSum = kList.get(lengthOfK - 1 - i) + num[num.length - 1 - i];

			if (placeSum > 9) {
				carry = 1;
				placeSum = placeSum % 10;
			}
			myList.add(0, +placeSum + carry);
		}

		return myList;
	}

}
