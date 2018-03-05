package medium;

import java.util.HashSet;
import java.util.Set;

public class leetcode3 {

	public int lengthOfLongestSubstring(String s) {
		char[] ch=s.toCharArray();
		
		int num=0;
		for(int i=0;i<s.length();i++) {
			Set set=new HashSet();
			int m=0;
			for(int j=i;j<ch.length;j++) {
				if(set.add(ch[j])) {
					m++;
				}else {
					if(num<m) {
						num=m;
						break;
					}
				}
				
				
			}
		}
		
		
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leetcode3 a=new leetcode3();
		System.out.println(a.lengthOfLongestSubstring("bbbbb"));
		
	}

}
