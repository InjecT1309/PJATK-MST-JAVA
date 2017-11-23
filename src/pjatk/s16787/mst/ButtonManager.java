package pjatk.s16787.mst;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class ButtonManager extends JPanel{
	JButton load, connect, reset;
	
	public ButtonManager(FramePainter painter, FileHandler fileHandler)
	{
		load = new JButton("Load from file");
		connect = new JButton("Connect all modules");
		reset = new JButton("Reset");
		
		load.addActionListener(new MSTActionListener(painter, fileHandler)
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  JFrame frame = new JFrame("Load file");
			  fileHandler.setFilePath(JOptionPane.showInputDialog(frame, "Whats the file path?"));
			  if(fileHandler.openFile())
			  {
				  Vector<Node> newNodes = fileHandler.createNodes();
				  Vector<Connection> newConnections = fileHandler.createConnections(newNodes);
				  painter.addNewNodes(newNodes);
				  painter.addNewConnections(newConnections);
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(frame, "No such file");
			  }
		  }
		});
		connect.addActionListener(new MSTActionListener(painter, fileHandler)
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
		  }
		});
		reset.addActionListener(new MSTActionListener(painter, fileHandler)
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Vector<Node> newNodes = fileHandler.createNodes();
			  Vector<Connection> newConnections = fileHandler.createConnections(newNodes);
			  painter.addNewNodes(newNodes);
			  painter.addNewConnections(newConnections);
		  }
		});
		
		add(load);
		add(connect);
		add(reset);
	}
}
