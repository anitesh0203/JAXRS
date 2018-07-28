package com.leet;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FilePOC {

	
	
	public static void main (String args[]) throws Exception
	{
		
		FileInputStream fis= new FileInputStream("input.txt");
		FileOutputStream fos= new FileOutputStream("output.txt");
		while(fis.read()!=-1)
		{
			int data=fis.read();
			fos.write(data);
			}
		fis.close();
		fos.close();
	}
}
