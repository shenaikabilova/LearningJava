package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Subject;

public class SubjectView extends JFrame implements Runnable{
	private JPanel panel;
	private JLabel labelSubject = new JLabel("Subject");
	private JTextField textFieldSubject = new JTextField("");
	
	private JButton buttonAdd = new JButton("Add");
	private JButton buttonExit = new JButton("Exit");
	
	public SubjectView() {
		setTitle("Add new subject");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		this.panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		labelSubject.setBounds(20, 20, 50, 25);
		panel.add(labelSubject);
		
		textFieldSubject.setBounds(80, 20, 80, 25);
		panel.add(textFieldSubject);
		
		buttonAdd.setBounds(200, 20, 80, 30);
		panel.add(buttonAdd);
		
		buttonExit.setBounds(200, 60, 80, 30);
		panel.add(buttonExit);
	}
	
	public String getSubjectName() {
		return textFieldSubject.getText();
	}
	
	public void buttonAddActionListener(ActionListener listener){
		buttonAdd.addActionListener(listener);
	}
	
	public void buttonExitActionListener(ActionListener listener) {
		buttonExit.addActionListener(listener);
	}

	@Override
	public void run() {
		setVisible(true);
	}
}