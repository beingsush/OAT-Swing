package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Base64.Decoder;

import javax.swing.*;

import controller.PackageController;

public class Home{
	public JFrame f;
	public JButton login;
	public JButton signup,logout,IITPackage,PrePackage,CetPackage;
	public JLabel Gott,icon,l,IIT,Premedical,mhtcet,packages,iitdesc,iitdesc1,courses,premeddesc,premeddesc1,cetdesc,cetdesc1,prepackages,cetpackages;
	
	public Home(){
		
	f=new JFrame("Online Assessment Tools");
	
	logout=new JButton("Logout");
	logout.setBounds(1100, 70, 90, 30);
	
	Gott=new JLabel("Copyright 2016. Design & Developed By Gott Software Solutions Pvt. Ltd.");
	Gott.setFont(Gott.getFont().deriveFont(12.05f));
	Gott.setBounds(900, 650, 600, 30);

	
	ImageIcon pic = new ImageIcon("images\\logo.png");
	icon=new JLabel(pic,JLabel.LEFT);
	icon.setBounds(10, 20, 300, 120);
	
	courses=new JLabel("Courses");
	courses.setFont(courses.getFont().deriveFont(27.05f));
	courses.setBounds(600, 150, 200, 40);
	
	l=new JLabel("Get suitable course packages of Exams");
	l.setFont(l.getFont().deriveFont(26.04f));
	l.setBounds(420, 200, 500, 40);
	l.setForeground(Color.WHITE);
	
	IIT = new JLabel("IIT");
	IIT.setFont(IIT.getFont().deriveFont(24.05f));
	IIT.setBounds(200, 300, 150, 20);
	
	Premedical = new JLabel("Pre-Medical");
	Premedical.setFont(Premedical.getFont().deriveFont(24.05f));
	Premedical.setBounds(590, 300, 150, 20);
	
	mhtcet = new JLabel("MHT-CET");
	mhtcet.setFont(mhtcet.getFont().deriveFont(24.05f));
	mhtcet.setBounds(1020, 300, 150, 20);
	
	iitdesc=new JLabel("IIT JEE is an abbreviation for Indian Institute of Technology");
	iitdesc.setFont(iitdesc.getFont().deriveFont(13.05f));
	iitdesc.setBounds(40, 350, 400, 20);
	
	iitdesc1=new JLabel("Joint Entrance Examination.");
	iitdesc1.setFont(iitdesc1.getFont().deriveFont(13.05f));
	iitdesc1.setBounds(130, 380, 300, 20);
	
	premeddesc=new JLabel("The All India Pre-Medical / Pre-Dental Entrance Test");
	premeddesc.setFont(iitdesc.getFont().deriveFont(13.05f));
	premeddesc.setBounds(490, 350, 400, 20);
	
	premeddesc1=new JLabel("(AIPMT) are an annual medical entrance examination in India.");
	premeddesc1.setFont(iitdesc.getFont().deriveFont(13.05f));
	premeddesc1.setBounds(460, 380, 400, 20);
	
	cetdesc=new JLabel("The MH-CET or Common Entrance Test is an annual entrance");
	cetdesc.setFont(cetdesc.getFont().deriveFont(13.05f));
	cetdesc.setBounds(890, 350, 400, 20);
	
	cetdesc1=new JLabel("exam conducted by the Government of Maharashtra.");
	cetdesc1.setFont(cetdesc1.getFont().deriveFont(13.05f));
	cetdesc1.setBounds(920, 380, 400, 20);
	
	packages=new JLabel("Packages Start From Rs. 2199");
	packages.setFont(packages.getFont().deriveFont(14.05f));
	packages.setBounds(110, 420, 300, 20);
	
	prepackages=new JLabel("Packages Start From Rs. 2199");
	prepackages.setFont(prepackages.getFont().deriveFont(14.05f));
	prepackages.setBounds(550, 420, 300, 20);
	
	cetpackages=new JLabel("Packages Start From Rs. 2199");
	cetpackages.setFont(cetpackages.getFont().deriveFont(14.05f));
	cetpackages.setBounds(975, 420, 300, 20);
	
	IITPackage=new JButton("Packages");
	IITPackage.setBounds(155, 460, 120, 40);
	//IITPackage.setBackground(Color.decode("#ff8080"));
	//IITPackage.setForeground(Color.white);
	
	PrePackage=new JButton("Packages");
	PrePackage.setBounds(600, 460, 120, 40);
	
	CetPackage=new JButton("Packages");
	CetPackage.setBounds(1015, 460, 120, 40);
	
	f.setContentPane(new JLabel(new ImageIcon("images\\bg3.jpg")));
	f.setLayout(null);
	f.add(icon);
	f.add(logout);
	f.add(courses);
	f.add(l);
	
	f.add(IIT);
	f.add(iitdesc);
	f.add(iitdesc1);
	f.add(packages);
	f.add(IITPackage);
	f.add(Premedical);
	f.add(premeddesc);
	f.add(premeddesc1);
	f.add(prepackages);
	f.add(PrePackage);
	f.add(mhtcet);
	f.add(cetdesc);
	f.add(cetdesc1);
	f.add(cetpackages);
	f.add(CetPackage);
	f.add(Gott);
	
	IITPackage.addActionListener(new PackageController(this));
	PrePackage.addActionListener(new PackageController(this));
	CetPackage.addActionListener(new PackageController(this));
	
	f.setExtendedState(JFrame.MAXIMIZED_BOTH);
	f.setSize(1365, 750);
	f.setVisible(true);
	}

}
