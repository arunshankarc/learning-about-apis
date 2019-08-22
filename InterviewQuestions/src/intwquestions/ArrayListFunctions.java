package intwquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListFunctions {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Z");
		list1.add("Z");
		list1.add("Z");
		list1.add("Z");
		list1.add("A");
		list1.add(null);

		List<String> list2 = new ArrayList<String>();
		list2.add("B");
		list2.add("C");
			
		list1.addAll(list2);
		
		
		list1.remove("Z");
		// retains list2 but deletes list1 - opposite of removeAll
		
		//list1.retainAll(list2);
		Iterator<String> iterator = list1.iterator();

		while(iterator.hasNext())	{
			iterator.next();
			//System.out.print(iterator.next() + " ");
		}
		
		// removes list2
		
		list1.removeAll(list2);
		list1.set(1, "");
		// Clears the list
		//list1.clear();

		for(String loop : list1){
			System.out.println(loop + " ");
		}
		
		Set<String> set = new HashSet<String>();
		set.addAll(list1);
		
		for(String loop : set){
			System.out.println(loop + " ");
		}
	}
}