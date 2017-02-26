package DataHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Training.Ticket;
//import Training.BusType;
import Training.TicketField;

public class TicketReadWrite

{
	
	
	public static void writingToTicket(ArrayList<Ticket>list) throws Exception
{
	ObjectOutputStream write;
	
	FileOutputStream file=new FileOutputStream("Ticket");
	
	write=new ObjectOutputStream(file);
	
	write.writeObject(list);
}
	
	
public static  ArrayList<Ticket> readingFromTicket() throws Exception
{
	
	ObjectInputStream read;
	FileInputStream file=new FileInputStream("Ticket");
	read=new ObjectInputStream(file);
	
	ArrayList<Ticket>list=(ArrayList<Ticket>)read.readObject();
	
	return list;
	
	
	
	}

}























