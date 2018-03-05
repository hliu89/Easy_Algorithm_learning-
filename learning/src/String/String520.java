package String;

public class String520 {

	public boolean iscaptains(String s) {
		if(Character.isLowerCase(s.charAt(0))){
		for(int i=0;i<s.length();i++) {
			if (!Character.isLowerCase(s.charAt(i))){
                return false;
           }
		}
		}else {
			for(int i=0;i<s.length();i++) {
				if (Character.isLowerCase(s.charAt(i))){
	                return false;
	           }
			
		}
	}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String520 a=new String520();
		System.out.println(a.iscaptains("VCVCVC"));
		
	}

}
