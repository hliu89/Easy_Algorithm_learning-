package String;

public class String459 {

	public boolean hasSubString(String s) {

    
		int begin=0;
		int box=0;
		while(true) {
			box++;
		while(true) {
			int end=begin+box;
			if(end+box>=s.length()) {
				return true;
			}
			if(!s.subSequence(0,0+box).equals(s.subSequence(begin+box,end+box))) {
				break;
			}
			
			begin=begin+box;
		}
		if(box>=s.length()/2) {
			break;
		}
	}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String459 a=new String459();
		boolean b=a.hasSubString("abcabcabcabc");
		System.out.println(b);
		
	}

}
