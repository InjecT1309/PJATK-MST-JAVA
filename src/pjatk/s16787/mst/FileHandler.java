package pjatk.s16787.mst;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileHandler
{
	BufferedReader reader = null;
	
	public FileHandler()
	{
		//default constructor
	}
	
	public boolean openFile(String filePath)
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
	public void readFile()
	{
		String line;
		
		try
		{
			while((line = reader.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			
		}
	}
}