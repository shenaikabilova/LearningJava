public class Student extends Person {
	private String fNumber;
	private double mark;
	
	public Student(String name, String family, String fNumber, double mark) {
		super(name, family);
		this.fNumber = fNumber;
		this.mark = mark;
	}

	public String getfNumber() {
		return fNumber;
	}

	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
}