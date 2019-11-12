package main;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		InputParser input = new InputParser();
		Calculator calculator = new Calculator();
		
		// get a list of numbers from user
		List<Integer> nums = input.getNumberList();
		// sort the list
		Calculator.sort(nums, 0, nums.size()-1);
		// find lowest missing positive number
		Integer lowestPositive = calculator.getLowestMissingPositiveNum(nums);
		System.out.println("The lowest missing positive number is: "+lowestPositive);
	}
}
