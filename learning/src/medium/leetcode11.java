package medium;

public class leetcode11 {

	public int maxarea(int[] height) {
		int area=0;
		for(int i=0;i<height.length;i++) {
			for(int j=i;j<height.length;j++) {
				int h=0;
				if(height[i]>height[j]) {
					h=height[j];
				}else {
					h=height[i];
				}
				if((j-i)*h>area) {
					area=(j-i)*h;
				}
			}
		}
		
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x= {10,2,7};
		leetcode11 a=new leetcode11();
		int area=a.maxarea (x);
		System.out.println(area);
		
	}

}
