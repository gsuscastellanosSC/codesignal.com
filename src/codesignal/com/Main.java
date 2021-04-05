package codesignal.com;

import java.util.ArrayList;

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
		// int[][] matrix = { { 1, 1, 1, 0 }, { 0, 5, 0, 1 }, { 2, 1, 3, 10 } };
		// System.out.println(Intro.matrixElementsSum(matrix));
		// 9). allLongestStrings
		String[] inputArray = { "aba", "aa", "ad", "vcd", "aba" };
		for (int i = 0; i < Intro.allLongestStrings(inputArray).length; i++) {
			System.out.println(Intro.allLongestStrings(inputArray)[i]);
		}
	}
}
