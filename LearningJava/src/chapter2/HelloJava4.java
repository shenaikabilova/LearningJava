package chapter2;

import javax.swing.JFrame;

public class HelloJava4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloJava4");
		frame.add(new HelloComponent4("HelloJava4"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}