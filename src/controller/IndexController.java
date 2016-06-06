package controller;

import java.awt.*;
import java.awt.event.*;

import view.Index;
import view.LoginFrame;
import view.RegistrationFormGUI;

public class IndexController implements ActionListener{

	public Index index;
	
	
	public IndexController(Index index) {
		this.index=index;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==index.login)
		{
			new LoginFrame();
			index.f.setVisible(false);
		}
		if(e.getSource()==index.CETdesc4)
		{
			new LoginFrame();
			index.f.setVisible(false);
		}
		if(e.getSource()==index.PREdesc4)
		{
			new LoginFrame();
			index.f.setVisible(false);
		}
		if(e.getSource()==index.IITdesc4)
		{
			new LoginFrame();
			index.f.setVisible(false);
		}
		if(e.getSource()==index.signup)
		{
			new RegistrationFormGUI();
			index.f.setVisible(false);
		}
		
	}
	
}
