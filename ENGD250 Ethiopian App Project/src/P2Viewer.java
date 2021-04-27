import java.awt.BorderLayout;

import javax.swing.JFrame;

// @Authors - Caleb Boutell, Sophie Baer, Sage Dooley

public class P2Viewer {
	
	//A viewer for prototype 2 of our concept
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		int frameWidth = 600;
		int frameHeight = 600;
		

		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("Click the shapes");

		P2Component component = new P2Component();
		P3Component component3 = new P3Component();

//		frame.add(component);
//		frame.add(component3);

		frame.getContentPane().add(component,BorderLayout.CENTER);
		frame.getContentPane().add(component3,BorderLayout.NORTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
