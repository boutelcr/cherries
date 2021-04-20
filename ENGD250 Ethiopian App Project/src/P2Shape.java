import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.Color;

public class P2Shape {
	
	//A drawable and clickable shape for Prototype 2 of our concept
	
	public Rectangle body;
	public Color color;
//	public Point2D topLeftCorner; 
	

	public P2Shape(int x, int y) {
		body = new Rectangle(x, y, 50, 50);
		color = new Color(0,0,0);
	}


	public Rectangle getBody() {
		return body;
	}


	public void setBody(int x, int y) {
		this.body = new Rectangle(x, y, x+50, y+50);;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(int r, int g, int b) {
		this.color = new Color(r, g, b);
	}
	
	
}
