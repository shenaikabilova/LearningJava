package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import model.Student;
import view.MainWindow;
import view.StudentView;

public class StudentController implements ActionListener {
	private StudentView view;
	private JDialog dialog = null;
	
	public StudentController (StudentView view) {
		this.view = view;
		
		this.view.buttonAdd(this);
		this.view.buttonExit(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.buttonAdd(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Student(view.getStudentName(), view.getStudentFamily(), view.getStudentFn()/*, Integer.parseInt(view.getStudentMark())*/);
			}
		});
		
		view.buttonExit(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				MainWindow m = new MainWindow();
//				dialog = new JDialog(m.getFrame(), m.getTitle(), false);
//				dialog.add(view);
//				dialog.setVisible(true);
				new MainWindowController(new MainWindow());
			}
		});
	}
}