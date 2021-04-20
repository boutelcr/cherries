import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.awt.*;

public class P3Component extends JComponent {
	BufferedImage img;

	public P3Component() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void importImage() {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("strawberry.jpg"));
		} catch (IOException e) {
		}
		this.img = img; 
	}

	protected void paintComponent(Graphics g) {
		// Asks the superclass to do its work
		super.paintComponent(g);

		Graphics2D graphics2 = (Graphics2D) g;
		
	}
}
