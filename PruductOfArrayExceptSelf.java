package myPractice;

import java.util.Arrays;

public class PruductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[]arr1 = {1, 2, 3, 4, 5};
		int[]arr2 = {3, 2, 1};
		System.out.println(Arrays.toString(productExceptSelf(arr2)));
	
	}
	
	public static int[]productExceptSelf(int[]nums){
		
		int []results = new int[nums.length];
		int prefix = 1;
		for(int i = 0; i < nums.length; i++) {
			results[i] = prefix;
			prefix*=nums[i];
		}
		int sufix = 1;
		for(int i = nums.length - 1; i >=0;i--) {
			results[i]*=sufix;
			sufix*=nums[i];
		}
		return results;
	}

}
