package codesignal.com;

import java.util.Arrays;

public class Intro {

	public static int add(int param1, int param2) {
		return param1 + param2;
	}

	public static int centuryFromYear(int year) {
		return year / 100 + ((year % 100 > 0) ? 1 : 0);
	}

	public static boolean checkPalindrome(String inputString) {
		boolean isTrue = true;
		int h = 0;
		for (int i = inputString.length() - 1; i >= 0; i--) {
			isTrue = (inputString.charAt(i) == inputString.charAt(h)) ? true : false;
			if (!isTrue) {
				i = -1;
			}
			h++;
		}
		return isTrue;
	}

	public static int adjacentElementsProduct(int[] inputArray) {
		int ac = -1001;
		for (int i = 0; i < inputArray.length - 1; i++) {
			// System.out.println(inputArray[i]+" x "+inputArray[i+1]+" =
			// "+inputArray[i]*inputArray[i+1]);
			ac = (inputArray[i] * inputArray[i + 1] > ac) ? inputArray[i] * inputArray[i + 1] : ac;
		}
		return ac;
	}

	public static int shapeArea(int n) {
		int ac = 1;
		for (int i = 0; i < n; i++) {
			ac = ac + 4 * i;
		}
		return ac;
	}

	public static int makeArrayConsecutive2(int[] statues) {
		Arrays.sort(statues);
		int ac = 0;
		for (int i = 0; i < statues.length - 1; i++) {
			ac = (statues[i + 1] - statues[i] > 1) ? ac + statues[i + 1] - statues[i] - 1 : ac;
		}
		return ac;
	}

	public static boolean almostIncreasingSequence(int[] sequence) {
		int ac = 0;
		for (int i = 0; i < sequence.length - 2 && ac <= 2; i++) {
			if (sequence[i] >= sequence[i + 1]) {
				ac++;
				sequence[i] = sequence[i + 1] - 1;
			}
			if (sequence[i + 1] >= sequence[i + 2]) {
				ac++;
				if (sequence[i] == sequence[i + 2]) {
					sequence[i + 2] = sequence[i + 1] + 1;
				} else {
					sequence[i + 1] = sequence[i];
				}
			}
		}
		return ac <= 1;
	}

	public static int matrixElementsSum(int[][] matrix) {
		System.out.println("test");
		return 1;
	}
}