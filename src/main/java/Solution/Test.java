package Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		A001 a001 = new A001();
		int[] nums = {9,7,5,3,11};
		int[] res = a001.twoSum(nums, 18);
		for(int i : res){
			System.out.println(i);
		}
	}
	
}
