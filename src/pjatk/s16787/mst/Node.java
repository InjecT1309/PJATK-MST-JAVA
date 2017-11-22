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
	
	public boolean is_movable;
	
	public Node(int number, int x, int y)
	{
		this.number = Integer.toString(number);
		setCenterPosition(x, y);
	}
	public void pickUp()
	{
		is_movable = true;
	}
	public void setCenterPosition(int x, int y)
	{
		pos_x = x-radius;
		pos_y = y-radius;
		is_movable = false;
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
		g2d.drawString(number, getCenterX(), getCenterY());
	}

	public boolean checkIfPointInNode(int pt_x, int pt_y)
	{
		if(pt_x >= pos_x && pt_x <= pos_x+radius*2 &&
				pt_y >= pos_y && pt_y <= pos_y+radius*2)
			return true;
		return false;
	}
}