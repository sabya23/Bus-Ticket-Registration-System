




	
	
	




package Training;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ValidationChecking  extends JFrame {
	
	
	
	
	
	
	

	
	
	
	
	public void validationchecking(String pwd,String email,JFrame f)
	{
	    
		
		
	
		
		
		if( email.matches("[a-z].+@.+\\.[a-z]+"))
		{
			if(pwd.equals("1234"))
				
			new AdministerLogin();
			//JOptionPane.showMessageDialog(f, "You are logged in");
			

		
		else 
			
			JOptionPane.showMessageDialog(null, " Enter the correct password  ");
		}
		else 
			JOptionPane.showMessageDialog(null, "Enter the correct format of email-id ");
		
		
	}
public void validationchecking1(String from,String to,String fare,String totalseat,String depart,String bustype,String busno)
	
	{
		
		
		if   (from.equals("")||to.equals("")||fare.equals("")||totalseat.equals("")||depart.equals("")||bustype.equals("")||busno.equals("")  )
				{
			
			JOptionPane.showMessageDialog(null,"Please enter all the fields");
			
			
			
			
			
			
			
				}
		
		
	}
	
	
	
	public void validationchecking2(JFrame f,String date,String seat)
		{
			
		
		if(date.matches("[a-z]+")||seat.equals(""))
		{
			JOptionPane.showMessageDialog(f,"Please enter all the fields correctly");
			
			
		}
		
		
		
		
		}
	
	
	
	
	

}







