/*


Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
*/

package p02_flippingImage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingAnImage {

	public static void main(String[] args) {
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		
		for (int[] row : image) {
			for (int i : row) {
				System.out.print(i + "");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		image = flipAndInvertImage(image);
		
		for (int[] row : image) {
			for (int i : row) {
				System.out.print(i + "");
			}
			System.out.println();
		}

	}

	public static int[][] flipAndInvertImage(int[][] image) {

		int t = 0;
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < (image[i].length + 1) / 2; j++) {
				t = 1 - image[i][j];
				image[i][j] = 1 - image[i][(image[i].length) - j - 1];
				image[i][(image[i].length) - j - 1] = t;
			}
		}

		return image;
	}
}
