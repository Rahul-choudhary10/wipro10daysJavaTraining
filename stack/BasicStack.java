package stack;
import java.util.*;
public class BasicStack {
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		System.out.println("Stack is Empty because no value Entered in stack: "+st.isEmpty());
		pushOper(st);
		PopOper(st);
		peekOper(st);
		System.out.print("After doing some push and pop operation , Now stack is Empty ? : "+st.isEmpty());
	}
	
	static void pushOper(Stack st) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of stack : ");
		int size = sc.nextInt();
		System.out.print("Enter the value in stack : ");
		for(int i=1; i<=size; i++) {
			int val = sc.nextInt();
			st.push(val);
		}
		System.out.println(st);
	}
	
	static void PopOper(Stack st) {
		int popIndex = st.size();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for removing till the number of value in stack : ");
		int PopOper = sc.nextInt();
		for(int i=popIndex; i>PopOper; i--) {
			st.pop();
		}
		System.out.println(st);
	}
	
	static void peekOper(Stack st) {
		System.out.println("peek value of the stack after running all the operation : " +st.peek());
	}

}
