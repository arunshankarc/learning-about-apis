package intwquestions;

class ParentClass {
	int max_speed = 90;
	public void disp_speed() {
		System.out.println("Inside bike");
	}
}

class Honda_bikes extends ParentClass {
	int max_speed = 150;
	public void disp_speed() {
		System.out.println("Inside Honda");
	}
}

