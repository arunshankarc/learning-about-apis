package intwquestions;

public class StringLearning {
	public static void main(String[] args) {

		String str = "Arun is a good boy";
		String strNew = new String("Arun is a bad boy");


		System.out.println(str.hashCode());
		System.out.println(strNew.hashCode());



		str = str.replace("good", "best");
		System.out.println(str);
		strNew = strNew.replace("bad", "worst");
		System.out.println(strNew);



		System.out.println(str.hashCode());
		System.out.println(strNew.hashCode());

		StringBuffer sb = new StringBuffer("Test");
		System.out.println(sb);
		System.out.println(sb.hashCode());


		sb.append(" again");
		System.out.println(sb);
		System.out.println(sb.hashCode());

		// Lets check out the performance

		long t;
		{
			t  = System.currentTimeMillis();
			String strPerformance = "";
			for(int i=0; i<=100_000_000;i++) {
				strPerformance = strPerformance.concat("");
			}
			System.out.println("Total time taken - " + (System.currentTimeMillis() - t));
		}

		{
			t  = System.currentTimeMillis();
			StringBuffer stringBuffer = new StringBuffer("");
			for(int i=0; i<=100_000_000;i++) {
				stringBuffer = stringBuffer.append("");
			}
			System.out.println("Total time taken - " + (System.currentTimeMillis() - t));
		}

		{
			t  = System.currentTimeMillis();
			StringBuilder builder = new StringBuilder("");
			for(int i=0; i<=100_000_000;i++) {
				builder = builder.append("");
			}
			System.out.println("Total time taken - " + (System.currentTimeMillis() - t));
		}
	}
}
