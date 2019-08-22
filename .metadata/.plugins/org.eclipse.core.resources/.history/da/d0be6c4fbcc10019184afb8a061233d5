package intwquestions;

public class LearnFinalizeMethod {

	public static void main(String[] args) {
		LearnFinalizeMethod method = new LearnFinalizeMethod();
		System.out.println(method.hashCode()); 

		method = null;
		System.gc();
	}
	
	@Override
	public void finalize()	{
		System.out.println("finalize method called");
	}

}
