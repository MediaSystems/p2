package spielwiese;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	
	public MyFrame() {

		add(new JButton("Klick mich!"));
		
		System.out.println("hey ho");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
	}
	
}
