package pjatk.s16787.mst;

import java.awt.event.*;

public class MyActionListener implements ActionListener
{
	FramePainter painter;
	FileHandler fileHandler;
	MSTManager algorithm;
	
	public MyActionListener(FileHandler fileHandler, FramePainter painter, MSTManager algorithm)
	{
		this.fileHandler = fileHandler;
		this.painter = painter;
		this.algorithm = algorithm;
	}
	public void actionPerformed(ActionEvent e)
	{
		//Will be overrided	
	}
}
