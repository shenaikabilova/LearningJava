package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements Runnable{
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

	@Override
	public void run() {
		setVisible(true);
	}
}