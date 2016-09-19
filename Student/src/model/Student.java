package model;
public class Student extends Person implements Comparable<Student> {
	private String fNumber;
	private int mark;
	
	public Student(String name, String family, String fNumber, int mark) {
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

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public int compareTo(Student o) {
		//return this.fNumber - o.getfNumber(); // if fN is int
		return this.fNumber.compareTo(o.getfNumber()); // if fN is String
	}
}