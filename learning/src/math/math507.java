package math;

import java.util.Arrays;

public class math507 {
//∫Õ 453–¥∑¥¡À°£
	public int shortdistance(int[] nums) {
		int m=0;
			Arrays.sort(nums);
			while(true) {
			Arrays.sort(nums);
				if(nums[0]!=nums[1]||nums[1]!=nums[2]) {
					nums[0]=nums[0]+1;
					nums[1]=nums[1]+1;
					m++;
				}else {
					break;
				}
		
			}
		return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,2,3};
		math507 a=new math507();
		int q=a.shortdistance(m);
		System.out.print(q);
	}

}
