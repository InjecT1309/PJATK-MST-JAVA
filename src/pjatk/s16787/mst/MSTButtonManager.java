package pjatk.s16787.mst;

import javax.swing.JPanel;
import javax.swing.JButton;
//import java.awt.event.*;

public class MSTButtonManager extends JPanel{
	JButton load, connect, reset;
	
	FileHandler fileHandler;
	
	public MSTButtonManager()
	{
		load = new JButton("Load from file");
		connect = new JButton("Connect all modules");
		reset = new JButton("Reset");
		
		add(load);
		add(connect);
		add(reset);
	}
}
