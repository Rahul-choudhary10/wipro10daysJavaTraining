package String;

public class StringManipulation {
	public static void main(String args[]) {
		String str = "Rahul Kumar";
		char charr[] = {'r','a','h','u','l'};
		
		System.out.println(str);
		
		String str2 = new String(charr);
		System.out.println(str2);
		
//		boolean equal = equals(str,"rfahu");
		StringBuffer str3 = new StringBuffer("My name is rahul");
		
		System.out.println(str3.reverse());
		System.out.println(str3.capacity());
		
	}

}
