package twopointers;

public class twopointers344 {

	public String reverseString(String x) {
		char a='a';
		char[] ch=x.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			a=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=a;
			if(i+1==ch.length-1-i) {
				//break;
			}
		}
		String s=String.valueOf(ch);

		for(char c:ch) {
			//System.out.print(c);
			System.out.println(ch.length/2);
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="books";
		twopointers344 a=new twopointers344();
		System.out.println(a.reverseString(x));
		
		
	}

}
