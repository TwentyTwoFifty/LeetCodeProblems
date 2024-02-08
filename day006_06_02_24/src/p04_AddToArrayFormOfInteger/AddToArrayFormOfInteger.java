
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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

	public static void main(String[] args) {
		int[] arr = { 9,9};
		int k = 34;

		for (int i : addToArrayForm(arr, k))
			System.out.print(i+", ");
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {

		List<Integer> myList = new ArrayList<Integer>();

		/*
		 * List<Integer> kList = new ArrayList<Integer>();
		 * 
		 * List<Integer> numList = new ArrayList<Integer>();
		 * 
		 * for(int i : num) { numList.add(i); }
		 * 
		 * while (k != 0) { kList.add(0, k % 10); k=k/10; }
		 * 
		 * for(int i : numList) { System.out.print(i); } System.out.println(); for(int i
		 * : kList) { System.out.print(i); }System.out.println();
		 * 
		 * while(kList.size()!=numList.size()) {
		 * 
		 * if(kList.size()<numList.size()) { kList.add(0,0); }else { numList.add(0,0); }
		 * }
		 * 
		 * for(int i : kList) { System.out.print(i); }System.out.println();
		 * 
		 * int placeSum = 0; int carry = 0;
		 * 
		 * 
		 * for(int i = kList.size()-1; i>=0; i--) { placeSum = numList.get(i) +
		 * kList.get(i);
		 * 
		 * myList.add(0,(placeSum + carry)%10);
		 * 
		 * carry = (placeSum+ carry)/10; }
		 * 
		 * if(carry>0) { myList.add(0, carry); }
		 */
		
		
		int carry = k;
		int sum = 0;		
		int i = num.length-1;
		
		while(i>=0|| carry>0) {
			
			sum = carry + (i>=0?num[i]:0);
			
			myList.add(0, sum%10);
			
			carry = sum/10;
			
			i--;
			
		}
		
		
		return myList;
	}

}
