package swingDemo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Timer;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class frameCaller extends JFrame implements ActionListener {

	JButton jb1;
	JProgressBar jpb1;
	int i;
	Timer t1;
	
	public frameCaller() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jb1 = new JButton("Open Addition Calculator");
		i = 0;
				
		jpb1 = new JProgressBar(0, 5);
		jpb1.setBackground(new Color(255, 255, 0));
		jpb1.setForeground(new Color(0, 0, 255));
		t1 = new Timer(1000, this);
		
		
		add(jb1);
		add(jpb1);
		
		
		jb1.addActionListener(this);
		
	}
	
	/**
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource().equals(jb1)  ) {
			t1.start();
		}else if( i == 5){
			new addGUI();
			dispose(); //or this.dispose();
			t1.stop(); //this stops the repeatedly jFrame opening error
		}else {
			i++;
			jpb1.setValue(i);
		}
	
	}
	
}


/**
 * 		if(e.getSource().equals(jb1) ) {
			
			t1.start();
			//new addGUI();
			//dispose(); //or this.dispose();
		} else if(e.getSource().equals(jb1) && i == 20) {
			new addGUI();
			dispose(); //or this.dispose();
		}else {
			i++;
			jpb1.setValue(i);
		}
		//e.getSource().equals(jpb1)
		 * 
		 * 
		 * 
		 * 
		 * 
 * 		if( i == 0 ) {
			t1.start();

		} else if(i == 5) {
			new addGUI();
			dispose(); //or this.dispose();
		}
		
		else {
			i++;
			jpb1.setValue(i);
		}
 */
