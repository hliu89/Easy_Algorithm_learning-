package String;

public class String383 {

	 public boolean canConstruct(String ra, String mag) {
		 char[] ch=ra.toCharArray();
		 char[] ch2=mag.toCharArray();
		 for(int i=0;i<ra.length();i++){
			 if(ch[i]!=ch2[i]) {
				 return false;
			 }
		 }
		 
		 
		 return true;
	 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ra="abqc";
		String mag="abcde";
		String383 a=new String383();
		System.out.println(a.canConstruct(ra, mag));
		
	}

}
