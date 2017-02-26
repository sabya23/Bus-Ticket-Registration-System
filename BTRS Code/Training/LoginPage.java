    package Training;
    import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
    public class LoginPage extends ValidationChecking implements ActionListener{
    JFrame f=new JFrame();
	private JLabel lblemail,lblpassword;
	protected JTextField txtemail;
	protected JPasswordField password;
	private JPanel panellabel,paneltext,panelbutton;
	private Box verticalboxlabel,verticalboxtext,horizontalbox;
	private JButton buttonok,buttonhelp;
	public LoginPage()
	{
    lblemail=new JLabel("Enter your e-mail Id");
	lblpassword=new JLabel("Enter your password");
	txtemail=new JTextField(10);
	password=new JPasswordField(0);
    panellabel=new JPanel();
	paneltext=new JPanel();
	panelbutton=new JPanel();
	buttonok=new JButton("OK");
	buttonhelp=new JButton("HELP");
	verticalboxlabel=Box.createVerticalBox();
	verticalboxtext=Box.createVerticalBox();
	horizontalbox=Box.createHorizontalBox();
    verticalboxlabel.add(lblemail);
	verticalboxlabel.add(lblpassword);
	verticalboxtext.add( txtemail);
	verticalboxtext.add(password);
	horizontalbox.add(buttonok);
	horizontalbox.add(buttonhelp);
	panellabel.add(verticalboxlabel);
	paneltext.add(verticalboxtext);
	panelbutton.add(horizontalbox);
	f.add(panellabel,BorderLayout.WEST);
	f.add(paneltext,BorderLayout.EAST);
	f.add(panelbutton,BorderLayout.SOUTH);
    f.setTitle("                     LOGIN-PAGE              ");
    f.setLayout(new FlowLayout());
    
    f.getContentPane().setBackground(Color.MAGENTA);
    lblemail.setBackground(Color.CYAN);
    lblpassword.setBackground(Color.CYAN);
    buttonok.setBackground(Color.BLUE);
    buttonhelp.setBackground(Color.BLUE);
    
    f.setSize(300,200);
	f.setVisible(true);
	f.setResizable(false);
	f.setBackground(Color.BLUE);
	 buttonok.addActionListener(this);
	buttonhelp.addActionListener(this);
		 
		 
	}


	public void actionPerformed(ActionEvent event) 
	{
		
		 if(event.getSource()==buttonok)
		 {
			 
			String email=new String(txtemail.getText());
			 
			String pwd=new String(password.getPassword()); 
		
		
			//isEmpty(pwd);
			//isEmail(email));
			validationchecking(pwd,email, f);
			
	
			
			
			
				
		 }
		 
		 
 if(event.getSource()==buttonhelp)
		 
 {
	JOptionPane.showMessageDialog(f, " Check your sources properly");
			}
		
	}
	public static void main(String[] args)
	{
		new LoginPage();
		}
	}


	