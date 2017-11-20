package pjatk.s16787.mst;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;

public class GraphicsHandler extends JFrame
{
	FramePainter painter;
	JButton button;
	
	public GraphicsHandler(int width, int length)
	{
		setTitle("MST");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		painter = new FramePainter();
		button = new JButton("Connect all");
		painter.addButton(button);
		
		add(painter);
	}
	
	public void addNodes(Node node[])
	{
		painter.addNodes(node);
	}
	public void addConnections(Connection connection[])
	{
		painter.addConnections(connection);
	}
}
