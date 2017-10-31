package Solution;

import java.util.Arrays;

public class A001 {
	 public int[] twoSum(int[] nums, int target) {
		int[] nums_sort = new int[nums.length];
		for(int i=0;i<nums.length;i++){
			nums_sort[i]=nums[i];
		}
		Arrays.sort(nums_sort);
		//System.out.println(Arrays.toString(nums_sort));
		int start=0;
		int end=nums_sort.length;
		while(start<end){
			while(nums_sort[start]+nums_sort[--end]>target);
			if(nums_sort[start]+nums_sort[end]==target)
				break;
			while(nums_sort[++start]+nums_sort[end]<target);
			if(nums_sort[start]+nums_sort[end]==target)
				break;
		}
		//System.out.println(start+","+end);
		int[] res = new int[2];
		int index = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==nums_sort[start]||nums[i]==nums_sort[end]){
				res[index++]=i;
			}
		}
		return res;
		 
	 }
}
