package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Student;
import view.MainWindow;
import view.StudentView;

public class StudentController implements ActionListener {
	private StudentView view;
	
	public StudentController (StudentView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.buttonAdd(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Student(view.getStudentName(), view.getStudentFamily(), view.getStudentFn(), Integer.parseInt(view.getStudentMark()));
			}
		});
		
		view.buttonExit(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainWindowController(new MainWindow());
			}
		});
	}
}