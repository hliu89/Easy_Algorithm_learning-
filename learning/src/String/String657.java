package String;

public class String657 {

	public boolean robotback(String s) {
		int l=0;
		int r=0;
		int up=0;
		int d=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='L') {
				l++;
			}
			if(s.charAt(i)=='R') {
				r++;
			}
			if(s.charAt(i)=='U') {
				up++;
			}
			if(s.charAt(i)=='D'){
				d++;
			}
		}
		if(l==r&&up==d) {
			return true;
		}else {
		
		return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String657 a=new String657();
		System.out.println(a.robotback("LLDDURR"));
		
	}

}
