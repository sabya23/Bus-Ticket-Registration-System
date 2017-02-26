package Training;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DataHandling.FileReadWrite;
import DataHandling.SeatReadWrite;
import DataHandling.TicketReadWrite;
import DataHandling.ViewSeat;
import DataHandling.ViewTicket;

public class TicketField extends ValidationChecking implements ActionListener{

	
	JFrame f=new JFrame();
    protected JLabel lblfrom,lblto,lblticketno,lblbustype,lbldate,lblseatreq,lblbusfare,lblshow,lbltotalfare;
    protected JTextField txtticketno,txtfare,txtdate,textseatreq,txtshow,txttotalfare;
    protected JButton btnsearch,btnshowfare,btnshowseat,btnconfirm;
    protected JComboBox combfrom,combto,combbustype;
    private ArrayList<Seat1> seatlist;
    private ArrayList<Ticket> ticketlist;
    private ArrayList<BusType> buslist;
    private String[] source,dest;
    private int busid,ts,s;
	private Object Seat1;
	
		public TicketField()
		{
		
		buslist=new ArrayList<BusType>();

 	   
			
try{
				 
	 
	 buslist=FileReadWrite.readingFromBusType();
				
	 /* btnadd.setEnabled(true);
				  btnsave.setEnabled(true);
				  btnrefresh.setEnabled(false);*/
	 }
			 
catch(Exception e)
	 {
System.out.println("File not found");
				 
				  
}
System.out.println(buslist.size());
ticketlist=new ArrayList<Ticket>();

 

try{
				 
	 
	 ticketlist=TicketReadWrite.readingFromTicket();
				
	 /* btnadd.setEnabled(true);
				  btnsave.setEnabled(true);
				  btnrefresh.setEnabled(false);*/
	 }
			 
catch(Exception e)
	 {
System.out.println("File not found");
				 
				  
}
seatlist=new ArrayList<Seat1>();

 

try{
				 
	 
	 seatlist=SeatReadWrite.readingFromSeat1();
				
	 /* btnadd.setEnabled(true);
				  btnsave.setEnabled(true);
				  btnrefresh.setEnabled(false);*/
	 }
			 
catch(Exception e)
	 {
System.out.println("File not found");
				 
				  
}
source=new String[buslist.size()];
dest=new String[buslist.size()];  
int index=0,row=0,col=0,row1=0,i=0;
for(index=0;index<=buslist.size()-1;index++)


{
		BusType busdetails=buslist.get(index);
		
		
		source[index]=busdetails.getBusfrom();
		dest[index]=busdetails.getBusto();
	
	
	

}
combfrom=new JComboBox(source);
combto=new JComboBox(dest);
		 
 f.setLayout(new FlowLayout());
		 
			
		
		 btnsearch=new JButton("Search");
				 btnshowfare=new JButton("Show Fare");
				 btnshowseat=new JButton("Show Seat Availability");
				 btnconfirm=new JButton("Confirm");
		
		
		
				 lblfrom=new JLabel("       FROM        ");
						 lblto=new JLabel("         To         ");
						 lblticketno=new JLabel("  Ticket No   ");
						 lblbustype=new JLabel(" Bus Type ");
						 lbldate=new JLabel("  Date Of Journey  ");
						 lblseatreq=new JLabel(" Seat Required  ");
						 lblbusfare=new JLabel("          Bus Fare         ");
						 lblshow=new JLabel("            Seat Available          ");
						 lbltotalfare=new JLabel("         Total Fare          ");
						 txtticketno=new JTextField(10);
						 txtfare=new JTextField(10);
						 txtdate=new JTextField(10);
						 textseatreq=new JTextField(10);
						 txtshow=new JTextField(10);
						 txttotalfare=new JTextField(10);
						 txtticketno.setText(String.valueOf(ticketlist.size()+1));
		
					// combfrom=new JComboBox();
					//combto=new JComboBox();
				 combbustype=new JComboBox();
		
		
		
		
		
		 
	   
  	
  	 
	  
				 
  	   f.add(lblticketno);
  	   f.add(txtticketno);
  	   f.add(lblfrom);
  	   f.add(combfrom);
  	   f.add(lblto);
  	   f.add(combto);
  	   f.add(btnsearch);
  	   
  	   f.add(lblbustype);
  	   f.add(combbustype);
  	   f.add(btnshowfare);
  	   f.add(lblbusfare);
  	   f.add(txtfare);
  	   f.add(lbldate);
  	   f.add(txtdate);
  	   f.add(btnshowseat);
  	   f.add(lblshow);
  	   f.add(txtshow);
  	   f.add(lblseatreq);
  	   f.add(textseatreq);
  	   f.add(btnconfirm);
  	   f.add(lbltotalfare);
  	   f.add(txttotalfare);
  	   btnsearch.addActionListener(this);
	 
	  btnconfirm .addActionListener(this);
	  btnshowfare.addActionListener(this);
	  btnshowseat.addActionListener(this);
	  getContentPane().setBackground(Color.ORANGE);
	  lblfrom.setBackground(Color.CYAN);
	  lblto.setBackground(Color.CYAN);
	  lblticketno.setBackground(Color.CYAN);
	  lblbustype.setBackground(Color.CYAN);
	  lbldate.setBackground(Color.CYAN);
	  lblseatreq.setBackground(Color.CYAN);
	  lblbusfare.setBackground(Color.CYAN);
	  lblshow.setBackground(Color.CYAN);
	  lbltotalfare.setBackground(Color.CYAN);
	  txtticketno.setBackground(Color.WHITE);
	  txtfare.setBackground(Color.WHITE);
	  txtdate.setBackground(Color.WHITE);
	  textseatreq.setBackground(Color.WHITE);
	  txtshow.setBackground(Color.WHITE);
	  txttotalfare.setBackground(Color.WHITE);
	  btnsearch.setBackground(Color.BLUE);
	  btnshowfare.setBackground(Color.BLUE);
	  btnshowseat.setBackground(Color.BLUE);
	  btnconfirm.setBackground(Color.BLUE);
	  combfrom.setBackground(Color.magenta);
	  combto.setBackground(Color.magenta);
	  combbustype.setBackground(Color.magenta);
	  
	  f.setTitle("      Ticket Field     "); 
	  f.setSize(690,300);
	  f.setResizable(false);
	  f.setVisible(true);
	   
	}
	public void actionPerformed(ActionEvent event) {
		
if(event.getSource()==btnsearch)
{
	for(int index=0;index<=buslist.size()-1;index++)
	{
		BusType busdetails=buslist.get(index);
		String source=(String)(combfrom.getSelectedItem());
		String dest=(String)combto.getSelectedItem();
		if(source.equals(busdetails.getBusfrom())&& dest.equals(busdetails.getBusto()))
				{
			combbustype.addItem(""+busdetails.getBustype());
				 
				}
					
	}
	
}
	if(event.getSource()==btnshowfare)
	{
		txtticketno.setText(String.valueOf(ticketlist.size()+1));
		for(int index=0;index<=buslist.size()-1;index++)
		{
			BusType busdetails=buslist.get(index);
			String source=(String)(combfrom.getSelectedItem());
			String dest=(String)combto.getSelectedItem();
			String bustype=(String)combbustype.getSelectedItem();
			if(source.equals(busdetails.getBusfrom())&&bustype.equals(busdetails.getBustype())&& dest.equals(busdetails.getBusto()))
					{
				busid=busdetails.getBusid();
				ts=busdetails.getBustotalseat();
			
				txtfare.setText(""+busdetails.getBusfare());
					 
					}
						
		}
		
	}
	if(event.getSource()== btnshowseat)
	{
		//new ViewSeat();
		//System.out.println(buslist.size());
		int flag=0;
		for(int index=0;index<=buslist.size()-1;index++)
		{
			BusType busdetails=buslist.get(index);
			//Seat1 seatdetails=seatlist.get(index);
			String source=(String)(combfrom.getSelectedItem());
			String dest=(String)combto.getSelectedItem();
			try
			{
			Seat1 seatdetails=seatlist.get(index);
			if(busid==seatdetails.getBusid()&& txtdate.getText().trim().equals(seatdetails.getDate()))
					{
				int availseat=ts-seatdetails.getBkdseat();
				if(availseat<0)
				txtshow.setText(0+"");
				
				else txtshow.setText((ts-seatdetails.getBkdseat())+"");
				flag=1;
				
				
				//if(txtdate.getText().equals(busdetails.getBusdepart()))
				//combbustype.addItem(""+busdetails.getBustype());
					 
					}
			}
			catch(Exception e)
			{
				//System.out.println("File not found");
			
			}
						
		}
		if(flag==0)
			txtshow.setText(""+ts);
		
		
		
	}
	if(event.getSource()== btnconfirm)
	{
		
		
	
		
		validationchecking2(f,txtdate.getText(),textseatreq.getText());
		
		
		
		
		
		
		
		
		
		
		
		  
		  //String from=(String) combfrom.getSelectedItem(); 
		  
		  //String to=(String)combto.getSelectedItem(); 
		 
		 // String bustype=(String)combbustype.getSelectedItem();
		  
		  //int fare=Integer.parseInt(txtfare.getText().trim());     
		  
		  String date =txtdate.getText();
		  
		  int seatreq=Integer.parseInt(textseatreq.getText().trim());
		  int flag=0;
		  for(int index=0;index<=buslist.size()-1;index++)
			{
			  try
			  {
				Seat1 seatdetails=seatlist.get(index);
				if(busid==seatdetails.getBusid()&& txtdate.getText().trim().equals(seatdetails.getDate()))
				{
			seatdetails.setBkdseat(seatdetails.getBkdseat()+seatreq);
			flag=1;
			break;
				}
			  }
			  catch(Exception e)
			  {
				 // System.out .println("File Not Found");
			  }
				
				
		  //String time=txtdepart.getText();
		 // String totalseat=txttotalseat.getText();
		  
		  //String fare=txtfare.getText();
			}
		  if (flag==0)
		  
			{
			  Seat1 seat=new Seat1(busid,seatreq,date);
			
		 seatlist.add(getSeat());
			}
		  try
		  {
			  SeatReadWrite.writingToSeat(seatlist);
		  
		  }
		  
		 
		  catch(Exception e)
		  {
			  
			  System.out.println("Cannot write to database");
		  
		  }
		ticketlist.add(getTicket());
		 try
		  {
			  TicketReadWrite.writingToTicket(ticketlist);
		  
		  }
		  
		 
		  catch(Exception e)
		  {
			  
			  System.out.println("Cannot write to database");
		  
		  }
	     txttotalfare.setText(String.valueOf(Integer.parseInt(txtfare.getText())*Integer.parseInt(textseatreq.getText())));
		
	}
	}
		
	private Seat1 getSeat() 
	{   
		 s=(Integer.parseInt(textseatreq.getText()));
		String date=txtdate.getText();
		//int busid, int bkdseat, String date
		Seat1 seat1=new Seat1(busid,s,date); 
		return seat1;
	}
	public  Ticket getTicket()
	  {
		 
		//ticketno,from,to,bustype,fare,date;
		  int ticketno=Integer.parseInt(txtticketno.getText().trim());
		  
		  String from=(String) combfrom.getSelectedItem(); 
		  
		  String to=(String)combto.getSelectedItem(); 
		 
		  String bustype=(String)combbustype.getSelectedItem();
		  
		  int fare=Integer.parseInt(txtfare.getText().trim());     
		  
		  String date =txtdate.getText();
		  
		  int seatreq=Integer.parseInt(textseatreq.getText().trim());
		  

		  //String time=txtdepart.getText();
		 // String totalseat=txttotalseat.getText();
		  
		  //String fare=txtfare.getText();
		  Ticket ticket=new Ticket(ticketno,from,to,bustype,date,fare,seatreq,busid); 
		  
		  return ticket;
	  }


	
}