package ForException;

enum Result{
	PASS, FAIL, NR;
	int marks;
	
	 Result() {
		System.out.println("Constructor os getting called");
	}
	 
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

enum Gender{
	MALE, FEMALE, OTHERS;
}

public class LaunchEnums {
	public static void main(String[] args) {
		Gender g = Gender.MALE;
		System.out.println(g);
		
		Gender[] gr = Gender.values();
		for (Gender gender : gr) {
			System.out.println(gender + " "+ gender.ordinal());
		}
	}
}
