package pjatk.s16787.mst;

public class Main
{
	public static void main(String args[])
	{
		GraphicsHandler graphicsHandler = new GraphicsHandler(800, 600);
		
		FileHandler fileHandler = new FileHandler();
		
		if(fileHandler.openFile("debug.txt"))
			fileHandler.readFile();
		
		fileHandler.close();
	}
}