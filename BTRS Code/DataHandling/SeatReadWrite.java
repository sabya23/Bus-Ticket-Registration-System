package DataHandling;






import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.util.ArrayList;



import Training.Seat1;

public class SeatReadWrite

{
	
	
	public static void writingToSeat(ArrayList<Seat1>seatlist) throws Exception
{
	ObjectOutputStream write;
	
	FileOutputStream file=new FileOutputStream("SeatDB");
	
	write=new ObjectOutputStream(file);
	
	write.writeObject(seatlist);
}
	
	
public static  ArrayList<Seat1> readingFromSeat1() throws Exception
{
	
	ObjectInputStream read;
	FileInputStream file=new FileInputStream("SeatDB");
	read=new ObjectInputStream(file);
	
	ArrayList<Seat1>seatlist=(ArrayList<Seat1>)read.readObject();
	
	return seatlist;
	
	
	
	}

}






















