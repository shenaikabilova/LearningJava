import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter teacher name: ");
		String teacherName = input.nextLine();
		System.out.print("enter teacher family: ");
		String teacherFamily = input.nextLine();
		System.out.print("enter subject: ");
		String subject = input.nextLine();
		System.out.print("enter studenst count: ");
		int students = input.nextInt();
		
		Teacher teacher = new Teacher(teacherName, teacherFamily, subject);
		List<Student> group = new ArrayList<Student>();
		
		while(students!=0) {
			System.out.print("enter student name");
			String name = input.next();
			System.out.print("enter student family");
			String family = input.next();
			System.out.print("enter fNumber: ");
			String fNumber = input.next();
			System.out.print("enter spec: ");
			String spec = input.next();
			System.out.print("enter mark: ");
			double mark = input.nextDouble();
			
			Student student = new Student(name, family, fNumber, spec, mark);
			group.add(student);
			
			students--;
		}
		
		for(Student s : group) {
			System.out.println(s.getName() + " " + s.getFamily() + " " + s.getfNumber() + " " + s.getSpec() + " " + s.getMark());
		}
		
		input.close();
	}
}