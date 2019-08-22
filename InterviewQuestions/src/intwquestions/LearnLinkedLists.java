package intwquestions;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearnLinkedLists {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		ListIterator<String> iter= list.listIterator();
		while(iter.hasNext())	{
			System.out.println(iter.next());
			System.out.println(iter.nextIndex());
			//iter.set("Arun");//replace value with set value for current index
		}
		while(iter.hasPrevious())	{
			System.out.println(iter.previous());
		}
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(1));
		}
	}
}
