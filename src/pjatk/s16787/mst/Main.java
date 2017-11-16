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
			node[i] = new Node(i, 100 + i*100, 100 + i*100);
		}
		
		GraphicsHandler graphicsHandler = new GraphicsHandler(800, 600);
		
		graphicsHandler.addNodes(node);
		
		fileHandler.close();
	}
}