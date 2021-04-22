import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class P2Component extends JComponent {

	// The component of Prototype 2 of our concept

	P2Shape adam;
	
	public P2Component() {
		super();
		
		P2MouseHandler mousehandler = new P2MouseHandler();
		addMouseListener(mousehandler);
		addMouseMotionListener(mousehandler);
		
		adam = new P2Shape(10, 100);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// Asks the superclass to do its work
		super.paintComponent(g);

//		adam = new P2Shape(10, 100);

		Graphics2D graphics2 = (Graphics2D) g;
		graphics2.setStroke(new BasicStroke(2));
		graphics2.setColor(adam.getColor());

		graphics2.draw(adam.getBody());
		graphics2.fill(adam.getBody());

		
		
	}

	
	
	public P2Shape inShape(Point2D point) {
		if (adam.body.contains(point.getX(), point.getY())) {
			return adam;
		}
		
		return null;
	}

	public class P2MouseHandler implements MouseMotionListener, MouseListener {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			P2Shape inShape = P2Component.this.inShape(e.getPoint());
			if (inShape != null) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					System.out.println("womp");
					
					inShape.setColor(0,0,255);
//					inShape.setBody(100, 10);

					P2Component.this.repaint();

				} else {
					System.out.println("reserved for later");
				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// nothing to do
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// nothing to do
		}
	}

}
