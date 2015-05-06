package restaurant.panels;

import java.awt.*;

import javax.swing.*;

import restaurant.baseClasses.*;

public class Login extends JFrame 
{
	
	//Declare Components
	RButton btnOk; 
	
	public void Login()
	{	
		RPanel pnl = new RPanel();
		pnl.setLayout(new GridLayout());		
		pnl.add(btnOk);
		this.add(pnl);
		
		
	}
	
	public static void main(String[] args) 
	{
		Login awin = new Login();
		awin.setVisible(true);		

	}

}
