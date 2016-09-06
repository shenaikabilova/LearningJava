package controller;

import view.View;
import model.Group;
import model.Student;
import model.Subject;
import model.Teacher;

public class Controller {
//	private Teacher teacher;
//	private Subject subject;
//	private Student student;
//	private Group group;
//	private View view;
	
	public Controller () {
		
	}
	
	public void addTeacher (String name, String family) {
		new Teacher(name, family);
	}
	
	public void addSubject (String subjectName) {
		new Subject(subjectName);
		
//		subject.setSubjectName(subjectName);
	}
	
	public void addStudent (String name, String family, String fNumber, double mark) {
		new Student(name, family, fNumber, mark);
		
//		student.setName(name);
//		student.setFamily(family);
//		student.setfNumber(fNumber);
//		student.setMark(mark);
	}
	public void addStudentsGroup (String groupName) {
		new Group(groupName);
		
//		group.setGroupName(groupName);
	}
}