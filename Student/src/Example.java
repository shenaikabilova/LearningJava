import view.StudentView;
import controller.StudentController;

public class Example {
	public static void main(String[] args) {
		StudentController c = new StudentController(new StudentView());
		c.addStudent();
		c.printStudent();
	}
}