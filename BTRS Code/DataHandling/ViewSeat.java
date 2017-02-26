package DataHandling;











	import java.util.ArrayList;

	import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Training.BusType;
import Training.Seat1;


	public class ViewSeat extends JFrame {
		private JTable table;
		private ArrayList<Seat1>seatlist;
		private String[] heading={"Busid","Bkdseat","date"};
		private String[][]data;
		private JScrollPane pane;
		private int counter=1;
		public ViewSeat()
		{
			seatlist=new ArrayList<Traning.Seat1>();
			try
			{
				seatlist=SeatReadWrite.readingFromSeat1();
				
			}
		catch(Exception exp)
		{
			System.out.println("No Records");
		}
		data=new String[seatlist.size()][3];
		
	//get object from list and convert to string
		
		int index=0,row=0,col=0;
		
		for(index=0;index<=seatlist.size()-1;index++)
		{
			Traning.Seat1 seat=seatlist.get(index);
			data[row][col]=String.valueOf(seat.getBusid());  
			
			data[row][++col]=String.valueOf(seat.getBkdseat());
			data[row][++col]=(seat.getDate());
			
			
			col=0;
			++row;
			
		}	
			
			table=new JTable(data,heading);
			pane=new JScrollPane(table);
			add (pane);
			setSize(5000,2000);
			
			setVisible(true);
			setTitle("view all seats");
			
			
		}
		
		
		
		
		
		
		



}

