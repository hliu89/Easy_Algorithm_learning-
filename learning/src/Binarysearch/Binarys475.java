package Binarysearch;

import java.util.Arrays;

public class Binarys475 {

public int findRadius(int[] houses, int[] heaters) {
    int r=0;  
	Arrays.sort(heaters);
	while(r<houses.length) {
		int q=0;
	for(int i=0;i<heaters.length-1;i++) {
		if(heaters[i]+r<heaters[i+1]-r||heaters[0]-r>0||heaters[heaters.length-1]+r<houses.length-1) {
			r++;
			break;
		}
		
		if(i==heaters.length-2&&houses[heaters[i]]+r>=houses[heaters[i+1]]-r) {
			q=1;
		}
		
	}
	if(q==1) {
		break;
	}
	
}
	return r;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] houses= {1,2,3,4,5,6};
		int[] heaters= {2,3,4};
		Binarys475 a=new Binarys475();
		System.out.println(a.findRadius(houses, heaters));
		
	}

}
