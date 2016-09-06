import model.Group;
import model.Subject;
import model.Teacher;

public class Exam {
	private Teacher teacher;
	private Subject subject;
	private Group group;
	
	public Exam (Teacher teacher, Subject subject, Group group) {
		this.teacher = teacher;
		this.subject = subject;
		this.group = group;
	}
}