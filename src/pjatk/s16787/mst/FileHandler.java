package pjatk.s16787.mst;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Vector;
import java.util.Arrays;

public class FileHandler
{
	BufferedReader reader;
	String filePath;
	
	public FileHandler()
	{
		
	}
	public FileHandler(String filePath)
	{
		this.filePath = filePath;
	}
	
	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}
	public boolean openFile()
	{
		try
		{
			reader = new BufferedReader(new FileReader(filePath));
		}
		catch(IOException e)
		{
			return false;
		}
		return true;
	}
	public Vector<Node> createNodes()
	{
		String line;
		
		try
		{
			reopenFile();
			line = reader.readLine();
		}
		catch(IOException e)
		{
			line = "1";
		}
		
		int howMany = Integer.parseInt(line);
		int height = 0;
		Vector<Node> node = new Vector<Node>();
		Node newNode;
		
		for(int i=0; i<howMany; i++)
		{
			if(i%9==0)
				height+=80;
			newNode = new Node(i, 50+i*80, height);
			node.add(newNode);
		}
		return node;
	}
	public Vector<Connection> createConnections(Vector<Node> node)
	{	
		String line;
		Vector<Connection> connection = new Vector<Connection>();
		
		try
		{
			reopenFile();
			reader.readLine();	//reads through the line showing how many nodes there are
			Connection newConnection;
			
			while((line = reader.readLine())!=null)
			{
				int[] info = parseConnectionInfo(line);
				newConnection = new Connection(node.elementAt(info[0]), node.elementAt(info[1]), info[2]);
				connection.add(newConnection);
			}
		}
		catch(IOException e)
		{
			
		}
		
		return connection;
	}
	
	public void reopenFile()
	{
		try
		{
			reader = new BufferedReader(new FileReader(filePath));
		}
		catch(IOException e)
		{
			
		}
	}
	private int[] parseConnectionInfo(String line)
	{
		int[] info = new int[3];
		String tmp = "";
		
		int whichInfo = 0;
		for(int i=0; i<line.length(); i++)
		{
			if(line.charAt(i)==';')
			{
				info[whichInfo] = Integer.parseInt(tmp);
				tmp = "";
				whichInfo++;
				
			}
			else
				tmp += line.charAt(i);
		}
		
		return info;
	}
}