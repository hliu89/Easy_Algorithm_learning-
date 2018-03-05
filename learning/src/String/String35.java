package String;

public class String35 {

	public int searchInsert(int[] nums, int target) {
		
		for(int i=0;i<nums.length-1;i++) {
			if(target==nums[i]) {
				return i;
			}else if(target>nums[i]&&target<nums[i+1]) {
				return i+1;
			}
			
		
		}
		return nums[nums.length-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,5,6,7};
		String35 a=new String35();
		System.out.println(a.searchInsert(nums, 4));
		
	}

}
