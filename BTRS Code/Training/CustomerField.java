

package Training;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomerField implements ActionListener{

	private JFrame f;
    protected JLabel lblname,lbladdress,lblphoneno,lblbustype,lblgender,lblbusfare;
    protected JTextField txtname,txtaddress,txtphoneno;
    protected JButton btnok,btnrefresh;
    protected JComboBox combbustype,combgender,combbusfare;
    private ArrayList<BusType> buslist;
	String[] name={"Male","Female"};
	String[]bustype1; 
	public CustomerField(){
		
		buslist=new ArrayList<BusType>();
		 f=new JFrame();
		 f. setLayout(new GridLayout(8,10,12,12));
		 
		 
		bustype1=new String[buslist.size()];
		
		
		
		
		
		
		
		
		
		int index=0,row=0,col=0;
		for(index=0;index<=buslist.size()-1;index++)
		
		
		{
				BusType busdetails=buslist.get(index);
				
				
				bustype1[index]=busdetails.getBustype();
		
			
			
			
		
		}
			
		
		 combbustype=new JComboBox(bustype1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 btnok=new JButton("OK");
		 btnrefresh=new JButton("Refresh");
	   lblname=new JLabel(" NAME  ");
  	   lbladdress=new JLabel("Address");
  	   lblphoneno=new JLabel("Phone No.");
  	 lblbustype=new JLabel(" Bus Type  ");
     lblgender=new JLabel(" Gender  ");
     lblbusfare=new JLabel(" Bus Fare  ");
  	 txtname=new JTextField(10);
  	 txtaddress=new JTextField(10);
      txtphoneno= new JTextField(10);
  	 
	  combgender=new JComboBox(name);
	  combbusfare=new JComboBox();
  	   f.add(lblname);
  	   f.add(txtname);
  	 f.add(lblgender);
  	   f.add(combgender);
  	   
  	   f.add(lbladdress);
  	   f.add(txtaddress);
  	   f.add(lblphoneno);
  	   f.add(txtphoneno);
  	   f.add(lblbustype);
  	   f.add(combbustype);
  	   f.add(lblbusfare);
  	   f.add(combbusfare);
  	   f.add(btnok);
  	   f.add(btnrefresh);
  	   btnrefresh.addActionListener(this);
	  f.setTitle("      Customer Field     "); 
	  btnok .addActionListener(this);
	  
	  f.setSize(300,300);
	     f.setVisible(true);
	   
	}
	public void actionPerformed(ActionEvent event) {
		
		
		
		
		
		 if(event.getSource()==btnrefresh)
		  {
			  
			  
			  refreshAll();
		  
		  }
	}
	public void refreshAll()
	  {
		  txtname.setText(" ");
		 
		  txtaddress.setText(" ");
		  
		  txtphoneno.setText(" ");
		  
		  combbustype.setSelectedItem(" ");
		  
		  //txtdepart.setText(" ");
		  
		  //txttotalseat.setText(" ");
		  
		  
		  
		 // txtfare.setText(" ");
		  
		  
		  
	  }


}

