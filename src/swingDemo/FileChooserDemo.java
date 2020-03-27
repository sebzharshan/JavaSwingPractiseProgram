package swingDemo;

import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class FileChooserDemo extends JFrame {
	
	JTextComponent tx1;
	TextArea tx3;
	JTextField jt1;
	JButton save;
	
	public FileChooserDemo() {
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tx3  = new TextArea();
		save = new JButton("save");
		
		jt1 = new JTextField();
			
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs = new JFileChooser(new File("C:\\"));
				fs.setDialogTitle("Save file");
				fs.setFileFilter(new FileType(".txt", "Text File"));
				int result = fs.showSaveDialog(null);
				
				if(result == JFileChooser.APPROVE_OPTION) {
					String content = tx3.getText();
					String content2 = jt1.getText();
					File fi = fs.getSelectedFile();
					try {
						
						FileWriter fw = new FileWriter(fi.getPath());
						fw.write(content);
						fw.write(content2);
						fw.flush();
						fw.close();
					}
					catch(Exception e1){
						System.out.print(e1);
					}
				}
				else {
					
				}
				
				
			}
	 	}); 
		Box box = Box.createVerticalBox();
		box.add(tx3);
		box.add(save);
		box.add(jt1);
		
		add(box);
	}

}
