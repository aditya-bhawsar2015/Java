package day5;

import java.util.Arrays;

public class Stringoperations {

	public static void main(String[] args) {
		//  Check if 2 strings are anagram
		String s1 ="BABA";
		String s2 = "ABAB";
		System.out.println(isAnagrams(s1,s2));		
		
		// Count no of uppercase/lowercase/special char in a string
		String s3 = "How you doin'?";
		System.out.println(CaseCheck(s3));
		
		// Check if string is uppercase
		
		String s4 ="HELLO WORLD";
		System.out.println();
		
		// Shift character of the string to the left
		
		// implements equals and equalsIgnoreCase methods		
	}
	
	static  boolean isAnagrams(String s1, String s2){
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
		}


	static int[] CaseCheck(String s3) {
		int countLower=0, countUpper=0, countSpecial = 0;
		char [] arr3 = s3.toCharArray();
		for(int i = 0; i < arr3.length; i++) {
			int ascii = arr3[i];
			if(ascii>=65 && ascii<=90) {
				countUpper++;
			}else if(ascii>= 97 && ascii<=122) {
				countLower++;
			}
			else {
				countSpecial++;
			}
		}
		int[] arr4 = {countLower, countUpper, countSpecial};
		System.out.println("Lower Case Count = " + countLower + " Upper Case Count = " + countUpper + 
				"Special Character Count = " + countSpecial);
		return arr4;
		
	}
	
}	












