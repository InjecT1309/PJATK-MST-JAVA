package pjatk.s16787.mst;

public class Main
{
	public static void main(String args[])
	{
		FileHandler fileHandler = new FileHandler();
		
		if(fileHandler.openFile("debug.txt"))
			fileHandler.readFile();
		
		fileHandler.close();
	}
}