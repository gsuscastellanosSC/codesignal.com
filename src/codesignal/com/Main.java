package codesignal.com;

public class Main {

	public static void main(String[] args) {
		// 1). add
		// System.out.println(Intro.add(101,1));
		// 2). centuryFromYear
		// System.out.println(Intro.centuryFromYear(101));
		// 3). checkPalindrome
		// System.out.println(Intro.checkPalindrome("aabaa"));
		// 4). adjacentElementsProduct
		// int inputArray[] = {-23, 4, -3, 8, -12};
		// System.out.println(Intro.adjacentElementsProduct(inputArray));
		// 5). shapeArea
		// System.out.println(Intro.shapeArea(7));
		// 6). Make Array Consecutive 2
		// int statues[] = {5, 4, 6};
		// System.out.println(Intro.makeArrayConsecutive2(statues));
		// 7). almostIncreasingSequence
		// int sequence[] = {1, 2, 5, 3, 5};
		// System.out.println(Intro.almostIncreasingSequence(sequence));
		// 8). matrixElementsSum
		int[][] matrix = { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } };
		System.out.println(matrixElementsSum(matrix));
	}

	public static int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == 1 && matrix[i - 1][j] != 0) {
					sum = sum + matrix[i][j];
				} else if (i == 2 && matrix[i - 1][j] != 0 && matrix[i - 2][j] != 0) {
					sum = sum + matrix[i][j];
				} else if (i == 3 && matrix[i - 1][j] != 0 && matrix[i - 2][j] != 0 && matrix[i - 3][j] != 0) {
					sum = sum + matrix[i][j];
				} else if (i == 4 && matrix[i - 1][j] != 0 && matrix[i - 2][j] != 0 && matrix[i - 3][j] != 0 && matrix[i - 4][j] != 0) {
					sum = sum + matrix[i][j];
				} else if (i == 5 && matrix[i - 1][j] != 0 && matrix[i - 2][j] != 0 && matrix[i - 3][j] != 0 && matrix[i - 4][j] != 0 && matrix[i - 5][j] != 0) {
					sum = sum + matrix[i][j];
				} else if (i == 0) {
					sum = sum + matrix[i][j];
				}
			}
		}
		return sum;
	}
}
