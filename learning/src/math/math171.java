package math;

public class math171 {

	public int titletonumber(String x) {
		String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int b=1;
		char[] ch=a.toCharArray();
		char[] xch=x.toCharArray();
		//System.out.println(xch.length);
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<xch.length;j++) {
				if(xch[j]==ch[i]&&j==0) {
					b=b+i;
				}
				if(xch[j]==ch[i]&&j!=0){
					b=b+(i+1)*26;
				}
			}
				
			
		}
		
		return b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math171 a=new math171();
		int m=a.titletonumber("");
		System.out.println(m);
		
	}

}
