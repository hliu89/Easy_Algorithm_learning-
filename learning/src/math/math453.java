package math;

public class math453 {
//∫Õ507–¥∑¥¡À
	public boolean checkperfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math453 a=new math453();
		System.out.println(a.checkperfect(28));
		
		
		
	}

}
