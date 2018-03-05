package math;

public class math29 {

	public int divide(int m,int n) {
		int large=0;
		int small=0;
		int count=0;
		int sum=0;
		if(m>n) {
			large=m;
			small=n;
		}else {
			large=n;
			small=m;
		}
		while(true) {
			sum=sum+small;
			if(large<=sum) {
				break;
			}
			count++;
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math29 m=new math29();
		int q=m.divide(20, 6);
		System.out.print(q);
	}

}
