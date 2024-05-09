package Collection;
import java.util.Scanner;
import java.util.*;

public class ListInterface {

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
		Scanner sc = new Scanner(System.in);
		System.out.print("How much value you want to enter in the list 2 : ");
		int ListSize = sc.nextInt();
		//int i = sc.nextInt();
		
		for(int i=0; i<ListSize; i++) {
			int val = sc.nextInt();
			list2.add(val);
		}
		
		System.out.println("Value of list 2 : "+list2);
		
		System.out.println("After Add all the variable of list2 into list1 : "+list.addAll(list2));
		System.out.println(list);
		sc.close();
	}
}
