package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class liinkedlist83 {

	
	public List<Integer> dolist(int[] n){
		List<Integer> list=new ArrayList<Integer>();
			for(int j=0;j<n.length-1;j++) {
				if(n[j+1]!=n[j]) {
					list.add(n[j]);
					
				
				}
			}
		
		list.add(n[n.length-1]);
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n= {1,22,22,3,3,3,4,5,6,7,7,8,8,8,9};
		liinkedlist83 a=new liinkedlist83();
		List<Integer> list=a.dolist(n);
		for(Integer i:list) {
			System.out.println(i);
		}
	}

}

//JRE£¬JDK£¬javase cenncept
//
