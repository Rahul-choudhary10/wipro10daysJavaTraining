package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperation {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		System.out.println("ArrayList value is : "+list);
		list.add(4);
		System.out.println("ArrayList value is : "+list);
		list.add(1,4);
		list.add(8);
		list.add(90);
		list.add(4, 34);
		System.out.println("ArrayList value is : "+list);
		list.set(0, 20);
		System.out.println("ArrayList value is After using set function : "+list);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(45);
		list2.add(55);
		list2.add(48);
		list2.add(89);
		System.out.println("The value of list 2 " +list2);
		list2.remove(1);
		System.out.println("After removeing the value at 1st index: "+list2);
		System.out.println("The value of list 2 after using get operation : " +list2.get(2));
//		System.out.println("The value of lastIndex of list 2 : "+list2.IndexOf());
	}
		
}
