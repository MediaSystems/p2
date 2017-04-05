package components_and_layouts;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ComplexLayout extends JFrame{
	
	public ComplexLayout() {
		
		JLabel label = new JLabel("ein komplexes Layout");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		add(label, BorderLayout.NORTH);
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(new JLabel("Bitte Text eingeben"), BorderLayout.NORTH);
		textPanel.add(new JTextArea(), BorderLayout.CENTER);
		add(textPanel, BorderLayout.CENTER);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(3, 1));
		gridPanel.add(new JRadioButton("Red"));
		gridPanel.add(new JRadioButton("Green"));
		gridPanel.add(new JRadioButton("Blue"));		
		add(gridPanel, BorderLayout.WEST);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	
}
