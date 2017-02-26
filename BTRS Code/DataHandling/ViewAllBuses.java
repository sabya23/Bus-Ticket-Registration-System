package DataHandling;









import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Training.BusType;


public class ViewAllBuses extends JFrame {
	private JTable table;
	private ArrayList<BusType>list;
	private String[] heading={"Bus-No","from","To"," Bus-Type","DATE","Total seats","Fare"};
	private String[][]data;
	private JScrollPane pane;
	private int counter=1;
	public ViewAllBuses()
	{
		list=new ArrayList<BusType>();
		try
		{
			list=FileReadWrite.readingFromBusType();
			
		}
	catch(Exception exp)
	{
		System.out.println("No Records");
	}
	data=new String[list.size()][7];
	
//get object from list and convert to string
	
	int index=0,row=0,col=0;
	
	for(index=0;index<=list.size()-1;index++)
	{
		BusType bus=list.get(index);
		data[row][col]=getBusno();  
		
		data[row][++col]=bus.getBusfrom();
		data[row][++col]=bus.getBusto();
		data[row][++col]=bus.getBustype();
		data[row][++col]=bus.getBusdepart();
		data[row][++col]=String.valueOf(bus.getBustotalseat());
		data[row][++col]=String.valueOf(bus.getBusfare());
		
		
		col=0;
		++row;
		
	}	
		
		table=new JTable(data,heading);
		pane=new JScrollPane(table);
		add (pane);
		setSize(5000,2000);
		
		setVisible(true);
		setTitle("view all buses");
		
		
	}
	protected String getBusno() {
		
		
	String	Busno=String.valueOf(counter);
	counter++;
	return Busno;
	
		
	}
		
	
	
	



}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

