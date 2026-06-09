package myPractice;

import java.util.HashSet;
import java.util.Set;

public class TwoSum2 {
	public static void main(String[] args) {
		int[]nums = {3, 7, 10, 15};
		System.out.println(twoSum(nums, 17));
	}
	public static boolean twoSum(int[]nums,int target) {
		Set<Integer>set = new HashSet<>();
		for(int num:nums) {
			int compliment = target - num;
			if(set.contains(compliment)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}

}
