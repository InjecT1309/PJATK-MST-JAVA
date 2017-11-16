package pjatk.s16787.mst;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;

public class NodePainter extends JPanel
{
	Node node[];
	
	public NodePainter(Node node[])
	{
		this.node = node;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		drawNodes(g2d);
	}
	
	private void drawNodes(Graphics2D g2d)
	{
		for(int i=0; i<node.length; i++)
		{
			g2d.setColor(node[i].getColor());
			g2d.fill(node[i].getCircle());
			g2d.setColor(new Color(0, 0, 0));
			g2d.drawString(node[i].getNumber(), node[i].getTextPosX(), node[i].getTextPosY());
		}
	}
}
