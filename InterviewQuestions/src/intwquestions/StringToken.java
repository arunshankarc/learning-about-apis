package intwquestions;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		StringTokenizer stringTokenizer = new StringTokenizer("Hello Geeks How are you ?", " ", false);
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextElement());
		}
	}
}