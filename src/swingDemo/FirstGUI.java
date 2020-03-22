package swingDemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class FirstGUI extends JFrame {

	public FirstGUI() {
		
		setLayout(new FlowLayout());
		
		JLabel j1 = new JLabel("Hello World");
		JLabel j2 = new JLabel("Hi there, Harshan!");
		
		add(j1);
		add(j2);
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


}
