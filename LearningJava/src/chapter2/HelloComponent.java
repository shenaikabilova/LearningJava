package chapter2;

import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class HelloComponent extends JComponent{
	
	public void paintComponent (Graphics g) {
		g.drawString("Hello, Java! :) ", 125, 95);
	}
}