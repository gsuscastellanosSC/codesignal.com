package com.codesignal;

public class Main {

	public static void main(String[] args) {
		//1).
		// System.out.println(centuryFromYear(101));
		//2).
		// System.out.println(checkPalindrome("aabaa"));

	}
	//1).
	public static int centuryFromYear(int year) {
		return year/100+((year%100>0)?1:0);
	}
	//2).
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
}
