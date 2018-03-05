package String;

import java.util.ArrayList;
import java.util.List;

public class String557 {

	public String reverseworlds(String s) {
		
		char[] ch= s.toCharArray();
		int i=0;
		
		//List<Integer> list=new ArrayList<Integer>();
		while(i<ch.length) {
			int q=1;
			while(ch[i+q-1]!=' ') {
				q++;
				
			}
			char m='0';
			for(int j=i;j<=i+(q-1)/2;j++) {
				m=ch[j];
				ch[j]=ch[i+q-1-(j-i)];
				ch[i+q-1-(j-i)]=m;
			}
			i=i+q;
		}
		String n=new String(ch);
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String557 a=new String557();
		System.out.println(a.reverseworlds("let,s go to play "));
		
	}

}
