package day15.predefinedfunction;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		List list=new ArrayList();
		System.out.println("Size:"+list.size());
		System.out.println("Is empty?"+list.isEmpty());
		list.add(30);
		list.add(50);
		list.add(true);
		list.add(false);
		list.add("Glory");
		list.add(20,55);
		list.add("shadglory");
		list.add(15);
		System.out.println("List is:"+list);
		System.out.println("Is the list contains 15:"+list.contains(15));
		list.remove(false);
		list.remove(1);
		System.out.println("List is:"+list);
		
		// using generic we can create homogeneous List
		List <String> names = new ArrayList<String>();
		names.add("Anuj");
		names.add("Shukla");
		names.add("Krishnmoha");
		names.add("Amit");
		names.add("Sudhakar");
		names.add("Sonam");
		
		System.out.println("Names before sorting are:"+names);
		Collections.reverse(names);
		System.out.println("List in reverse order:"+names);
		Collections.sort(names);
		System.out.println("Ascending order:"+names);
		Collections.reverse(names);
		System.out.println("Dscending order:"+names);
		
		// Traversing a list
		System.out.println("---------Traversing a list---------");
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);
		}
		System.out.println("---------Traversing a list in reverse order---------");
		ListIterator<String> li =names.listIterator(names.size());
		while(li.hasPrevious()) {
			String nm=li.previous();
			System.out.println(nm);
		}
	}

}