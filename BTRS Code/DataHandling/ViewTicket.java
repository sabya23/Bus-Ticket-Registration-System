package DataHandling;


	











	import java.util.ArrayList;

	import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Training.BusType;
import Training.Seat1;
import Training.Ticket;


	public class ViewTicket extends JFrame {
		private JTable table;
		private ArrayList<Ticket>ticketlist;
		//ticketno, String from, String to, String bustype,
		//String date, int fare, int seatreq) {
		private String[] heading={"Ticket No.","From","To","Bustype","Bus ID","Date","Fare","Seats Booked"};
		private String[][]data;
		private JScrollPane pane;
		private int counter=1;
		public ViewTicket()
		{
			ticketlist=new ArrayList<Ticket>();
			try
			{
				ticketlist=TicketReadWrite.readingFromTicket();
				
			}
		catch(Exception exp)
		{
			System.out.println("No Records");
		}
		data=new String[ticketlist.size()][8];
		
	//get object from list and convert to string
		
		int index=0,row=0,col=0;
		
		for(index=0;index<=ticketlist.size()-1;index++)
		{
			Ticket ticket=ticketlist.get(index);
			data[row][col]=String.valueOf(ticket.getTicketno());  
			data[row][++col]=ticket.getFrom();
			data[row][++col]=ticket.getTo();
			data[row][++col]=ticket.getBustype();
			data[row][++col]=(""+ticket.getBusid());
			data[row][++col]=ticket.getDate();
			data[row][++col]=String.valueOf(ticket.getFare());
			data[row][++col]=String.valueOf(ticket.getSeatreq());
			
			col=0;
			++row;
			
		}	
			
			table=new JTable(data,heading);
			pane=new JScrollPane(table);
			add (pane);
			setSize(5000,2000);
			
			setVisible(true);
			setTitle("Your Ticket");
			
			
		}
		
			
		
		
		



	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



}




