package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class linkedlist141 {

	public boolean find(List<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<i;j++) {
				for(int k=0;k<list.size();k=k+j) {
					for(int l=0;l<k;l++) {
						if(list.get(l)!=list.get(l+k)) {
							return false;
							
						}
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		linkedlist141 a=new linkedlist141();
		System.out.println(a.find(list));
	}

}
