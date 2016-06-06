package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Chapterlist;
import view.Home;

public class ChapterlistController implements ActionListener {

	Chapterlist ch;
	public ChapterlistController(Chapterlist ch) {
		this.ch=ch;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ch.back)
		{
			ch.f.setVisible(false);
			new Home();
		}
		
	}
	
	

}
