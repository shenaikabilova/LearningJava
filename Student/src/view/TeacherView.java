package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TeacherView extends JFrame implements Runnable{
	private JPanel panel;
	private JLabel labelTeacherName = new JLabel("Name");
	private JLabel labelTeacherFamily = new JLabel("Family");
	private JTextField textFieldTeacherName = new JTextField("");
	private JTextField textFieldTeacherFamily = new JTextField("");
	
	private JButton buttonAdd = new JButton("Add");
	private JButton buttonExit = new JButton("Exit");
	
	public TeacherView() {
		setTitle("Add new teacher");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		this.panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		labelTeacherName.setBounds(20, 20, 50, 30);
		panel.add(labelTeacherName);
		
		labelTeacherFamily.setBounds(20, 50, 50, 30);
		panel.add(labelTeacherFamily);
		
		textFieldTeacherName.setBounds(70, 20, 100, 25);
		panel.add(textFieldTeacherName);
		
		textFieldTeacherFamily.setBounds(70, 50, 100, 25);
		panel.add(textFieldTeacherFamily);
		
		buttonAdd.setBounds(200, 20, 80, 30);
		panel.add(buttonAdd);
		
		buttonExit.setBounds(200, 60, 80, 30);
		panel.add(buttonExit);
	}
	
	public String getTeacherName(){
		return textFieldTeacherName.getText();
	}
	
	public String getTeacherFamily(){
		return textFieldTeacherFamily.getText();
	}
	
	public void buttonAddActionListener(ActionListener listener){
		buttonAdd.addActionListener(listener);
	}
	
	public void buttonExitActionListener(ActionListener listener){
		buttonExit.addActionListener(listener);
	}

	@Override
	public void run() {
		setVisible(true);
	}
}