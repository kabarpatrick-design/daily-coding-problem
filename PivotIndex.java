package myPractice;

public class PivotIndex {
	
	static class Pivot{
		
		public static void main(String[] args) {
			int[] nums = {1,7,3,6,5,6};
			
			Pivot pivot = new Pivot();
			System.out.println(pivot.pivotIndex(nums));
			
		}
		
		int pivotIndex(int[]nums) {
			int rightSum = 0;
			for(int num: nums) {
				rightSum+=num;
			}
			int leftSum = 0;
			for(int i = 0; i < nums.length;i++) {
				if(leftSum == rightSum - leftSum - nums[i])
					return i;
				leftSum+=nums[i];
			}
			return -1;
		}
	}

}
