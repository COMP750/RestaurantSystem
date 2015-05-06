package restaurant.panels;

import java.awt.*;
import javax.swing.*;
import restaurant.baseClasses.*;

public class Logon extends RPanel 
{
	
	//Declare Components
	RButton btnOk, btnCancel; 
	JTextField txtUserName, txtPassword;
	JLabel lblUserName, lblPassword;
			
	public Logon()
	{		
		//Set Layout Properties
		this.setLayout(new FlowLayout());				
		this.setSize(500,200);
		
		//Add Components to panel
		this.add(lblUserName = new JLabel("Username"));
		this.add(lblPassword = new JLabel("Password"));
		this.add(txtUserName = new JTextField("Username"));
		this.add(txtPassword = new JTextField("Password"));
		this.add(btnCancel = new RButton("Cancel"));
		this.add(btnOk = new RButton("Login"));
	}
	
	public static void main(String[] args) 
	{
		Logon awin = new Logon();
		awin.setVisible(true);		
	}

}
