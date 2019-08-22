package intwquestions;

public class inheritance {
	public static void main(String[] args)	{
		// explicitly saying to take properties of class A
		A a = new b();
		System.out.println(a.i);
	}
}

class A{
	int i = 10;
}

class b extends A{
	int i = 20;
}


