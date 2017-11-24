package pjatk.s16787.mst;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.lang.Runnable;
import java.util.Vector;

public class GraphicsHandler extends JFrame implements Runnable
{
	FileHandler fileHandler;
	FramePainter painter;
	ButtonManager buttonManager;
	MSTManager algorithm;
	
	public static void main(String args[])
	{	
		GraphicsHandler g = new GraphicsHandler();
		g.run();
	}
	
	public GraphicsHandler()
	{
		setTitle("MST");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		painter = new FramePainter();
		fileHandler = new FileHandler();
		algorithm = new MSTManager();
		
		fileHandler.setFilePath("default.txt");
		if(fileHandler.openFile())
		{
			Vector<Node> node = fileHandler.createNodes();
			Vector<Connection> connection = fileHandler.createConnections(node);
			painter.addNewNodes(node);
			painter.addNewConnections(connection);
			algorithm.addNodes(node);
			algorithm.addConnections(connection);
		}
		
		
		buttonManager = new ButtonManager(painter, fileHandler, algorithm);
	
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
