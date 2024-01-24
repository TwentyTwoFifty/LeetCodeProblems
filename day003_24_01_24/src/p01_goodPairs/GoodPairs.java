/*
1512. Number of Good Pairs
Easy
Topics
Companies
Hint
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

package p01_goodPairs;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

	public static void main(String[] args) {
		int [] arr = {1,1,1,1};
		System.out.println("Answer --> "+numIdenticalPairs(arr));
	}

	public static int numIdenticalPairs(int[] nums) {
		int countOfElement = 0;

		Map<Integer,Integer> myMap = new HashMap<>();
		
		for(int i : nums) {
			myMap.put(i, myMap.getOrDefault(i, 0)+1);
		}
		
		for(int val : myMap.values()) {
			if(val>1) {
				countOfElement = countOfElement + combination(val);
			}
		}
		
		return countOfElement;
	}
	
	public static int combination(int n) {
		double c = 0;
		c = n*(n-1)*0.5;
		return (int)c; 
	}
	

}
