package logics;

public class MaxSubArray {

	public static void main(String[] args) {
		
		 System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4})); 
		
	}
	 static int maxSubArray(int[] nums) {
	        if(nums.length == 1)
	            return nums[0];
	        
	        int max_so_far = nums[0], max_till_now = nums[0];
	        int[] nums_result = new int[nums.length+1];
	        
	        for(int i= 1; i < nums.length; i++){
	            max_till_now = Math.max(nums[i], max_till_now + nums[i]);
	            max_so_far = Math.max(max_so_far, max_till_now);
	            if(max_till_now < max_so_far)
	            	nums_result[i] = nums[i];
	        }
	        return max_so_far;
	    }
}
