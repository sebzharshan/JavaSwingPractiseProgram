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
public class calculationGUI extends JFrame implements ActionListener {
	
	JTextField jt1, jt2;
	JButton jb1,jb2;
	JLabel jl1;
	
	public calculationGUI() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jt1 = new JTextField(20);
		jt2 = new JTextField(20);
		
		jb1 = new JButton("Add");
		Image addImage = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		jb2= new JButton("Subtract");
		Image subImage = new ImageIcon(this.getClass().getResource("/subtract.png")).getImage();
		
		jl1 = new JLabel("Result");
		
		add(jt1);
		add(jt2);
		add(jb1);
		add(jb2);
		add(jl1);
		
		jb1.setIcon(new ImageIcon(addImage));
		jb2.setIcon(new ImageIcon(subImage));
		
		jb1.addActionListener(this);	
		jb2.addActionListener(this);	
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(jb1)) {
			
			int num1 = Integer.parseInt(jt1.getText());
			int num2 = Integer.parseInt(jt2.getText());
			
			int value = num1 + num2;
			
			jl1.setText(value + "");
			
		}else if(e.getSource().equals(jb2)) {
			
			int num3 = Integer.parseInt(jt1.getText());
			int num4 = Integer.parseInt(jt2.getText());
			
			int value1 = num3 - num4;
			
			jl1.setText(value1 + "");
			
		}
		
	}

}



