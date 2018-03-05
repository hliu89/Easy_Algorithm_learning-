package math;

import java.util.ArrayList;
import java.util.List;

public class math66 {

	public List addone (int[] m) {
	
	List<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<m.length;i++) {
		list.add(m[i]);
	}
	for(int i=list.size()-1;i>=0;i--) {
		if(list.get(i)!=9) {
		   list.set(i, list.get(i)+1);
		   break;
		}
		if(list.get(i)==9&&i!=0) {
			list.set(i, 0);
		}
		if(i==0&&list.get(i)==9) {
			list.set(i, 10);
			break;
		}
	}
	
	return list;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] m= {9,9,9,9,1};
		math66 a=new math66();
		List<Integer> list=a.addone(m);
		for(Integer q:list) {
			System.out.print(q);
		}
	}

}
