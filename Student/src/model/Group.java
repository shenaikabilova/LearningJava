package model;
import java.util.SortedSet;

public class Group {
	private String groupName;
	private SortedSet<Student> students;
	
	public Group (String groupName) {
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public SortedSet<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		students.add(student);
	}
}