
/*

You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.

 

Example 1:

Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:

Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation: 
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 

Constraints:

1 <= logs.length <= 100
1950 <= birthi < deathi <= 2050

*/

package p05_maxPopulationYear;

import java.util.Map;
import java.util.TreeMap;

public class MaxPopulationYear {

	public static void main(String[] args) {
		
		int [][] mat = {{1990,1999},{2000,2010}};
		System.out.println("-->"+maximumPopulation(mat));
	}

	public static int maximumPopulation(int[][] logs) {
		
		/*
		int earliestYearWithMaxPopulation = 0, prevMaxPop = 0, finalMaxPop = 0;		
		int birthYear = 0, deathYear = 0;        
		Map<Integer,Integer> myMap = new TreeMap<>();
        for(int i = 0; i<logs.length; i++){
           birthYear = logs[i][0];
           deathYear = logs[i][1];           
           for (int j = birthYear; j < deathYear;  j++) {
        	   myMap.put(j, myMap.getOrDefault(j, 0)+1);
           }           
        }        
        for(Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
     	   finalMaxPop = Math.max(entry.getValue(), prevMaxPop);     	   
     	   if(finalMaxPop>prevMaxPop) {
     		   earliestYearWithMaxPopulation = entry.getKey();     		   
     		   prevMaxPop = finalMaxPop;
     	   }
        }        
		return earliestYearWithMaxPopulation;
		
		*/
	}

}
