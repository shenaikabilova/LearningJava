package chapter2;

import javax.swing.JFrame;

public class HelloJava {
	public static void main(String[] args) {
//		System.out.println("Hello Java!");
		
		JFrame frame = new JFrame("Hello, Java!"); //title
//		JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
//		frame.add(label);
		frame.setSize(300, 300); //set window size
		
		frame.add(new HelloComponent());
		frame.setVisible(true); //make it visible
	}
}