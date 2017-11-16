package pjatk.s16787.mst;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class NodePainter extends JPanel
{
	Node node[];
	
	public NodePainter(Node node[])
	{
		this.node = node;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		
		for(int i=0; i<node.length; i++)
		{
			g2d.draw(node[i].circle);
		}
	}
	
	private void centerText(Graphics g, String text)
	{
		
	}
}
