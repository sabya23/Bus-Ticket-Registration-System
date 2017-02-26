package Training;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import DataHandling.ViewSeat;
import DataHandling.ViewTicket;


public  class CustomerPanel extends JFrame implements ActionListener {
	
	

	
	JFrame f;
	private JMenuBar menubar;
	private JMenu menuticketinfo;
	private JMenuItem bookticket,cancelticket,viewticket,showseat;
	private JPanel panel ;
	
	
	public CustomerPanel()
	{
		 f=new JFrame();
		 setLayout(new FlowLayout());
		 menubar=new JMenuBar();
		 
		 menuticketinfo=new JMenu(" Ticket Informaion ");
		 
		 bookticket=new JMenuItem("  BOOK TICKET");
		 cancelticket=new JMenuItem("  CANCEL TICKET ");
		 viewticket=new JMenuItem(" VIEW TICKET ");
		 
		 showseat=new JMenuItem(" SHOW SEAT ");
		 
		
		

		 
		 menuticketinfo.add(bookticket);
		 menuticketinfo.add(cancelticket);
		 menuticketinfo.add(viewticket);
		 menuticketinfo.add(showseat);
		 menubar.add(menuticketinfo);
		 panel=new JPanel();
		 panel.add(menubar);		 
		 add(panel,BorderLayout.CENTER);
		 
		 getContentPane().setBackground(Color.PINK);
		 bookticket.setBackground(Color.YELLOW);
		 cancelticket.setBackground(Color.CYAN);
		 viewticket.setBackground(Color.YELLOW);
		 showseat.setBackground(Color.CYAN);
		
	
	
     setTitle("   Customer Panel       ");
	 setSize(700,300);
	 setVisible(true);

	 bookticket.addActionListener(this);
	 cancelticket.addActionListener(this);
	 viewticket.addActionListener(this);
	 showseat.addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent event) {
	
		if(event.getSource()==bookticket)
		{
			new TicketField();
		}
		if(event.getSource()==cancelticket)
		{
			new CancelTicket();
		}
		if(event.getSource()==viewticket)
		{
			new ViewTicket();
		}
		if(event.getSource()==showseat)
		{
			new ViewSeat();
		}
		
	}
}
	
	