







package Training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ItemListener;



import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DataHandling.FileReadWrite;
import DataHandling.ViewAllBuses;

import java.util.ArrayList;

public class BusEntry extends ValidationChecking implements ActionListener //extends ViewAllBuses
{
	   private JFrame f;
	      private JLabel lblfrom,lblto,lbldepart,lbltotalseat,lblbustype,lblbusfare,lblbusno;
	     
	     public static int counter;
	     public static int n;
	     
	      //public static int counter1=1;
	      
	      public static int m;
	      protected JButton btnadd,btnremove,btnrefresh,btnsave;
	      protected JTextField txtfrom,txtto,txtfare,txttotalseat,txtdepart,txtbustype,txtbusno;
	      JPanel panelwest,panelcenter,paneleast,panelsouth;
	      Box verticalboxfrom,verticalboxto,verticalboxdepart,verticalboxtotalseat,verticalboxbustype,verticalboxbusno,verticalboxinputfrom,verticalboxinputto,verticalboxinputdepart,boxinput,verticalboxbusfare;      
	 	 private ArrayList<BusType>list;
	 	 
	 
		 
	      
	      public BusEntry ()
	      
	      
	    
	      
	      
	      {
	    	  
	    	   list = new ArrayList<BusType>();
				  //reading from file
				
	 try{
					 
		 
		 list=FileReadWrite.readingFromBusType();
					
		 
		 }
				 
	 catch(Exception e)
		 {
	 System.out.println("File not found");
					 
					  
	 }
	    	  
	    	  
	    	   f=new JFrame();
	    	  
	    	  panelwest=new JPanel();
	    	  paneleast=new JPanel();
	    	  panelcenter=new JPanel();
	    	  panelsouth=new JPanel();
	    	  
	    
	          //f.setLayout(new FlowLayout());
	    	// f. setLayout(new GridLayout(19,10,12,12));
	    	  
	    
	    	  // cmbday=new JComboBox();
	    	   //cmdtime=new JComboBox();
	    	   //busdepart=new JButton();
	    	btnadd=new JButton("ADD");
	    	btnremove=new JButton("REMOVE");
	    	btnrefresh=new JButton("REFRESH");
	    	btnsave=new JButton("SAVE");
	    	
	    	
	    	  lblbusno=new JLabel("Bus no");
	    	  txtbusno=new JTextField(10);
	    	
	    	  
	    	    
	    	  txtbustype=new JTextField(10);
	    	   lblfrom=new JLabel(" FROM  ");
	    	   lblto=new JLabel("TO");
	    	   lbldepart=new JLabel("DEPATURE");
	    	   lbltotalseat=new JLabel("TOTAL SEATS");
	    	   lblbusfare=new JLabel("BUS FARE");
	    	   txtfare=new JTextField(10);
	    	   lblbustype=new JLabel("BUS-TYPE");
	    	   txtfrom=new JTextField(10);
	    	   txtto=new JTextField(10);
	    	   txtfare=new JTextField(10);
	    	   txttotalseat=new JTextField(10);
	    	   txtdepart=new JTextField(10);
	    	   
	    	   
	    	  
	    	  verticalboxfrom=Box.createVerticalBox();
	    	  verticalboxto=Box.createVerticalBox();
	    	  verticalboxdepart=Box.createVerticalBox();
	    	  verticalboxtotalseat=Box.createVerticalBox();
	    	  verticalboxbustype=Box.createVerticalBox();
	    	  verticalboxbusno=Box.createVerticalBox();
	    	 // verticalboxbustype=Box.createVerticalBox();
	    	 verticalboxinputfrom=Box.createVerticalBox();
	    	 verticalboxbusfare=Box.createVerticalBox();
	    	verticalboxinputto=Box.createVerticalBox();
	    			   
	    	verticalboxinputdepart=Box.createVerticalBox();
	    	boxinput=Box.createHorizontalBox();
	    	      
	    	   
	    			   boxinput.add(btnadd);
	    				
	    				boxinput.add(btnremove);
	    				
	    				boxinput.add(btnrefresh);
	    				
	    				boxinput.add(btnsave);
	    				
	    				
	    	   
	    	   
	    	   
	    	   

	    		   	   verticalboxbusno.add(lblbusno);
	    		    	
	    		    	   
	    		    	   
	    	    	   verticalboxbusno.add(txtbusno);
	    		    	   
	    	   
	    	   verticalboxfrom.add(lblfrom);
	    	   verticalboxfrom.add(txtfrom);
	    	   verticalboxto.add(lblto);
	    	   verticalboxto.add(txtto);
	    	   verticalboxdepart.add(lbldepart);
	    	   verticalboxdepart.add(txtdepart);
	    	   verticalboxtotalseat.add(lbltotalseat);
	    	   verticalboxtotalseat.add(txttotalseat);
	    	   verticalboxbustype.add(lblbustype);
	    	   verticalboxbustype.add(txtbustype);
	    	   verticalboxbusfare.add(lblbusfare);
	    	   verticalboxbusfare.add(txtfare);
	    	   
	    	   verticalboxinputfrom.add(verticalboxbusno);
	    	
	    	  
	    	   verticalboxinputfrom.add(verticalboxfrom);
	    	   verticalboxinputfrom.add(verticalboxtotalseat);
	    	   verticalboxinputto.add(verticalboxto);
	    	   verticalboxinputto.add(  verticalboxbustype);
	    	   verticalboxinputdepart.add(verticalboxdepart);
	    	   verticalboxinputdepart.add(verticalboxbusfare);
	    	   
	    	   
	    	  
				
	    	   
	    	    panelwest.add(verticalboxinputfrom);
	    	    panelcenter.add(verticalboxinputto);
	    	    paneleast.add(verticalboxinputdepart);
	    	    panelsouth.add(boxinput);
	    	   f.setLayout(new FlowLayout());
	    	    f.getContentPane().setBackground(Color.GREEN);
	    	    
	    	    panelwest.setBackground(Color.YELLOW);
	    	    panelcenter.setBackground(Color.YELLOW);
	    	    paneleast.setBackground(Color.YELLOW);
	    	    panelsouth.setBackground(Color.BLUE);
	    	    btnadd.setBackground(Color.CYAN);
	    	    btnremove.setBackground(Color.CYAN);
	    	    btnrefresh.setBackground(Color.CYAN);
	    	    btnsave.setBackground(Color.CYAN);
	    	    
	    	    
	    	    
	    	    f.setTitle("      FORM-ENTRY      ");
	    	    
	    	    
	    	    f.add( panelwest,BorderLayout.WEST);
	    	    f.add(panelcenter,BorderLayout.CENTER);
	    	    f.add(paneleast,BorderLayout.EAST);
	    	    f.add(panelsouth,BorderLayout.SOUTH);
	    	   //f. setLayout(new GridLayout(6,6,12,12));
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	    	    //boxfrom.setBounds(20,35,260,20);
	    	    // boxto.setBounds(20,50,300,40);
	    	   //f.setBackground(Color.cyan);
	    	   
	    	
	    	    
	    	  
	    	 
	    	     f.setSize(600,300);
	    	     f.setVisible(true);
	    	    
	    	     
	    	  //   txtbusno.setText(name);
	    	 	
	    	     
	    	     
	    	     
	    	     btnadd .addActionListener(this);//registering event source
	 			
	 			btnremove.addActionListener(this);
	 			
	 			btnrefresh.addActionListener(this);
	 			
	 			btnsave.addActionListener(this);
	 			
	 		btnsave.setEnabled(false);
	 		txtbusno.setText(String.valueOf(list.size()+1));
	 	    
	          txtbusno.setEditable(false); 
	 		
	 		
	      
	      
	      }
	      
	      
	      
	      
	   
			
			


















