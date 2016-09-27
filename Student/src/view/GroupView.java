package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GroupView extends JFrame {
	private JPanel panel;
	
	private JLabel labelGroupName = new JLabel("Group name");
	private JTextField textFieldGroupName = new JTextField("");
	
	private JButton buttonAdd = new JButton("Add");
	private JButton buttonExit = new JButton("Exit");
	
	public GroupView() {
		setTitle("New group");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		this.panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		labelGroupName.setBounds(20, 20, 80, 25);
		panel.add(labelGroupName);
		
		textFieldGroupName.setBounds(100, 20, 100, 23);
		panel.add(textFieldGroupName);
		
		buttonAdd.setBounds(250, 20, 80, 30);
		panel.add(buttonAdd);
		
		buttonExit.setBounds(250, 60, 80, 30);
		panel.add(buttonExit);
	}
	
	public String getGroupName() {
		return textFieldGroupName.getText();
	}
	
	public void buttonAddActionLitener (ActionListener listener) {
		buttonAdd.addActionListener(listener);
	}
	
	public void buttonExitActionLisner (ActionListener listener) {
		buttonExit.addActionListener(listener);
	}
}