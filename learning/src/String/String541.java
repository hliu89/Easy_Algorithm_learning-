package String;

public class String541 {

	public String reversek(String s,int k) {
		
	   char[] ch=s.toCharArray();
	   if(k%2!=0) {
	   for(int i=0;i<=ch.length-k;i+=k) {
		   char m='0';
		   int q=0;
		   for(int j=i;j<=i+k/2;j++) {
			   m=ch[i+k-1-q];
			   ch[i+k-1-q]=ch[j];
			   ch[j]=m;
			   q++;
			  
		   }
	   }
	}else{
		 for(int i=0;i<=ch.length-k;i+=k) {
			   char m='0';
			   int q=0;
			   for(int j=i;j<i+k/2;j++) {
				   m=ch[i+k-1-q];
				   ch[i+k-1-q]=ch[j];
				   ch[j]=m;
				   q++;
				  
			   }
		   }
	}
		String news=new String(ch);
		return news;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String541 a=new String541();
		System.out.println(a.reversek("abcdef", 3));
		
		
		
	}

}
