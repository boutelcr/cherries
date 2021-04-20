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
import java.util.ArrayList;

import javax.swing.JComponent;

public class P2Component extends JComponent {

	// The component of Prototype 2 of our concept

	ArrayList<P2Shape> adams = new ArrayList<P2Shape>();
	ArrayList<Point2D> newAdamNodes = new ArrayList<Point2D>();
	
	public P2Component() {
		super();
		
		P2MouseHandler mousehandler = new P2MouseHandler();
		addMouseListener(mousehandler);
		addMouseMotionListener(mousehandler);
		
		adams.add(new P2Shape(10, 100, 8));
		adams.add(new P2Shape(200, 40, 3));
		for (int i=0; i<11; i++) {
			adams.add(new P2Shape(500, 10+50*i, 1));
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// Asks the superclass to do its work
		super.paintComponent(g);

//		adam = new P2Shape(10, 100);
		
		for (P2Shape adam : adams) {
			Graphics2D graphics2 = (Graphics2D) g;
			graphics2.setStroke(new BasicStroke(2));
			graphics2.setColor(adam.getColor());

			graphics2.draw(adam.getBody());
			graphics2.fill(adam.getBody());
		}		
	}

	public void drawNewAdam(Point2D point) {
		if (newAdamNodes.size() < 5) {
			newAdamNodes.add(point);
		} else {
			adams.add(new P2Shape(newAdamNodes));
			P2Component.this.repaint();
			newAdamNodes.clear();
		}
	}
	
	public P2Shape inShape(Point2D point) {
		for (P2Shape adam : adams) {
			if (adam.getBody().contains(point.getX(), point.getY())) {
				return adam;
			}
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
					System.out.println("Reserved for later");
				}
			} else if (e.getButton() == MouseEvent.BUTTON1) {
				System.out.println("pwop");
				drawNewAdam(e.getPoint());
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
