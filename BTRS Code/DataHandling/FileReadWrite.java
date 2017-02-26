package DataHandling;






import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.util.ArrayList;

import Training.BusType;

public class FileReadWrite

{
	
	
	public static void writingToBusType(ArrayList<BusType>list) throws Exception
{
	ObjectOutputStream write;
	
	FileOutputStream file=new FileOutputStream("BusType");
	
	write=new ObjectOutputStream(file);
	
	write.writeObject(list);
}
	
	
public static  ArrayList<BusType> readingFromBusType() throws Exception
{
	
	ObjectInputStream read;
	FileInputStream file=new FileInputStream("BusType");
	read=new ObjectInputStream(file);
	
	ArrayList<Traning.BusType>list=(ArrayList<Traning.BusType>)read.readObject();
	
	return list;
	
	
	
	}

}






















