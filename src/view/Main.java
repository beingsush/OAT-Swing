package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.MainController;

public class Main {
	
	public JButton ChapterwiseTest,CompleteTest,back;
	public JFrame f;
	public JLabel l;
	public Main() {
		
		f=new JFrame("Online Assessment Tools");
		f.setContentPane(new JLabel(new ImageIcon("images\\bg3.jpg")));
		
		back=new JButton(new ImageIcon("images\\back2.jpg"));
		back.setBounds(5, 5, 40, 40);
		
		l=new JLabel("Select Test Type");
		l.setBounds(90, 20, 200, 20);
		l.setFont(l.getFont().deriveFont(14.05f));
		
		ChapterwiseTest=new JButton("Chapterwise Test");
		ChapterwiseTest.setBounds(45, 60, 200, 50);
		
		CompleteTest=new JButton("Complete Test");
		CompleteTest.setBounds(45, 150, 200, 50);
		
		f.add(l);
		f.add(back);
		f.add(ChapterwiseTest);
		f.add(CompleteTest);
		
		back.addActionListener(new MainController(this));
		ChapterwiseTest.addActionListener(new MainController(this));
		
		f.setBounds(530, 200, 300, 300);
		f.setVisible(true);
		
	}

}
