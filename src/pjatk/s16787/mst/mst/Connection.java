package pjatk.s16787.mst;

import java.awt.Graphics2D;
import java.awt.Color;

public class Connection {
	private Node node1, node2;
	public int cost;
	private boolean is_highlited;
	
	public Connection(Node node1, Node node2, int cost)
	{
		this.node1 = node1;
		this.node2 = node2;
		this.cost = cost;
	}
	
	public void draw(Graphics2D g2d)
	{
		if(is_highlited == true)
			g2d.setColor(new Color(255, 0, 0));
		else
			g2d.setColor(new Color(0, 0, 0));
		g2d.drawLine(node1.getCenterX(), node1.getCenterY(), node2.getCenterX(), node2.getCenterY());
		g2d.setColor(new Color(0, 0, 255));
		g2d.drawString(Integer.toString(cost), (node1.getCenterX()+node2.getCenterX())/2, 
				(node1.getCenterY()+node2.getCenterY())/2);
	}

	public void setHighlit(boolean b)
	{
		is_highlited = b;
	}
}