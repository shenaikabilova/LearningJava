import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter teacher name: ");
		String teacherName = input.nextLine();
		System.out.print("enter teacher family: ");
		String teacherFamily = input.nextLine();
		System.out.print("enter subject: ");
		String sub = input.nextLine();
		System.out.print("enter studenst count: ");
		int students = input.nextInt();
		
		Teacher teacher = new Teacher(teacherName, teacherFamily);
		SortedSet<Student> set = new TreeSet<Student>();
		Subject subject = new Subject(sub);
		Group group;
		Exam exam;
		
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
			
			Student student = new Student(name, family, fNumber, mark);
			set.add(student);
			
			students--;
		}
		
		group = new Group(1, "KST", set);
		exam = new Exam(teacher, subject, group);
		
		for(Student s : group.getStudents()) {
			System.out.println(s.getName() + " " + s.getfNumber() + " " + s.getfNumber() + " " + s.getMark());
		}
		
		input.close();
	}
}