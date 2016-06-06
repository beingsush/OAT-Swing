package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Chapterlist;
import view.Home;
import view.Main;

public class MainController implements ActionListener {
	
	Main main;
	
	public MainController(Main main)
	{
		this.main=main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==main.back)
		{
			new Home();
			main.f.setVisible(false);
		}
		if(e.getSource()==main.ChapterwiseTest)
		{
			new Chapterlist();
			main.f.setVisible(false);
		}
		
	}

}
