package Training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JRadioButton;

public class Welcome  implements ActionListener {
	
	
	private  JFrame f;
	private JPanel panel;
	private JRadioButton rdnadmin,rdncustomer;
	private ButtonGroup bg;
	public Welcome()
	{
f=new JFrame();
 f.setLayout(new FlowLayout());
 ButtonGroup bg=new ButtonGroup();
rdnadmin=new JRadioButton("Admin");
rdncustomer=new JRadioButton("Customer");
bg.add(rdnadmin);
bg.add(rdncustomer);
f.getContentPane().setBackground(Color.MAGENTA);
rdnadmin.setBackground(Color.lightGray);
rdncustomer.setBackground(Color.lightGray);
f.setTitle("                                                                                                                                              WELCOME TO PHOTON TRAVELS                     ");
f.add(rdnadmin);
f.add(rdncustomer);
f.setSize(400,200);
f.setResizable(false);
f.setVisible(true);
rdnadmin.addActionListener(this);
rdncustomer.addActionListener(this);
//panel.add(rdnadmin);
//panel.add(rdncustomer);
//f.add(panel,BorderLayout.CENTER);
 //f.add(panelcenter,BorderLayout.EAST);

}
	
	
	public void actionPerformed(ActionEvent event)
	{
			
		if(event.getSource()==rdnadmin)
		{

			
			new LoginPage();
			
		}	
		
		
		
		if(event.getSource()==rdncustomer)
		{
			
			
			new CustomerPanel();
			
		}	
		
			
			}
		
		
		
}
	


