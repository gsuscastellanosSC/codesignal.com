package com.codesignal;

public class Main {

	public static void main(String[] args) {
		//1). add
        	//System.out.println(add(101,1));
		//2). centuryFromYear
			//System.out.println(centuryFromYear(101));
		//3). checkPalindrome
			//System.out.println(checkPalindrome("aabaa"));
		//4). adjacentElementsProduct
			//int inputArray[] = {-23, 4, -3, 8, -12};
			//System.out.println(adjacentElementsProduct(inputArray));
	}
	//1). add
	public static int add(int param1, int param2) {
	    return param1+param2;
	}
	//2). centuryFromYear
	public static int centuryFromYear(int year) {
		return year/100+((year%100>0)?1:0);
	}
	//3). checkPalindrome
	public static boolean checkPalindrome(String inputString) {
		boolean isTrue=true;
		int h=0;
		for (int i = inputString.length()-1; i >= 0; i--) {
			isTrue=(inputString.charAt(i)==inputString.charAt(h))?true:false;
			if(!isTrue) {
				i=-1;
			}
			h++;
		}
		return isTrue;
	}
	//4). adjacentElementsProduct
	public static int adjacentElementsProduct(int[] inputArray) {
		int ac=-1001;
		for (int i = 0; i < inputArray.length-1; i++) {
			//System.out.println(inputArray[i]+" x "+inputArray[i+1]+" = "+inputArray[i]*inputArray[i+1]);
			ac=(inputArray[i]*inputArray[i+1]>ac)?inputArray[i]*inputArray[i+1]:ac;
		}
		return ac;
	}

}
