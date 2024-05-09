package String;

public class StringMethod {
	public static void  main(String args[]) {
		String s1 = "Rahul";
		String reversed = strrev(s1);
		System.out.println(reversed);
		
		
	}
	
	static String strrev(String s1) {
		char ch;
		String RevStr = "";
		for(int i=s1.length()-1; i>=0; i--) {
			RevStr += s1.charAt(i);
		}
		return RevStr;
	}


}
