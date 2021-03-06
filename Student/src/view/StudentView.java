package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Group;

public class StudentView extends JFrame {
	private JPanel panel;
	private int[] marks = {2, 3, 4, 5, 6};
	
	private JLabel labelStudentName = new JLabel("Name");
	private JLabel labelStudentFamily = new JLabel("Family");
	private JLabel labelStudentFn = new JLabel("Fak. number");
	private JLabel labelStudentGroup = new JLabel("Group");
	
	private JTextField textFieldStudentName = new JTextField("");
	private JTextField textFieldStudentFamily = new JTextField("");
	private JTextField textFieldStudentFn = new JTextField("");
	
	private JComboBox<Group> comboBoxStudentGroup = new JComboBox<Group>();
	
	private JButton buttonAdd = new JButton("Add");
	private JButton buttonExit = new JButton("Exit");
	
	public StudentView() {
		setTitle("Add new student");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		labelStudentName.setBounds(20, 20, 80, 25);
		panel.add(labelStudentName);
		
		labelStudentFamily.setBounds(20, 50, 80, 25);
		panel.add(labelStudentFamily);
		
		labelStudentFn.setBounds(20, 80, 80, 25);
		panel.add(labelStudentFn);
		
		labelStudentGroup.setBounds(20, 110, 80, 25);
		panel.add(labelStudentGroup);
		
		textFieldStudentName.setBounds(100, 20, 120, 23);
		panel.add(textFieldStudentName);
		
		textFieldStudentFamily.setBounds(100, 50, 120, 23);
		panel.add(textFieldStudentFamily);
		
		textFieldStudentFn.setBounds(100, 80, 120, 23);
		panel.add(textFieldStudentFn);
		
		comboBoxStudentGroup.setBounds(100, 110, 120, 23);
		panel.add(comboBoxStudentGroup);
		
		buttonAdd.setBounds(300, 20, 80, 30);
		panel.add(buttonAdd);
		
		buttonExit.setBounds(300, 60, 80, 30);
		panel.add(buttonExit);
	}
	
	public String getStudentName() {
		return textFieldStudentName.getText();
	}
	
	public String getStudentFamily() {
		return textFieldStudentFamily.getText();
	}
	
	public String getStudentFn() {
		return textFieldStudentFn.getText();
	}
	
	public String getStudentGroup() {
		return (String) comboBoxStudentGroup.getSelectedItem();
	}
	
	public void buttonAdd(ActionListener bAdd) {
		buttonAdd.addActionListener(bAdd);
	}
  
	public void buttonExit(ActionListener bExit) {
		buttonExit(bExit);
	}
	
	public JFrame getFrame() {
		return this;
	}
}