package intwquestions;

import java.util.HashMap;
import java.util.Map;

public class HowMapWorks {
	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "A");
		hMap.put(2, "B");
		hMap.put(null, "test");
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
