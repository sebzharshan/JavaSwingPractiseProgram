package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class buttonDemo extends JFrame implements ActionListener, ItemListener {

	JTextField jt1;
	JButton jb1;
	JLabel jl1, jl2;
	JRadioButton jrb1, jrb2;
	JCheckBox jcb1, jcb2;
	
	public buttonDemo() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jt1 = new JTextField(20);
		jb1 = new JButton("Submit");
		jrb1 = new JRadioButton("Male");
		jrb2 = new JRadioButton("Female");
		jl1 = new JLabel("Hello, there!");
		//jl2 = new JLabel("...");
		jcb1 = new JCheckBox("Singing");
		jcb2 = new JCheckBox("Gaming");
		
		ButtonGroup bg1 = new ButtonGroup();
		
		
		add(jt1);
		add(jrb1);
		add(jrb2);
		bg1.add(jrb1);
		bg1.add(jrb2);
		add(jcb1);
		add(jcb2);
		add(jb1);
		add(jl1);
		//add(jl2);
	
	
		jt1.addActionListener(this);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jb1.addActionListener(this);
		jcb1.addActionListener(this);
		jcb2.addActionListener(this);
		
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String name = jt1.getText();
		String interest = jcb1.getText();
		String interest2 = jcb2.getText();
		
		if(e.getSource().equals(jb1) && jrb1.isSelected()) {
			jl1.setText("Hello, Mr. " + name +"!");
		} else if(e.getSource().equals(jb1) && jrb2.isSelected())  {
			jl1.setText("Hello, Mrs. " + name +"!");
		} else {
			
		} 
		
		if(e.getSource().equals(jb1) && jcb1.isSelected() && jrb1.isSelected() ) {
			jl1.setText("Hello, Mr. " + name +"!" + " You like: " + interest);

		} else if(e.getSource().equals(jb1) && jcb2.isSelected() && jrb1.isSelected()) {
			jl1.setText("Hello, Mr. " + name +"!" + " You like: " + interest2);
		} else if(e.getSource().equals(jb1) && jcb1.isSelected() && jrb2.isSelected()) {
			jl1.setText("Hello, Mrs. " + name +"!" + " You like: " + interest);
		} else if(e.getSource().equals(jb1) && jcb2.isSelected() && jrb2.isSelected()) {
			jl1.setText("Hello, Mrs. " + name +"!" + " You like: " + interest2);
		} else {
			
		}
		
		if(e.getSource().equals(jb1) && jcb1.isSelected() && jcb2.isSelected() && jrb1.isSelected()) {
			jl1.setText("Hello, Mr. " + name +"!" + " You like: " + interest + " & " + interest2);
		}else if(e.getSource().equals(jb1) && jcb1.isSelected() && jcb2.isSelected() && jrb2.isSelected()) {
			jl1.setText("Hello, Mrs. " + name +"!" + " You like: " + interest + " & " + interest2);
		}else {
			
		}
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource().equals(jcb1)) {
			System.out.print("Singing is selected ");
		}else {
			System.out.print("Gaming is selected ");
		} 
	}
		
}
