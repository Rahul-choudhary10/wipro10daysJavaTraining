package Practice;
import java.util.*;
public class StringReverse {
	public static void main(String args[]) {
		String s = "i am programming";
		System.out.println("Reversed String : "+reversed(s));
		
	}

	static String reversed(String s) {
		String str[] = s.split(" ");
		StringBuffer newStr = new StringBuffer();
		for(int i = str.length-1; i>=0; i--) {
			newStr.append(str[i]+" ");
		}
		
		String reversedString = newStr.toString();
		return reversedString;
	}
}
