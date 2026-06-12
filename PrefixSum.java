package myPractice;

import java.util.Arrays;

public class PrefixSum {
	public static void main(String[] args) {
		 int[] arr = {2, 4, 1, 3, 5};
	        int[] prefix = prefixSum(arr);
	        
	        System.out.println("Original: " + Arrays.toString(arr));
	        System.out.println("Prefix Sums: " + Arrays.toString(prefix));
		
	}
	public static int[]prefixSum(int arr[]){
		if(arr == null && arr.length ==0) {
			return new int[0];
		}
		int []prefix = new int[arr.length];
		prefix[0] = arr[0];
		for(int i = 1;i < arr.length;i++) {
			prefix[i]= prefix[i - 1] + arr[i];
		}
		return prefix;
		
	}

}
