package pjatk.s16787.mst;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class NodeMover implements MouseListener
{
	Vector<Node> node;
	
	public NodeMover(Vector<Node> node)
	{
		this.node = node;
	}
	
	public void mousePressed(MouseEvent e) 
	{
		int pt_x, pt_y;
		
		for(Node tmp : node)
		{
			pt_x = e.getX();
			pt_y = e.getY();
			
			if(tmp.checkIfPointInNode(pt_x, pt_y))
			{
				tmp.pickUp();
			}
		}
	}
	public void mouseReleased(MouseEvent e) 
	{
		int pt_x, pt_y;
		
		for(Node tmp : node)
		{
			if(tmp.is_movable == true)
			{
				pt_x = e.getX();
				pt_y = e.getY();
				
				tmp.setCenterPosition(pt_x, pt_y);
			}
		}
	}

	public void mouseEntered(MouseEvent e) 
	{
	
	}

	public void mouseExited(MouseEvent e) 
	{
	
	}

	public void mouseClicked(MouseEvent e) 
	{
		
	}
}
