package pjatk.s16787.mst;

public class Main
{
	public static void main(String args[])
	{
		FileHandler fileHandler = new FileHandler();
		
		if(fileHandler.openFile("debug.txt"))
			fileHandler.readFile();
		
		Node node[] = new Node[5];
		
		for(int i=0; i<5; i++)
		{
			node[i] = new Node(i, i*150, i*100);
		}
		
		Connection connection[] = new Connection[4];
		
		for(int i=0; i<4; i++)
		{
			connection[i] = new Connection(node[i], node[i+1], 5);
		}
		connection[1].setHighlit(true);
		
		GraphicsHandler graphicsHandler = new GraphicsHandler(800, 600);
		
		graphicsHandler.addNodes(node);
		
		graphicsHandler.addConnections(connection);
	}
}