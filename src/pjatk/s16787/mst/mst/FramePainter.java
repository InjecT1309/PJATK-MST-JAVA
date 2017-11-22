package pjatk.s16787.mst;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FramePainter extends JPanel
{
	Node node[];
	Connection cnct[] = new Connection[1];
	JButton button;
	NodeMover nodeMover;
	
	public FramePainter(Node node[], Connection connection[])
	{
		this.node = node;
		this.cnct = connection;
		nodeMover = new NodeMover(node);
		addMouseListener(nodeMover);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.clearRect(0, 0, 800, 600);
		
		drawConnections(g2d);
		drawNodes(g2d);
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
