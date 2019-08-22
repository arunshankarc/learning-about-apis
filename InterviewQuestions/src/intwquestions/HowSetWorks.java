package intwquestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HowSetWorks {
	public static void main(String[] args) {
		//HashSet<String> hSet = new HashSet<>();
		Set<String> hSet = Collections.synchronizedSet(new LinkedHashSet<>());
		hSet.add("Arun");
		hSet.add("is");
		hSet.add("good");
		hSet.add("boy");
		// only one null is added
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		synchronized (hSet) {
			Iterator<String> iter = hSet.iterator();
			for(String str : hSet)	{
				System.out.println(str);
			}
			while(iter.hasNext())	{
				System.out.println(iter.next());
			}	
		}
	}

}
