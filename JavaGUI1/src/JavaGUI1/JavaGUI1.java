package JavaGUI1;

import javax.swing.*;
import java.awt.*;

class UpperPanel extends JPanel { 
	public UpperPanel() {
		setBackground(Color.DARK_GRAY);
		setLayout(new FlowLayout(FlowLayout.CENTER,6,6));
		JButton jb = new JButton("Open");
		add(jb);
		jb = new JButton("Read");
		add(jb);
		jb = new JButton("Close");
		add(jb);
	}
}

class TextPanel extends JPanel {
	public TextPanel() {
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		JLabel label = new JLabel("Hello");
		label.setLocation(230,20);
		label.setSize(30,10);
		add(label);
		label = new JLabel("Love");
		label.setLocation(20,150);
		label.setSize(30,10);
		add(label);
		label = new JLabel("Java");
		label.setLocation(70,180);
		label.setSize(30,10);
		add(label);
		}
	}

public class JavaGUI1 extends JFrame{	
	public JavaGUI1() {
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		UpperPanel np = new UpperPanel();
		c.add(np, BorderLayout.NORTH);
		TextPanel cp = new TextPanel();
		c.add(cp, BorderLayout.CENTER);
		setSize(400,400);
		setVisible(true);
	}	
	
	public static void main(String [] args) {
		new JavaGUI1();
	}
}