package pjatk.s16787.mst;

import javax.swing.JFrame;

public class GraphicsHandler extends JFrame
{
	NodePainter painter;
	
	public GraphicsHandler(int width, int length)
	{
		setTitle("MST");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void addNodes(Node node[])
	{
		painter = new NodePainter(node);
		
		add(painter);
	}
}
