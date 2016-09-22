package controller;

import view.StudentViewConsole;
import model.Student;

public class StudentControllerConsole {
	private Student student;
	private StudentViewConsole view;
	
	public StudentControllerConsole (StudentViewConsole view) {
		this.view = view;
	}
	
	public void addStudent () {
		student = new Student(view.getStudentName(), view.getStudentFamily(), view.getStudentFn(), view.getStrudentMark());
	}
	
	public void printStudent () {
		view.printStudent(student.getName(), student.getFamily(), student.getfNumber(), student.getMark());
	}
}