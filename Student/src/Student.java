public class Student extends Person {
	private String fNumber;
	private String spec;
	private double mark;
	
	public Student(String name, String family, String fNumber, String spec, double mark) {
		super(name, family);
		this.fNumber = fNumber;
		this.spec = spec;
		this.mark = mark;
	}

	public String getfNumber() {
		return fNumber;
	}

	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}
	
	public String getSpec() {
		return spec;
	}
	
	public void setSpec (String spec) {
		this.spec = spec;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
}