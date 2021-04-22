import java.awt.BorderLayout;

import javax.swing.JFrame;

public class P2Viewer {
	
	//A viewer for prototype 2 of our concept
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		int frameWidth = 600;
		int frameHeight = 600;
		

		frame.setSize(frameWidth, frameHeight);
		frame.setTitle("Click the squares");

		P2Component component = new P2Component();
//		frame.add(component);
		P3Component component3 = new P3Component();
//		frame.add(component3);
		frame.getContentPane().add(component3,BorderLayout.CENTER);
		frame.getContentPane().add(component,BorderLayout.NORTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
