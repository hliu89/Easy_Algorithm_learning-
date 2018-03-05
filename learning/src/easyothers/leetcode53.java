package easyothers;

public class leetcode53 {

	public int longestsum(int[] m) {
		int res=0;
		for(int i=0;i<m.length;i++) {
			
			for(int j=i;j<m.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=m[k];
				}
				if(sum>res) {
					res=sum;
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {-2,1,-3,4,-1,2,1,-5,4};
		leetcode53 a=new leetcode53();
		int res=a.longestsum(m);
		System.out.println(res);
		
	}

}
