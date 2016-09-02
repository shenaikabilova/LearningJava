import java.util.SortedSet;

public class Group {
	private int groupNumber;
	private String spec;
	private SortedSet<Student> students;
	
	public Group (int groupNumber, String spec, SortedSet<Student> students) {
		this.groupNumber = groupNumber;
		this.spec = spec;
		this.students = students;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public SortedSet<Student> getStudents() {
		return students;
	}

	public void setStudents(Student student) {
		students.add(student);
	}
}