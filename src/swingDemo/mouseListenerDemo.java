package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class mouseListenerDemo extends JFrame {

	public mouseListenerDemo() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				
				System.out.print(x + "," + y + " ");
				
			}
			
		});
		
	}	
}
