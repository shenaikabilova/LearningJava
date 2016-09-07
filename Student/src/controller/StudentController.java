package controller;

import view.StudentView;
import model.Student;

public class StudentController {
	private Student student;
	private StudentView view;
	
	public StudentController (StudentView view) {
		this.view = view;
	}
	
	public void addStudent () {
		student = new Student(view.getStudentName(), view.getStudentFamily(), view.getStudentFn(), view.getStrudentMark());
	}
	
	public void printStudent () {
		view.printStudent(student.getName(), student.getFamily(), student.getfNumber(), student.getMark());
	}
}