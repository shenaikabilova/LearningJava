package chapter2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener, Runnable{
	String theMessage;
	int messageX = 125;
	int messageY = 95;
	JButton theButton;
	int colorIndex;
	static Color[] someColor = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
	boolean blinkState;
	
	public HelloComponent4 (String message) {
		theMessage = message;
		theButton = new JButton("Change color");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
	}
	
	public void paintComponent (Graphics g) {
		g.setColor(blinkState ? getBackground() : currentColor());
		g.drawString(theMessage, messageX, messageY);
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				blinkState = !blinkState;
				repaint();
				Thread.sleep(300);
			}
		} catch(InterruptedException ie) {}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == theButton) {
			changeColor();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	synchronized private void changeColor() {
		if(++colorIndex == someColor.length)
			colorIndex=0;
		setForeground(currentColor());
		repaint();
	}
	
	synchronized private Color currentColor() {
		return someColor[colorIndex];
	}
}