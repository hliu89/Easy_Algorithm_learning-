package twopointers;

import java.util.ArrayList;
import java.util.List;

public class twopointers125 {

	 public boolean isPalindrome(String s) {
		 char[] ch=s.toCharArray();
		 for(int i=0;i<ch.length;i++) {
			 int r=0;
			 int q=0;
			 List<Integer> list=new ArrayList<Integer>();
			 for(int j=0;j<ch.length;j++) {
				 if(ch[i]==ch[j]&&i!=j) {
					 r=Math.abs(j-i);
					 list.add(r);
					 q++;
				 }
			 }
				 for(int k=0;k<q-1;k++) {
					if(list.get(k)!=list.get(0)) {
						break;
					}else if(k==q-2&&list.get(k+1)==list.get(0)) {
						return true;
					}
				 }
			 }
			 
		 
		 return false;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twopointers125 a=new twopointers125();
		boolean s=a.isPalindrome("qwqwqwwq");
		System.out.println(s);

	}

}
