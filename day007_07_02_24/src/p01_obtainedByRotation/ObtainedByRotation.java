
/*

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

 

Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.


*/

package p01_obtainedByRotation;

import java.util.Iterator;

public class ObtainedByRotation {

	public static void main(String[] args) {

	}

	public static boolean findRotation(int[][] mat, int[][] target) {

		int dim = mat.length * mat.length;
		int rotCount = 4;
		int matchNum = 0;

		while (rotCount > 0) {
			matchNum = 0;
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (mat[i][j] == target[i][j]) {
						matchNum++;
					}
				}
			}

			if (matchNum == dim) {
				return true;
			}

			mat = rotateMat(mat);
			rotCount--;
		}

		return false;
	}

	public static int[][] rotateMat(int[][] mat) {

		int dim = mat.length;
		int[][] arr = new int[dim][dim];

		for (int i = 0; i < dim; i++)
			for (int j = 0; j < dim; j++) {
				arr[j][dim - 1 - i] = mat[i][j];
			}
		return arr;
	}

}
