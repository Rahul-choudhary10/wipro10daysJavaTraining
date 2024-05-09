package Collection;
import java.util.*;
public class listTask {
//	Implement a method that takes a List as an argument and removes every second element from the list, then prints the resulting list.
	public static void main(String args[]) {
		List<Integer> li = new ArrayList<>();
		System.out.println("Current list is : "+addElemInList(li));
		System.out.println("Updated list is after running remove operation : "+removeElemInList(li));
	}
	static List addElemInList(List<Integer> li) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in list what you want to insert ");
		int size = sc.nextInt();
		for(int i=0; i<size; i++) {
			int val = sc.nextInt();
			li.add(val);
		}
		return li;
	}	
	static List removeElemInList(List<Integer> li) {
//		int size = li.size();
//		for(int i=size-1; i>=0; i--) {
//			if(!li.isEmpty()) {
//				if(i%2!=0) { //for
//					li.remove(i);
//					System.out.println(li);
//				}
//				return li;
//			}
//	
		int index = 0;
		Iterator<Integer> iterator = li.iterator();
		while (iterator.hasNext()) {
            iterator.next(); // Move to next element
            if (index % 2 != 0) {
                iterator.remove(); // Remove element if index is odd
            }
            index++;
        }
		
		return li;
	}
	
}
