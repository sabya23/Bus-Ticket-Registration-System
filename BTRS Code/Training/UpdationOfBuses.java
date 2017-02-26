

		
		
	






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



	public class UpdationOfBuses extends JFrame implements ActionListener  
	{
		
		private JLabel lblfrom,lblto,lblbusno,lblblank;
		protected JComboBox cbbusno;
		private JComboBox combosource,combodest;
		private JButton btnok,btnproceed;
		private JPanel panelwest,panelcenter,panelsouth,paneleast,panel1;
		private String[][]data;
		private ArrayList<BusType> buslist;
		private String[] source,dest;
		private String[]check;
		private String[]check1;
		private String id;
		private String[] busid;
		Box verticalboxfrom,verticalboxto,verticalproceed, verticalbox1,verticalboxid, verticalbox2,horizontalbox,verticalbox3;	
		public UpdationOfBuses ()
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
		//check=new String[buslist.size()];
		//check1=new String[buslist.size()];
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
		lblto=new JLabel("TO");
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
			
		setTitle("Update Selection");
		btnok.setEnabled(false);
		btnproceed.addActionListener(this);
		btnok.addActionListener(this);
			
			
		}
		

			
		public void actionPerformed(ActionEvent event) 
		{
			int index=0,row=0,col=0,row1=0,i=1;
			if(event.getSource()==btnproceed)
			{
				btnok.setEnabled(true);
				//busid=new String[70];
			
			for(index=0;index<=buslist.size()-1;index++)
			{
				BusType busdetails=buslist.get(index);
				String source=(String)(combosource.getSelectedItem());
				String dest=(String)combodest.getSelectedItem();
				if(source.equals(busdetails.getBusfrom())&& dest.equals(busdetails.getBusto()))
						{
					cbbusno.addItem(""+busdetails.getBusid());
						 
						}
							
			}
			}
			
			if(event.getSource()==btnok)
			{
				String id=(String)(cbbusno.getSelectedItem());
				new UpdateFare(id);
            }
		}
	}

	

		
		
		
		
		
	
