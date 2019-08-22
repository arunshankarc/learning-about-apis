package intwquestions;

public class LearnEnums {

	enum Day	{
		Monday, Tuesday
	}

	public static void main(String[] args) {
		Day[] days = Day.values();
		for(int i=0; i<days.length;i++) {
			System.out.println(days[i]);
		}
		System.out.println(Day.valueOf("X"));
	}
}
