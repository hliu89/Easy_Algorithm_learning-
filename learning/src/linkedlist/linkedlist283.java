package linkedlist;

public class linkedlist283 {

	public void movezeros(int[] m) {
	
		for(int i=0;i<m.length-1;i++) {
			int q=0;
			if(m[i]==0&&m[i+1]!=0) {
				for(int j=i;j<m.length-1;j++) {
					m[j]=m[j+1];
				}
				
				m[m.length-1]=0;
			}if(m[i]==0&&m[i+1]==0){
				for(int j=i;j<m.length-2;j++) {
					m[j]=m[j+2];
				}
				m[m.length-1]=0;
				m[m.length-2]=0;
			}

		}
	}
	public void movezeros2(int[] m) {
		int i=1;
		int j=0;
		while (i<m.length) {
			if(m[i]==0) {
				for(int k=i;k<m.length-1;k++) {
					m[k]=m[k+1];
				}
				m[m.length-1]=0;
			}
			i++;
			if(m[j]==0) {
				for(int q=j;q<m.length-1;q++) {
					m[q]=m[q+1];
				}
				m[m.length-1]=0;
			}
			j++;
		}
	}
	public void moveZeroes3(int[] nums) {

	    int j = 0;
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] != 0) {
	            int temp = nums[j];
	            nums[j] = nums[i];
	            nums[i] = temp;
	            j++;
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {1,2,0,0,0,0,0,0,0,4,0,5,6};
		linkedlist283 a=new linkedlist283();
		a.moveZeroes3(m);;
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);
		}
		
	}

}
