package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.RegistartionModel;
import view.Index;
import view.RegistrationFormGUI;

public class RegisterController implements ActionListener{
	RegistrationFormGUI reg;
	String fname,lname,email,pass;
	int mobile;
	
	RegistartionModel m=new RegistartionModel();
	
	
	public RegistrationFormGUI getReg() {
		return reg;
	}
	

	public void setReg(RegistrationFormGUI reg) {
		this.reg = reg;
	}
	

	public String getFname() {
		return fname;
	}
	

	public void setFname(String fname) {
		this.fname = fname;
	}
	

	public String getLname() {
		return lname;
	}
	

	public void setLname(String lname) {
		this.lname = lname;
	}
	

	public String getEmail() {
		return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getPass() {
		return pass;
	}
	

	public void setPass(String pass) {
		this.pass = pass;
	}
	

	public int getMobile() {
		return mobile;
	}
	

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	

	public RegisterController(RegistrationFormGUI reg) {
		this.reg=reg;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reg.registerButton)
		{
			this.fname=reg.Firstnamefield.getText();
			this.lname=reg.lastnameField.getText();
			this.email=reg.emailField.getText();
			this.pass=reg.passwordField.getText();
			this.mobile=Integer.parseInt(reg.contactField.getText());
			
			m.register(fname, lname, email, pass, mobile);
			reg.dispose();
			
		}
		if(e.getSource()==reg.exitButton)
		{
			reg.dispose();
			new Index();
		}
		
	}

}
