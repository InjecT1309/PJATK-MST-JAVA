package pjatk.s16787.mst;

import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Node
{
	private String number;
	private final float radius = 40;
	public float pos_x, pos_y;
	
	private Ellipse2D.Float circle;
	private final Color color = new Color(255, 120, 0);
	
	public Node(int number, float x, float y)
	{
		this.number = Integer.toString(number);
		setPosition(x, y);
	}
	public Ellipse2D.Float getCircle()
	{
		return circle;
	}
	public Color getColor()
	{
		return color;
	}
	public String getNumber()
	{
		return number;
	}
	public int getTextPosX()
	{
		return (int)circle.getCenterX();
	}
	public int getTextPosY()
	{
		return (int)circle.getCenterY();
	}
	public void setPosition(float x, float y)
	{
		pos_x = x;
		pos_y = y;
		circle = new Ellipse2D.Float(x, y, radius*2, radius*2);
	}
}