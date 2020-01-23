package logics;

public class InsertPositionInSortedArray {

	public static void main(String[] args) {
	 int index=searchInsert(new int[] {1,3,5,6,10,15,20}, 3);
	 System.out.println("insert Index is "+index);
	}
	  public static int searchInsert(int[] nums, int target) {
	        if(nums.length == 0)
	            return 0;
	        int low = 0, high = nums.length-1,mid = 0;
	        
	        while(low <= high){
	             mid = low + (high-low) / 2;
	             System.out.println("mid "+mid+" low "+low+" high "+high);
	            if(nums[mid] == target)
	                return mid;
	            if(target > nums[mid]){
	                low = mid +1;
	            }else{
	                high = mid - 1;
	            }
	        }
	        
	        
	        return mid+1;
	    }
}
