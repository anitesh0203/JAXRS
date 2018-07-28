package com.leet;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeExample {
 String name;
 int house;
 String disable;
 
	
	public SerializeExample(String name, int house, String disable) {
	this.name = name;
	this.house = house;
	this.disable = disable;
	Map<int,int> ans= new HashMap<int,int>();
}


	public static void main(String[] args) throws Exception{
       
		SerializeExample se= new SerializeExample("anitesh", 22, "disable");
		FileOutputStream fos= new FileOutputStream("/input.ser");
		
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(se);
		
	}

}
