package controller;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.WindowConstants;

import view.GroupView;
import view.MainWindow;
import view.StudentView;
import view.SubjectView;
import view.TeacherView;

public class MainWindowController implements ActionListener{
	private MainWindow view;
	private JDialog dialog = null;
	
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
				dialog = new JDialog(view.getFrame(), v.getTitle(), Dialog.ModalityType.DOCUMENT_MODAL);
				dialog.add(v);
				dialog.pack();
				dialog.setResizable(false);
				dialog.setVisible(true);
				dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
				new TeacherController(v);
			}
		});
		
		view.addGroupActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GroupView v = new GroupView();
				dialog = new JDialog(view.getFrame(), v.getTitle(), Dialog.ModalityType.DOCUMENT_MODAL);
				dialog.add(v);
				dialog.pack();
				dialog.setResizable(false);
				dialog.setVisible(true);
				dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
				new GroupController(v);
			}
		});
		
		view.addStudentActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentView v = new StudentView();
				dialog = new JDialog(view.getFrame(), "Example", true);
				dialog.add(v);
				dialog.pack();
				dialog.setResizable(false);
				dialog.setVisible(true);
				dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
				//new StudentController(v);
				v.buttonAdd(this);
				v.buttonExit(this);
			}
		});
		
		view.addSubjectActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SubjectView v = new SubjectView();
				dialog = new JDialog(view.getFrame(), v.getTitle(), Dialog.ModalityType.DOCUMENT_MODAL);
				dialog.add(v);
				dialog.pack();
				dialog.setResizable(false);
				dialog.setVisible(true);
				dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
				new SubjectController(v);
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