package pjatk.s16787.mst;

import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Node
{
	int number;
	float radius;
	public Ellipse2D.Float circle;
	Color color;
	
	public Node(int number, double x, double y)
	{
		this.number = number;
		color = new Color(0, 255, 0); 
		
		circle = new Ellipse2D.Float();
		
	}
}