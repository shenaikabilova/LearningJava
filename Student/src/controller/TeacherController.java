package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Teacher;
import view.MainWindow;
import view.TeacherView;

public class TeacherController implements ActionListener {
	private TeacherView view;
	
	public TeacherController(TeacherView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.buttonAddActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Teacher(view.getTeacherName(), view.getTeacherFamily());
			}
		});
		
		view.buttonExitActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainWindowController(new MainWindow());
			}
		});
	}
}