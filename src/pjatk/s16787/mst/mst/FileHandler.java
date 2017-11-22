package pjatk.s16787.mst;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Vector;
import java.util.Arrays;

public class FileHandler
{
	BufferedReader reader = null;
	String filePath;
	
	public FileHandler()
	{
		
	}
	
	public boolean openFile(String filePath)
	{
		try
		{
			reader = new BufferedReader(new FileReader(filePath));
			this.filePath = filePath;
		}
		catch(IOException e)
		{
			return false;
		}
		return true;
	}
	public Node[] createNodes()
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
		Node node[] = new Node[howMany];
		for(int i=0; i<howMany; i++)
		{
			if(i%9==0)
				height+=80;
			node[i] = new Node(i, 50+i*80, height);
		}
		return node;
	}
	public Connection[] createConnections(Node node[])
	{	
		String line;
		Connection connection[] = new Connection[16];
		
		try
		{
			reopenFile();
			reader.readLine();	//reads through the line showing how many nodes there are
			
			int i=0;
			while((line = reader.readLine())!=null)
			{
				int[] info = parseConnectionInfo(line);
				connection[i] = new Connection(node[info[0]], node[info[1]], info[2]);
				i++;
			}
		}
		catch(IOException e)
		{
			
		}
		
		return connection;
	}
	
	private void reopenFile()
	{
		try
		{
			reader = new BufferedReader(new FileReader(filePath));
		}
		catch(IOException e)
		{
			
		}
	}
	private int checkHowManyLines()
	{
		int output = 0;
		
		try
		{	
			reopenFile();
			while(reader.readLine()!=null)
			{
				output++;
			}
			reader.reset();
		}
		catch(IOException e)
		{
			
		}
		
		return output;
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