package twopointers;

public class twopointers167 {

	public int[] twosum(int[] nums,int target) {
		int[] m=new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					m[0]=nums[i];
					m[1]=nums[j];
					break;
				}
			}
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums= {1,2,3,4,5};
		twopointers167 a=new twopointers167();
		int[] s=a.twosum(nums, 5);
		for(int i:s) {
			System.out.println(i);
		}
		
	}

}
