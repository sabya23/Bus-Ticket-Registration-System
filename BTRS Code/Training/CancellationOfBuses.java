
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

import DataHandling.FileReadWrite;



public class CancellationOfBuses extends JFrame implements ActionListener  
{
	
	//JFrame f;
	private JLabel lblfrom,lblto,lblbusno,lblblank;
	private JComboBox cbbusno;
	private JComboBox combosource,combodest;
	private JButton btnok,btnproceed;
	private JPanel panelwest,panelcenter,panelsouth,paneleast,panel1;
	private String[][]data;
	private ArrayList<BusType> buslist;
	private String[] source,dest;
	private int counter=1;private String id;
	private String[] busid;
	//ActionListener cmbs = null,cmbto = null;
	Box verticalboxfrom,verticalboxto,verticalproceed, verticalbox1,verticalboxid, verticalbox2,horizontalbox,verticalbox3;	
	public CancellationOfBuses ()
	{
		
		buslist=new ArrayList<BusType>();
	try
	{
		buslist=FileReadWrite.readingFromBusType();
		
	}
catch(Exception exp)
    {
	System.out.println("No Records");
    }
		
	source=new String[buslist.size()];
	dest=new String[buslist.size()];
			/*list=new ArrayList<BusType>();
		try
		{
			list=FileReadWrite.readingFromBusType();
			
		}
	catch(Exception exp)
	{
		System.out.println("No Records");
	}
		
	 data = new String[list.size()][6];*/
	int index=0,row=0,col=0,row1=0,i=0;
	for(index=0;index<=buslist.size()-1;index++)
	{
			BusType busdetails=buslist.get(index);
			
			
			source[index]=busdetails.getBusfrom();
			dest[index]=busdetails.getBusto();
		
		
		
		
	}
	
	combosource=new JComboBox(source);
	combodest=new JComboBox(dest);
	
	
		
	setLayout(new FlowLayout());
	lblfrom=new JLabel(" FROM  ");
		//txtfrom=new JComboBox();
 	lblto=new JLabel("TO");
 	  //txtto=new JComboBox();
 	lblblank=new JLabel("         ");
 	lblbusno=new JLabel(" Bus No. ");
	btnok=new JButton("ok");
	btnproceed=new JButton("Proceed");
	cbbusno=new JComboBox();
	verticalboxfrom=Box.createVerticalBox();
	verticalproceed = Box.createVerticalBox();
	verticalbox1= Box.createVerticalBox();
 	verticalboxto=Box.createVerticalBox();
 	verticalboxid=Box.createVerticalBox();
 	verticalbox2= Box.createVerticalBox();
 	horizontalbox=Box.createHorizontalBox();
 	verticalboxfrom.add(lblfrom);
 	verticalboxfrom.add(combosource);
 	verticalproceed.add(lblblank);
 	verticalproceed.add(btnproceed);
 	verticalbox1.add(verticalboxfrom);
 	verticalbox1.add(verticalproceed);
 	verticalboxto.add(lblto);
    verticalboxto.add(combodest);
    verticalboxid.add(lblbusno);
	verticalboxid.add(cbbusno);
 	verticalbox2.add(verticalboxto);
 	verticalbox2.add(verticalboxid);
 	horizontalbox.add(btnok);
	panelwest=new JPanel();
	paneleast=new JPanel();
 	panelsouth=new JPanel();
	panelwest.add(verticalbox1);
	paneleast.add(verticalbox2);
	panelsouth.add(horizontalbox);
	add( panelwest,BorderLayout.WEST);
	add(paneleast,BorderLayout.EAST);
	add(panelsouth,BorderLayout.PAGE_END);
		
	getContentPane().setBackground(Color.CYAN);
	panelwest.setBackground(Color.YELLOW);
    
    paneleast.setBackground(Color.YELLOW);
    panelsouth.setBackground(Color.BLUE);
    btnproceed.setBackground(Color.LIGHT_GRAY);
    btnok.setBackground(Color.ORANGE);
	setSize(300,300);
	setVisible(true);
		
	setTitle("Cancel a Bus");
	btnok.setEnabled(false);
	btnproceed.addActionListener(this);
	btnok.addActionListener(this);
		
		
	}
	//@Override
	public void actionPerformed(ActionEvent event) 
	{
		int index=0,row=0,col=0,row1=0,i=1;
		
		if(event.getSource()==btnproceed)
		{
			btnok.setEnabled(true);
			String source1=(String)(combosource.getSelectedItem());
			String dest1=(String)combodest.getSelectedItem();
						
		for(index=0;index<=buslist.size()-1;index++)
		{
			BusType busdetails=buslist.get(index);
			
			if(source1.equalsIgnoreCase(busdetails.getBusfrom())&& dest1.equalsIgnoreCase(busdetails.getBusto()))
					{
				cbbusno.addItem(""+busdetails.getBusid());
					 
					}
						
		}
		}
		
		if(event.getSource()==btnok)
		{
			String id=(String)(cbbusno.getSelectedItem());
		       for(index=0;index<=buslist.size()-1;index++)
				{
					BusType busdetails=buslist.get(index);
					if(id.equals(""+busdetails.getBusid()))
					{
						buslist.remove(index);
					
		
		
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



	
}




