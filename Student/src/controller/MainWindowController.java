package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GroupView;
import view.MainWindow;
import view.StudentView;
import view.SubjectView;
import view.TeacherView;

public class MainWindowController implements ActionListener{
	private MainWindow view;
	
	public MainWindowController(MainWindow view) {
		this.view = view;
		
		this.view.addTeacherActionListener(this);
		this.view.addGroupActionListener(this);
		this.view.addStudentActionListener(this);
		this.view.addSubjectActionListener(this);
		this.view.exitActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.addTeacherActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TeacherView v = new TeacherView();
				v.setVisible(true);
				new TeacherController(v);
			}
		});
		
		view.addGroupActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GroupController(new GroupView());
			}
		});
		
		view.addStudentActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new StudentController(new StudentView());
			}
		});
		
		view.addSubjectActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SubjectController(new SubjectView());	
			}
		});
		
		view.exitActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}	
}