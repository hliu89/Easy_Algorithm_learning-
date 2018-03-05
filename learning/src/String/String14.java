package String;

public class String14 {

	public String findrerfix(String[] m) {
		int min=m[0].length();
		int location=0;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length();j++) {
				if(min>m[i].length()) {
					min=m[i].length();
					location=i;
				}
			}
		}
		
		int num=0;
		while(true) {
			for(int i=0;i<m.length-1;i++) {
				char[] ch= m[i].toCharArray();
				char[] ch2=m[i+1].toCharArray();
				if(ch[num]!=ch2[num]) {
					char[] res=new char[num];
					for(int k=0;k<num;k++) {
						res[k]=ch[k];
					}
					String s=new String(res);
					return s;
				}
				
			}
			if(num==min-1) {
				return m[location];
			}
			num++;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] m= {"ade","adecc","adeds","adesss"};
		String14 a=new String14();
		String qq=a.findrerfix(m);
		System.out.println(qq);
	}

}
