package pjatk.s16787.mst;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Vector;

public class Node
{
	private String number;
	private int pos_x, pos_y;
	private final int radius = 30;
	Vector<Connection> connection;
	
	public Node(int number, int x, int y)
	{
		this.number = Integer.toString(number);
		setPosition(x, y);
	}
	public void setPosition(int x, int y)
	{
		pos_x = x;
		pos_y = y;
	}
	public int getCenterX()
	{
		return pos_x+radius;
	}
	public int getCenterY()
	{
		return pos_y+radius;
	}
	public void draw(Graphics2D g2d)
	{
		g2d.setColor(new Color(255, 120, 0));
		g2d.fill(new Ellipse2D.Float((float)pos_x, (float)pos_y, radius*2, radius*2));
		g2d.setColor(new Color(0, 0, 0));
		g2d.draw(new Ellipse2D.Float((float)pos_x, (float)pos_y, radius*2, radius*2));
		g2d.drawString(number, pos_x+radius, pos_y+radius);
	}
			
}