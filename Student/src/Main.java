import java.util.Scanner;

import controller.Controller;
import view.View;
import model.Group;
import model.Student;
import model.Subject;
import model.Teacher;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Controller controller = new Controller();
		
		System.out.print("enter teacher name: ");
		String teacherName = input.nextLine();
		System.out.print("enter teacher family: ");
		String teacherFamily = input.nextLine();

		System.out.print("enter subject: ");
		String sub = input.nextLine();

		System.out.println("enter group name: ");
		String groupName = input.nextLine();
		
		System.out.print("enter studenst count: ");
		int students = input.nextInt();
		
		while(students!=0) {
			System.out.print("enter student name");
			String name = input.next();
			System.out.print("enter student family");
			String family = input.next();
			System.out.print("enter fNumber: ");
			//int fNumber = input.nextInt();
			String fNumber = input.next();
			System.out.print("enter mark: ");
			double mark = input.nextDouble();
			
			controller.addStudent(name, family, fNumber, mark);
			
			students--;
		}
		
		controller.addTeacher(teacherName, teacherFamily);
		controller.addSubject(sub);
		controller.addStudentsGroup(groupName);
		
		input.close();
	}
}