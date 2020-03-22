package swingDemo;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class addGUI extends JFrame implements ActionListener{

		JTextField tx1, tx2;
		JButton jb1, jb2, jb3;
		JLabel jl1, jl2;		
	
	public addGUI() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tx1 = new JTextField(20);
		tx2 = new JTextField(20);
		
		jb1 = new JButton("Submit");
		Image submitImage = new ImageIcon(this.getClass().getResource("/OK.png")).getImage();
		jb2 = new JButton("Reset");
		Image resetImage = new ImageIcon(this.getClass().getResource("/Reset.png")).getImage();
		
		jl1 = new JLabel("Result");
		jl2 = new JLabel("Result");
				
		add(tx1);
		add(tx2);
		add(jb1);
		add(jl1);
		add(jl2);
		add(jb2);
		
		jb1.setIcon(new ImageIcon(submitImage));
		jb2.setIcon(new ImageIcon(resetImage));
				
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int num1 = Integer.parseInt(tx1.getText());
		int num2 = Integer.parseInt(tx2.getText());
		
		int value = num1 + num2;
		
		int num3 = Integer.parseInt(tx1.getText());
		int num4 = Integer.parseInt(tx2.getText());

		int value1 = num3 - num4;
		
		jl1.setText(value + "");
		jl2.setText(value1 + "");
		
		if(e.getSource().equals(jb2)) {
			tx1.setText(null);
			tx2.setText(null);
		} else {
			
		}	
		
		
	}
		
}

//setLayout(new FlowLayout());
//setVisible(true);
//setSize(400, 400);
//setDefaultCloseOperation(EXIT_ON_CLOSE);