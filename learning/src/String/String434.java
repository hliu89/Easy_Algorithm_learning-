package String;

public class String434 {

	public int Stringnum(String str) {
		int r=0;
		int q=0;
		while(true) {
			int m=0;
			if(r==str.length()) {
				return q;
			}
		for(int i=r;i<str.length();i++) {
			r++;
			m++;
			
			
			if(str.charAt(i)==' '||str.charAt(i)==','){
				if(m>q) {
					q=m-1;
				}
				//r++;
				break;
			}else if(r==str.length()) {
				if(m>q) {
					q=m;
				}
				break;
			}
		}
//		if(r==str.length()){
//			break;
//		}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String434 a=new String434();
		System.out.println(a.Stringnum("hi, a boy humbog aaa"));
		
		
	}

}
