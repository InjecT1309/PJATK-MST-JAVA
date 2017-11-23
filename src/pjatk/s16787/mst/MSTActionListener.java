package pjatk.s16787.mst;

import java.awt.event.*;

public class MSTActionListener implements ActionListener
{
	FramePainter painter;
	FileHandler fileHandler;
	
	public MSTActionListener(FramePainter painter, FileHandler fileHandler)
	{
		this.painter = painter;
		this.fileHandler = fileHandler;
	}
	public void actionPerformed(ActionEvent e)
	{
		//Will be overrided	
	}
}
