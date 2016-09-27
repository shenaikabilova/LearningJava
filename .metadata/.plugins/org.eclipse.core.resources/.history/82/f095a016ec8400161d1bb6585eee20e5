package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Subject;
import view.MainWindow;
import view.SubjectView;

public class SubjectController implements ActionListener {
	private SubjectView view;
	
	public SubjectController(SubjectView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.buttonAddActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Subject(view.getSubjectName());
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