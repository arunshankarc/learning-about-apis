package intwquestions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LearnHashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hMap = new Hashtable<>();
		hMap.put(1, "A");
		hMap.put(2, "B");
		//hMap.put(null, "test");
		//hMap.put(3, null);
		for(Map.Entry<Integer, String> map : hMap.entrySet())	{
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		
		for(Map.Entry<Integer, String> map : hMap.entrySet())	{
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
	}

}
