package math;

public class math69 {

	public int sqrt(int x) {
		int res=0;
		
		for(int i=0;i<x;i++) {
			if(i*i>x) {
				res= i-1;
				break;
				
			}else if(i*i==x){
				res= i;
				break;
				
			}
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math69 a=new math69();
		int m=a.sqrt(20);
		System.out.println(m);
	}

}
