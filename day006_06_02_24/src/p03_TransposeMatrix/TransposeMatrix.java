package p03_TransposeMatrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		mat = transpose(mat);

		for (int[] i : mat) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static int[][] transpose(int[][] matrix) {
		int[][] arr = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				arr[i][j] = matrix[j][i];

		return arr;
	}

}
