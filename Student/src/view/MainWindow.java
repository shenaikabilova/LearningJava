package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	private JFrame frame;
	
	private JMenuBar menuBar = new JMenuBar();
	
	private JMenu menuAdd = new JMenu("Add");
	private JMenu menuExit = new JMenu("Exit");
	
	private JMenuItem menuItemAddTeacher = new JMenuItem("Add teacher");
	private JMenuItem menuItemAddGroup   = new JMenuItem("Add group");
	private JMenuItem menuItemAddStudent = new JMenuItem("Add student");
	private JMenuItem menuItemAddSubject = new JMenuItem("Add subject");
	
	public MainWindow () {
		frame = new JFrame("Welcome");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		menuBar.add(menuAdd);
		menuBar.add(menuExit);
		
		menuAdd.add(menuItemAddTeacher);
		menuAdd.add(menuItemAddGroup);
		menuAdd.add(menuItemAddStudent);
		menuAdd.add(menuItemAddSubject);
		
		frame.setJMenuBar(menuBar);
	}

	public void addTeacherActionListener(ActionListener listener){
		menuItemAddTeacher.addActionListener(listener);
	}
	
	public void addGroupActionListener(ActionListener listener){
		menuItemAddGroup.addActionListener(listener);
	}
	
	public void addStudentActionListener(ActionListener listener){
		menuItemAddStudent.addActionListener(listener);
	}
	
	public void addSubjectActionListener(ActionListener listener){
		menuItemAddSubject.addActionListener(listener);
	}
	
	public void exitActionListener(ActionListener listener){
		menuExit.addActionListener(listener);
	}
	
	public JFrame getFrame() {
		return this;
	}
	
	public String getTitle() {
		return frame.getTitle();
	}
}