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
public class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener{
	String theMessage;
	int messageX = 125;
	int messageY = 94;
	JButton theButton;
	int colorIndex;
	static Color[] someColors = { Color.black, Color.red, Color.blue, Color.magenta };
	
	public HelloComponent3( String message ) {
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout( new FlowLayout() );
		add( theButton );
		theButton.addActionListener( this );
		addMouseMotionListener( this );
	}
	
	public void paintComponent( Graphics g ) {
		g.drawString( theMessage, messageX, messageY );
	}
	
	@Override
	public void actionPerformed( ActionEvent e ) {
		if (e.getSource() == theButton)
			changeColor();
	}

	@Override
	public void mouseDragged( MouseEvent e ) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	synchronized private void changeColor() {
		// Change the index to the next color, awkwardly.
		if (++colorIndex == someColors.length)
		colorIndex = 0;
		setForeground( currentColor() ); // Use the new color.
		repaint();
	}
	
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}
}