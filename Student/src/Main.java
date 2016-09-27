import javax.swing.SwingUtilities;

import view.GroupView;
import view.MainWindow;
import view.StudentView;
import view.StudentViewConsole;
import view.SubjectView;
import view.TeacherView;
import controller.MainWindowController;
import controller.StudentController;
import controller.StudentControllerConsole;
import controller.TeacherController;

public class Main {
	public static void main(String[] args) {
//		StudentController c = new StudentController(new StudentViewConsole());
//		c.addStudent();
//		c.printStudent();
		
		new MainWindowController(new MainWindow());

//		SwingUtilities.invokeLater(new Runnable() {
//			
//			@Override
//			public void run() {
//				new StudentController(new StudentView());
//			}
//		});
		
//		new StudentController(new StudentView());
		
//		SwingUtilities.invokeLater(new GroupView());
	}
}