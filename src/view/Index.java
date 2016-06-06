package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import controller.IndexController;
import controller.LoginController;

public class Index{
	
	public JButton login;
	public JButton signup,IITdesc4,PREdesc4,CETdesc4;
	public JFrame f;
	public JLabel Gott;
	
	public Index()
	{
	 f=new JFrame("Welcome To Online Assessment Tools");
	 f.setContentPane(new JLabel(new ImageIcon("images\\bg3.jpg")));
	 login=new JButton("Login");
	 signup=new JButton("Sign Up");
	 login.setBounds(1000, 50, 110, 40);
	 signup.setBounds(1120,50,110,40);
	
	
	 ImageIcon pic = new ImageIcon("images\\logo.png");
	 JLabel icon=new JLabel(pic,JLabel.LEFT);
	 icon.setBounds(10, 2, 300, 200);
	 
	 f.add(icon);
	 f.add(login);
	 f.add(signup);
	
        
     JLabel l=new JLabel("Practice Tests for IIT, Pre-Medical & MHT-CET Exams");
     l.setFont(l.getFont().deriveFont(28.04f));
     f.add(l);
     l.setBounds(300, 150, 900, 100);
     
     Gott=new JLabel("Copyright 2016. Design & Developed By Gott Software Solutions Pvt. Ltd.");
 	 Gott.setFont(Gott.getFont().deriveFont(12.05f));
 	 Gott.setBounds(900, 650, 600, 30);
 	 f.add(Gott);
     
      JLabel IIT=new JLabel("IIT- JEE");
      IIT.setFont(IIT.getFont().deriveFont(28.04f));
      f.add(IIT);
      f.setLayout(null);
      IIT.setBounds(230,250,150,100);
      
      JLabel PRE=new JLabel("PRE-MEDICAL");
      PRE.setFont(PRE.getFont().deriveFont(28.04f));
      f.add(PRE);
      f.setLayout(null);
      PRE.setBounds(560,200,300,200);
      
      JLabel CET=new JLabel("CET");
      CET.setFont(CET.getFont().deriveFont(28.04f));
      f.add(CET);
      f.setLayout(null);
      CET.setBounds(1020,150,100,300);
      
      JLabel IITdesc=new JLabel("IIT JEE is an abbreviation for Indian Institute of Technology");
      IITdesc.setFont(IITdesc.getFont().deriveFont(12.00f));
      f.add(IITdesc);
      IITdesc.setBounds(130,300,350,100);
      
      JLabel IITdesc1=new JLabel("Joint Entrance Examination.");
      IITdesc1.setFont(IITdesc1.getFont().deriveFont(12.00f));
      f.add(IITdesc1);
      IITdesc1.setBounds(200,330,280,100);
      
      
      
      
      JLabel PREdesc=new JLabel("The All India Pre-Medical / Pre-Dental Entrance Test (AIPMT)");
      PREdesc.setFont(PREdesc.getFont().deriveFont(12.00f));
      f.add(PREdesc);
      PREdesc.setBounds(500,300,350,100);
      
      JLabel PREdesc1=new JLabel("are an annual medical entrance examination in India.");
      PREdesc1.setFont(PREdesc1.getFont().deriveFont(12.00f));
      f.add(PREdesc1);
      PREdesc1.setBounds(510,330,350,100);
      
      
      
      JLabel CETdesc=new JLabel("The MH-CET or Common Entrance Test is an annual entrance");
      CETdesc.setFont(CETdesc.getFont().deriveFont(12.00f));
      f.add(CETdesc);
      CETdesc.setBounds(890,300,350,100);
      
      JLabel CETdesc1=new JLabel("exam conducted by the Government of Maharashtra.");
      CETdesc1.setFont(CETdesc1.getFont().deriveFont(12.00f));
      f.add(CETdesc1);
      CETdesc1.setBounds(910,330,350,100);
      
     
      
      JLabel IITdesc2=new JLabel("Packages Start From Rs.2199");
      IITdesc2.setFont(IITdesc2.getFont().deriveFont(14.00f));
      f.add(IITdesc2);
      IITdesc2.setBounds(185,370,280,100);
      
     
      
      JLabel PREdesc3=new JLabel("Packages Start From Rs.2199");
      PREdesc3.setFont(PREdesc3.getFont().deriveFont(14.00f));
      f.add(PREdesc3);
      PREdesc3.setBounds(560,370,280,100);
     
      
      JLabel CETdesc3=new JLabel("Packages Start From Rs.2199");
      CETdesc3.setFont(CETdesc3.getFont().deriveFont(14.00f));
      f.add(CETdesc3);
      CETdesc3.setBounds(960,370,280,100);
      
      IITdesc4=new JButton("Login");
      f.add(IITdesc4);
      IITdesc4.setBounds(220,450,120,40);
      
      PREdesc4=new JButton("Login");
      f.add(PREdesc4);
      PREdesc4.setBounds(595,450,120,40);
      
      CETdesc4=new JButton("Login");
      f.add(CETdesc4);
      CETdesc4.setBounds(995,450,120,40);
      
     
      
      login.addActionListener(new IndexController(this));
	  signup.addActionListener(new IndexController(this));
	  IITdesc4.addActionListener(new IndexController(this));
	  PREdesc4.addActionListener(new IndexController(this));
	  CETdesc4.addActionListener(new IndexController(this));
	  
	  
	  f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	  f.setSize(1365, 750);
	  f.setVisible(true);
	 }
 
}
