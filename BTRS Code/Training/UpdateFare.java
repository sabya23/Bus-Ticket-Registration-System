


package Training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import DataHandling.FileReadWrite;

public class UpdateFare extends JFrame implements ActionListener 
{
	//JFrame f;
	private JTextField txtfare;
	private JLabel lblfare;
	private JButton btnupdate;
	private JPanel panelnorth,panelsouth;
	private Box horizontalbox1,horizontalbox2;
	private ArrayList<BusType> buslist;
	private String id1;
	
	public UpdateFare(String id)
	
	{
		 id1=id;
		buslist=new ArrayList<BusType>();
		try
		{
			buslist=FileReadWrite.readingFromBusType();
			
		}
	catch(Exception exp)
	    {
		System.out.println("No Records");
	    }
		setLayout(new FlowLayout());
	    lblfare=new JLabel("Enter the new fare :     ");
	    txtfare=new JTextField(10);
	    btnupdate=new JButton("Update");
	    horizontalbox1=Box.createHorizontalBox();
	    horizontalbox2=Box.createHorizontalBox();
	    horizontalbox1.add(lblfare);
	    horizontalbox1.add(txtfare);
	    horizontalbox2.add(btnupdate);
	    panelnorth=new JPanel();
	    panelsouth=new JPanel();
	    panelnorth.add(horizontalbox1);
	    panelsouth.add(horizontalbox2);
	    add( panelnorth,BorderLayout.NORTH);
		add(panelsouth,BorderLayout.SOUTH);
		getContentPane().setBackground(Color.MAGENTA);
		btnupdate.setBackground(Color.CYAN);
		lblfare.setBackground(Color.PINK);
		txtfare.setBackground(Color.WHITE);
		panelnorth.setBackground(Color.BLUE);
		
		panelsouth.setBackground(Color.BLUE);
		setSize(300,300);
		setVisible(true);
			
		setTitle("Update  a Bus");
	    btnupdate.addActionListener(this);
	    
	    
		
	}

	
	
public void actionPerformed(ActionEvent event)
{
	if(event.getSource()==btnupdate)
	{
		
		
	      int index=0,row=0,col=0,row1=0,i=0;
	       for(index=0;index<=buslist.size()-1;index++)
			{
				BusType busdetails=buslist.get(index);
				
				if(id1.equals(""+busdetails.getBusid()))
				{
					buslist.set(index, setBusType(index));
				
	
	
	       try
			  {
				  FileReadWrite.writingToBusType(buslist);
			  
			  }
			  
			 
			  catch(Exception e)
			  {
				  
				  System.out.println("Cannot write to database");
			  
			  }
	
	
	
	
}
			}
	











	














}
	}
















private BusType setBusType(int index) 
{
	BusType busdetails=buslist.get(index);
	
		
	 int busid=busdetails.getBusid();
	  
	 String bustype=busdetails.getBustype();
	 String source=busdetails.getBusfrom();
	 String destination=busdetails.getBusto();
	 String departuretime=busdetails.getBusdepart();
	 int ts=busdetails.getBustotalseat();
	 int fare=Integer.parseInt(txtfare.getText());
	 int busfare=fare;
	 
	  
	  BusType busdetails1=new BusType(bustype,source,destination,departuretime,ts,busfare,busid);
	  
	  return busdetails1;

	
	
}


	
	
	

	
}

	
	

	
	



	
	

	
	



