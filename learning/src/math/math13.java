package math;

public class math13 {

	
	public int transfer(String s) {
		int sum=0;
		int[] nums=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			switch (s.charAt(i)) {
			case 'M':
                nums[i]=1000;
                break;
            case 'D':
                nums[i]=500;
                break;
            case 'C':
                nums[i]=100;
                break;
            case 'L':
                nums[i]=50;
                break;
            case 'X' :
                nums[i]=10;
                break;
            case 'V':
                nums[i]=5;
                break;
            case 'I':
                nums[i]=1;
                break;

			}
		}
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
