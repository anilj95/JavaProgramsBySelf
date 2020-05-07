package BeginnerLevelMust;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,1,1,0};
		
		System.out.print(minSwapRequired(arr));
		
		
	}
	public static char swap(char ch) {
		return (ch == '0') ? '1' : '0';

	}

	public static int getSwapWithTypeChar(int[] arr, char type) {

		int swapCount = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != type) {

				swapCount++;

				}

			type = swap(type);

		}
		
		return swapCount;

	}

	public static int minSwapRequired(int[] arr) {

		return Math.min(getSwapWithTypeChar(arr, '1'), getSwapWithTypeChar(arr, '0'));

	}

}
