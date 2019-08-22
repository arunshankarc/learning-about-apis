package intwquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Stringjoiners {
	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(" ", "[", "]");
		List<String> list = new ArrayList<String>();
		list.add("Arun");
		list.add("check");
		stringJoiner.add(list.get(0)).add(list.get(1));
		System.out.println(stringJoiner.toString());
	}
}
