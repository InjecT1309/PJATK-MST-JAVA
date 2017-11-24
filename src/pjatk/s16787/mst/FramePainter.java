package pjatk.s16787.mst;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.util.Vector;

public class FramePainter extends JPanel
{
	Vector<Node> node;
	Vector<Connection> connection;
	NodeMover nodeMover;
	
	public FramePainter()
	{
		
	}
	
	public void addNewNodes(Vector<Node> newNodes)
	{
		node = newNodes;
		nodeMover = new NodeMover(node);
		addMouseListener(nodeMover);
	}
	public void addNewConnections(Vector<Connection> newConnections)
	{
		connection = newConnections;
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.clearRect(0, 0, getWidth(), getHeight());
		
		drawConnections(g2d);
		drawNodes(g2d);
	}
	private void drawNodes(Graphics2D g2d)
	{
		for(int i=0; i<node.size(); i++)
		{
			node.elementAt(i).draw(g2d);
		}
	}
	private void drawConnections(Graphics2D g2d)
	{
		for(int i=0; i<connection.size(); i++)
		{
			connection.elementAt(i).draw(g2d);
		}
	}
}
