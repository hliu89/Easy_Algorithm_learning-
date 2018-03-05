package String;

public class String20 {

	public boolean isvalid(String s) {
		
		char[] ch=s.toCharArray();
		for(int i=1;i<ch.length-1;i++) {
			if(ch[i]=='('&&ch[i+1]!=')' ){
				return false;
			}else if(ch[i]=='['&&ch[i+1]!=']') {
				return false;
			}else if (ch[i]==')'&&ch[i-1]!='(') {
				return false;
			}else if(ch[i]==']'&&ch[i-1]!='[') {
				return false;
			}else if (ch[i]=='{'&&ch[i+1]!='}') {
				return false;
			}else if(ch[i]=='}'&&ch[i-1]!='{') {
				return false;
			}
			}
		
	

		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="(){}[[]";
		String20 a=new String20();
		System.out.println(a.isvalid(s));
		
	}

}