		@Override
		public void actionPerformed(ActionEvent event) {
			
			
			  
			
			if(event.getSource()==btnadd)
			
			
			{	
				validationchecking1(txtfrom.getText(),txtto.getText(),txtfare.getText(),txttotalseat.getText(),txtdepart.getText(),txtbustype.getText(),txtbusno.getText());
		
				
	btnadd.setEnabled(false);
	btnremove.setEnabled(true);
	btnsave.setEnabled(true);
	list.add(getBustype());	
	//m=Integer.parseInt(txtbusno.getText());
	//txtbusno.setText(String.valueOf(++m));
	//counter=Integer.parseInt(txtbusno.getText());


	         refreshAll();
				 
				  
				 
		    }
		
			  if(event.getSource()==btnremove)
			  {
				  btnremove.setEnabled(false);
				  
				  list.remove(list.size()-1);
				  
				  btnadd.setEnabled(true);
			  
			  
			  }
			  
			  
			  
			  
			  if(event.getSource()==btnrefresh)
			  {
				  
				  
				  refreshAll();
			  
			  }
			  
			  if(event.getSource()==btnsave)
			  {
				btnsave.setEnabled(false);
				  btnremove.setEnabled(false);
				  btnadd.setEnabled(true);
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  try
				  {
					  FileReadWrite.writingToBusType(list);
				  
				  }
				  
				 
				  catch(Exception e)
				  {
					  
					  System.out.println("Cannot write to database");
				  
				  }
				
				  
				  txtbusno.setText(String.valueOf(list.size()+1));
			  }
		}
			 
			  
			  
		  









	public  BusType getBustype()
		  {
			 
			  int busid=Integer.parseInt(txtbusno.getText().trim());
			  
			  String bustype=txtbustype.getText();     // Bus-No"," Bus-Type","from","To","Time","Total seats","Fare"
			  
			  String from =txtfrom.getText();//String bustype, String busfrom,
				//String busto, String busdepart, int bustotalseat, int busfare,
				//int busid) 
			  
			  String to=txtto.getText();
			  String depart=txtdepart.getText();
			   int totalseat=Integer.parseInt(txttotalseat.getText().trim());
			  
			  int fare=Integer.parseInt(txtfare.getText().trim());
			  
			  BusType bus=new BusType( bustype,from,to,depart,totalseat,fare,busid  ); 
			  
			  return bus;
		  }
		  
			 
		  public void refreshAll()
			  {
				  txtbusno.setText("");
				 
				  txtbustype.setText(" ");
				  
				  txtfrom.setText(" ");
				  
				  txtto.setText(" ");
				  
				  txtdepart.setText(" ");
				  
				  txttotalseat.setText(" ");
				  
				  
				  
				  txtfare.setText(" ");
				  
				  
				  
			  }
	}



	



    