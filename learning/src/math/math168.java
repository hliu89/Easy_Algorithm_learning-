package math;

import java.util.HashSet;
import java.util.Set;

public class math168 {

//	public String converttoString(int x) {
//		StringBuilder res=new StringBuilder();
//		String m="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		
//		if(x<0) {
//			String n="worry number!";
//			return n;
//		}else if(x<=26) {
//			for(int i=0;i<=x;i++) {
//			char l=m.charAt(i);
//			String q=String.valueOf(l);
//			res.insert(0, q);
//			}
//			return res.toString();
//		}else {
//			int s=0;
//			int e=0;
//			for(int i=0;i<=x-1;i++) {
//				if(i%26==0&&i!=0) {
//					s++;
//				}
//				e=i-s*26;
//				String r1=null;
//				if(s>0) {
//			      r1=String.valueOf(m.charAt(s));
//			     }else {
//			    	 r1=" ";
//			     }
//			String r2=String.valueOf(m.charAt(e));
//			String r=r1+r2;
//			res.insert(0, r1+r2+",");
//			
//			}
//			return res.toString();
//		}
//		
//		
//		
//	}
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<Integer>();
        
        int temp=n;
        while(set.add(n)){    
        int sum=0;  
        while(n>0){
           sum=sum+(n%10)*(n%10);
            n=n/10;
            //System.out.print(n+" ");
        }
            if(sum==1) {
            	return true;
            }else {
            	n=sum;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		math168 a=new math168();
		//String w=a.converttoString(28);
		//System.out.println(w);
		//int n=1;
		//String s="B";
		//System.out.println((char)((n%26)+'A'));
		System.out.println(a.isHappy(112));
	}

}
