package components_and_layouts;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame() {

		setLayout(new FlowLayout());
		
		add(new JCheckBox("Huhu"));
		add(new JSpinner());
		add(new JLabel("Name:"));
		add(new JTextField(10));
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}
	
	
}
