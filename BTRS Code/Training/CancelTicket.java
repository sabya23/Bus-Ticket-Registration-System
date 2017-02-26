package Training;

 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataHandling.SeatReadWrite;
import DataHandling.TicketReadWrite;
import DataHandling.ViewTicket;



public class CancelTicket extends JFrame implements ActionListener  
{
	
	//JFrame f;
	private JLabel lblid;
	private JTextField txtid;
	//private JComboBox combosource,combodest;
	private JButton btncancel;
	private JPanel panelnorth,panelsouth;
	private String[][]data;
	private ArrayList<Ticket> ticketlist;
	private ArrayList<Seat1>seatlist;
	private String[] source,dest;
	
	private int counter=1;private String id;
	private String[] busid;
	
	Box verticalboxfrom,verticalboxto,verticalproceed, verticalbox1,verticalboxid, verticalbox2,horizontalbox,verticalbox3;	
	public CancelTicket()
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
	seatlist=new ArrayList<Seat1>();
	try
	{
		seatlist=SeatReadWrite.readingFromSeat1();
		
	}
catch(Exception exp)
    {
	System.out.println("No Records");
    }
		
	
	
		
	setLayout(new FlowLayout());
	lblid=new JLabel(" Enter Your Ticket ID                                 ");
		
	btncancel=new JButton("Cancel Ticket");
	
	txtid=new JTextField(20);
	
	
		
		add(lblid);
		add(txtid);
		add(btncancel);
		getContentPane().setBackground(Color.CYAN);
		lblid.setBackground(Color.YELLOW);
		txtid.setBackground(Color.WHITE);
		btncancel.setBackground(Color.orange);
		
	setSize(300,300);
	setVisible(true);
		
	setTitle("Cancel Your Ticket");
	
	btncancel.addActionListener(this);
		
		
	}

		
		
		
		
		
		
		
	

	//@Override
	public void actionPerformed(ActionEvent event) 
	{
		int index=0,row=0,col=0,row1=0,i=1;
		if(event.getSource()==btncancel)
		{
			
		
		for(index=0;index<=ticketlist.size()-1;index++)
		{
			Ticket ticketdetails=ticketlist.get(index);
			
			int id=Integer.parseInt(txtid.getText());
			if(id==ticketdetails.getTicketno())
			{ 
				
				for(int index1=0;index1<=seatlist.size()-1;index1++)
				{
					 Seat1 seat=seatlist.get(index1); 
				
					if(seat.getDate().equalsIgnoreCase(ticketdetails.getDate())&&seat.getBusid()==ticketdetails.getBusid())
					{ 
						seat.setBkdseat(seat.getBkdseat()-ticketdetails.getSeatreq());
					}
					}
				
				
				ticketlist.remove(index);
			


       try
		  {
			  TicketReadWrite.writingToTicket(ticketlist);
		  
		  }
		  
		 
		  catch(Exception e)
		  {
			  
			  System.out.println("Cannot write to database");
		  
		  }


break;

					 
					}
						
		}

		
		new ViewTicket();
		}
		}
		
		
					
				}
