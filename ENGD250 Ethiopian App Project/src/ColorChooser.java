import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorChooser {

	JFrame window;
	JColorChooser colorChooser;
	JPanel pan;
	
	public static void main(String[] thing) {
		
		new ColorChooser();
		
	}
	
	public ColorChooser() {
		
		window = new JFrame();
		window.setSize(900, 700);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.GRAY);;
		window.setLayout(null);
		
		pan = new JPanel();
		pan.setBounds(100, 50, 600, 350);
		pan.setBackground(Color.GREEN);
		window.add(pan);
		
		colorChooser = new JColorChooser();
		pan.add(colorChooser);
		
		
		window.setVisible(true);
		
	}
}
