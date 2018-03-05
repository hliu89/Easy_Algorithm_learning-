package twopointers;

public class twopointers345 {

	public String reverse2(String x) {
		String a="aeiouAEIOU";
		char[] c=a.toCharArray();
		
		char[] ch=x.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			for(int j=0;j<c.length;j++) {
				if(ch[i]==c[j]) {
					for(int k=0;k<c.length;k++) {
						if(ch[ch.length-1-i]==c[k]) {
							char s='a';
							s=ch[i];
							ch[i]=ch[ch.length-1-i];
							ch[ch.length-1-i]=s;
						}
					}
				}
			}
		}
		String q=new String(ch);
		return q;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		twopointers345 a=new twopointers345();
		String s=a.reverse2("leetcode");
		System.out.print(s);
	}

}
