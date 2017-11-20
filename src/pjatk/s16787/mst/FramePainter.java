package pjatk.s16787.mst;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FramePainter extends JPanel
{
	Node node[];
	Connection cnct[];
	JButton button;
	
	public FramePainter()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		drawConnections(g2d);
		drawNodes(g2d);
	}
	public void addNodes(Node node[])
	{
		this.node = node;
	}
	public void addConnections(Connection connection[])
	{
		this.cnct = connection;
	}
	public void addButton(JButton button)
	{
		add(button);
	}
	private void drawNodes(Graphics2D g2d)
	{
		for(int i=0; i<node.length; i++)
		{
			node[i].draw(g2d);
		}
	}
	private void drawConnections(Graphics2D g2d)
	{
		for(int i=0; i<cnct.length; i++)
		{
			cnct[i].draw(g2d);
		}
	}
}
