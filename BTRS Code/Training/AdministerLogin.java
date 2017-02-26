
package Training;
	
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



import DataHandling.ViewAllBuses;

	public class AdministerLogin  implements ActionListener{
		
	JFrame f;
	private JMenuBar menubar;
	private JMenu menubusrelated,menubusconfirmation;
	private JMenuItem busentry,busupdate,buscancellation,busview,busviewroutes;
	private JPanel panel ;

	 public AdministerLogin()
	 {
		
		 
		
		 f=new JFrame();
		 menubar=new JMenuBar();
		 
		 menubusrelated=new JMenu("Bus-Related");
		 
		 menubusconfirmation=new JMenu("Confirmation");
		 
		 busentry=new JMenuItem("New Bus Entry");
		 
		 busupdate=new JMenuItem("Updation of Buses ");
		 
		 buscancellation=new JMenuItem("cancellation of buses");
		 
		 busview=new JMenuItem("View all buses");
		 
		// busviewroutes=new JMenuItem("View all routes");
		 panel=new JPanel();
		 
		 
		 menubusrelated.add(busentry);
		 
		 menubusrelated.add(busupdate);
		 
		 menubusrelated.add(buscancellation);
		 menubusrelated.add(busview);
		 
		 
		// menubusrelated.add(busviewroutes);
		 
		 menubar.add(menubusrelated);
		
		 
		 menubar.add(menubusconfirmation);
		 panel.add(menubar);		 
		 f.add(panel,BorderLayout.CENTER);
		 f.setLayout(new FlowLayout());
		 f.getContentPane().setBackground(Color.PINK);
		menubar.setBackground(Color.RED);
		menubusrelated.setBackground(Color.BLUE);
		menubusconfirmation.setBackground(Color.BLUE);
		busentry.setBackground(Color.BLUE);
		busupdate.setBackground(Color.GREEN);
		
		buscancellation.setBackground(Color.BLUE);
		busview.setBackground(Color.GREEN);
		 f.setTitle("                                                                                                                                         MENU---FORM                                                              ");
		  
		 f.setSize(400,200);
		f. setResizable(false);
		 
		 f.setVisible(true);
		 //register
	
		 
		 busentry.addActionListener(this);
		 
		 busupdate.addActionListener(this);
		 
		 buscancellation.addActionListener(this);
		 
		 busview.addActionListener(this);
		 
		// busviewroutes.addActionListener(this);
		 
	 
		 
		 
		 
		 
		 
		 
	 }
	 
	 public void actionPerformed(ActionEvent event)
	{
		 
		 if(event.getSource()==busentry)
		 {
			 
			 
			 new  BusEntry();
		 }
			
		 
		 
		 
		 if(event.getSource()==busupdate)
			 
		 {
		
		    new UpdationOfBuses(); 
		 }
		 
		 if(event.getSource()==buscancellation)
		 {
			 
			 
			 new CancellationOfBuses();
			 
		 }
		 
		 
		 
		 
		 if(event.getSource()==busview)
		 {
			 
			 
			 new ViewAllBuses();
			 
		 }
		 
	}
	}