package pjatk.s16787.mst;

import java.util.Vector;

public class MSTManager {
	Vector<Node> node;
	Vector<Connection> connection;
	
	public MSTManager()
	{
		
	}
	public void addNodes(Vector<Node> node)
	{
		this.node = node;
	}
	public void addConnections(Vector<Connection> connection)
	{
		this.connection = connection;
	}
	public void showBestConnections()
	{
		for(int i=0; i<connection.size(); i++)
		{
			connection.elementAt(i).setVisible(false);
		}
		
		Vector<Node> addedNodes = new Vector<Node>();
		addedNodes.add(node.elementAt(0)); //starting node
		
		Connection cheapest, tmp;
		Node mother;
		
		while(addedNodes.size()<node.size()) 
		{
			cheapest = addedNodes.elementAt(0).getCheapestConnectionExcept(addedNodes);
			mother = addedNodes.elementAt(0);
			
			for(int i=0; i<addedNodes.size(); i++)
			{
				tmp = addedNodes.elementAt(i).getCheapestConnectionExcept(addedNodes);
				
				if(tmp.getCost() < cheapest.getCost())
				{
					cheapest = tmp;
					mother = addedNodes.elementAt(i);
				}
			}
			cheapest.setVisible(true);
			addedNodes.add(cheapest.getOtherNode(mother));
		}
	}
}
