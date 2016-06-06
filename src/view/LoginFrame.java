package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

import controller.IndexController;
import controller.LoginController;

public class LoginFrame {

	public JLabel email;
	public JFrame f;
	public JLabel password;
	public JButton login;
	public JButton cancel;
	public JTextField tf1;
	public JTextField tf2;
	public JLabel l1;
	
	public LoginFrame() {
		f=new JFrame("Login Form");
		f.setContentPane(new JLabel(new ImageIcon("images\\bg3.jpg")));
		email=new JLabel("Email-ID     : ");
		email.setBounds(20, 50, 200, 20);
		password=new JLabel("Password  : ");
		password.setBounds(20, 100, 200, 20);
		l1=new JLabel("Login With Your Email-ID & Password");
		l1.setBounds(40, 10, 100, 20);
		login=new JButton("Login");
		login.setBounds(50, 170, 80, 30);
		cancel=new JButton("Cancel");
		cancel.setBounds(150, 170, 80, 30);
		
		tf1=new JTextField();
		tf1.setBounds(100, 45, 150, 30);
		tf2=new JTextField();
		tf2.setBounds(100, 95, 150, 30);
	
		f.setLayout(null);
		f.add(email);
		f.add(tf1);
		f.add(password);
		f.add(tf2);

		f.add(login);
		f.add(cancel);
		
		login.addActionListener(new LoginController(this));
		cancel.addActionListener(new LoginController(this));
		
		f.setBounds(530, 200, 300, 300);
		f.setVisible(true);
	}
	

}
