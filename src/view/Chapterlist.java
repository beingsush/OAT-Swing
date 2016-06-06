package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.ChapterlistController;

public class Chapterlist {

	public JFrame f;
	public JButton back;
	public JLabel chapterlist,Gott;
	public JTable table;
	public JScrollPane scrollPane;
	
	JTable t;
	String [] column={"id","name"};
	String[][] data={{"1","sushant"},{"2","lalit"}};
	JScrollPane p;
	
	public Chapterlist() {
		f=new JFrame("Online Assessment Tools");
		
		back=new JButton(new ImageIcon("images\\back2.jpg"));
		back.setBounds(10, 10, 40, 40);
		
		chapterlist=new JLabel("Chapter List");
		chapterlist.setFont(chapterlist.getFont().deriveFont(20.05f));
		chapterlist.setBounds(600, 20, 200, 30);

		Gott=new JLabel("Copyright 2016. Design & Developed By Gott Software Solutions Pvt. Ltd.");
		Gott.setFont(Gott.getFont().deriveFont(12.05f));
		Gott.setBounds(900, 650, 600, 30);
		
		t=new JTable(data,column);
		t.setBounds(50, 50, 200, 230);
		p=new JScrollPane(t);
		
		f.setContentPane(new JLabel(new ImageIcon("images\\bg3.jpg")));
		f.setLayout(null);
		f.add(chapterlist);
		f.add(Gott);
		f.add(back);
		
		back.addActionListener(new ChapterlistController(this));
		
		
		f.add(p);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
	}

}
