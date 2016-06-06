package controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Model.LoginModel;
import view.Home;
import view.Index;
import view.LoginFrame;

public class LoginController implements ActionListener {

	LoginFrame loginframe;
	LoginModel m=new LoginModel();
	Index index;
	
	
	public LoginController(LoginFrame loginframe)
	{
		this.loginframe=loginframe;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginframe.login)
		{
			String email=loginframe.tf1.getText();
			String password=loginframe.tf2.getText();
			m.checkuser(email,password);
			loginframe.f.setVisible(false);
		}
		if(e.getSource()==loginframe.cancel)
		{
			loginframe.f.setVisible(false);
			new Index();
		}
		
	}

	public LoginFrame getLoginframe() {
		return loginframe;
	}
	

	public void setLoginframe(LoginFrame loginframe) {
		this.loginframe = loginframe;
	}
	

}
