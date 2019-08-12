package giveChange;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] bills = {5,5,5,10,20};
		
		System.out.println("Input: " + Arrays.toString(bills));
		
		CheckCorrectChangeFunction solution = new CheckCorrectChangeFunction();
		
		System.out.println("Solution: " + solution.lemonadeChange(bills));
	}
}
