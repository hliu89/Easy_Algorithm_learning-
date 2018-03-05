package String;

public class String58 {

	public int findlastworld(String s) {
		
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==' ') {
				return ch.length-1-(i);
			}
		}
		return s.length();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hellosss aaa bbbbc";
		String58 a=new String58();
		System.out.println(a.findlastworld(s));
		
	}

}
