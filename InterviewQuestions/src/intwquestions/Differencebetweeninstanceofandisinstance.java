package intwquestions;

public class Differencebetweeninstanceofandisinstance {
	public static void main(String[] args) throws ClassNotFoundException {
		Integer i = new Integer(5);
		System.out.println(i instanceof Integer);
		System.out.println(returnInstance(i, "java.lang.String"));
		
	}
	
	public static boolean returnInstance(Object o, String str) throws ClassNotFoundException	{
		return Class.forName(str).isInstance(o);
	}

}
