package intwquestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArraysToArrayList {

	public static void main(String[] args) {

		String[] arr = {"Arun", "shankar", "C"};
		List<String> list = new LinkedList<>(); 
		list = Arrays.asList(arr);
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())	{
			System.out.println(iter.next());
		}

		StringBuilder sb = new StringBuilder();
		String str1 = sb.append("Arun").toString();
		String str2 = sb.reverse().toString();
		System.out.println(str1);
		System.out.println(str2);
	}

}
