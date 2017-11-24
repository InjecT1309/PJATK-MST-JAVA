package pjatk.s16787.mst;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class ButtonManager extends JPanel{
	JButton load, connect, reset;
	
	public ButtonManager(FramePainter painter, FileHandler fileHandler, MSTManager algorithm)
	{
		load = new JButton("Load from file");
		connect = new JButton("Find best connections");
		reset = new JButton("Reset");
		
		load.addActionListener(new MyActionListener(fileHandler, painter, algorithm)
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  JFrame frame = new JFrame("Load file");
			  String newPath = JOptionPane.showInputDialog(frame, "Whats the file path?");
			  if(newPath!=null&&fileHandler.tryFile(newPath))
			  {
				  fileHandler.setFilePath(newPath);
				  fileHandler.openFile();
				  
				  Vector<Node> newNodes = fileHandler.createNodes();
				  Vector<Connection> newConnections = fileHandler.createConnections(newNodes);
				  painter.addNewNodes(newNodes);
				  painter.addNewConnections(newConnections);
				  algorithm.addNodes(newNodes);
				  algorithm.addConnections(newConnections);
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(frame, "No such file");
			  }
		  }
		});
		
		connect.addActionListener(new MyActionListener(fileHandler, painter, algorithm)
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  algorithm.showBestConnections();
		  }
		});
		
		reset.addActionListener(new MyActionListener(fileHandler, painter, algorithm)
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Vector<Node> newNodes = fileHandler.createNodes();
			  Vector<Connection> newConnections = fileHandler.createConnections(newNodes);
			  painter.addNewNodes(newNodes);
			  painter.addNewConnections(newConnections);
			  algorithm.addNodes(newNodes);
			  algorithm.addConnections(newConnections);
		  }
		});
		
		add(load);
		add(connect);
		add(reset);
	}
}
