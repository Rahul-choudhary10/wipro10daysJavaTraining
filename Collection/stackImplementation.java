package Collection;
import java.util.*;
public class stackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		stackExample(st);
	}
	
	static void stackExample(Stack<String> st) {
		st.push("rahul");
		st.push("Sonam");
		st.push("Shriya");
		st.push("Ritika");
		st.push("keshav");
		st.push("Parthmesh");
		st.push("kamal");
		
		System.out.println("value in stack : "+st);
	}

}
