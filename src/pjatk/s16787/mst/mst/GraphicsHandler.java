package pjatk.s16787.mst;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.lang.Runnable;

public class GraphicsHandler extends JFrame implements Runnable
{
	FileHandler fileHandler;
	FramePainter painter;
	MSTButtonManager buttonManager;
	Node[] node;
	Connection[] connection;
	
	public GraphicsHandler(int width, int length)
	{
		setTitle("MST");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		fileHandler = new FileHandler();
		if(fileHandler.openFile("example.txt"))
		{
			node = fileHandler.createNodes();
			connection = fileHandler.createConnections(node);
			painter = new FramePainter(node, connection);
		}
		
		buttonManager = new MSTButtonManager();
	
		add(painter);
		add(buttonManager, BorderLayout.NORTH);
	}
	
	public void run()
	{
		while(true)
		{
			painter.repaint();
		}
	}
}
