package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Home;
import view.Main;

public class PackageController implements ActionListener{
	Home home;
	public PackageController(Home home) {
		this.home=home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==home.IITPackage)
		{
			home.f.setVisible(false);
			new Main();
			
		}
		if(e.getSource()==home.PrePackage)
		{
			home.f.setVisible(false);
			new Main();
		}
		if(e.getSource()==home.CetPackage)
		{
			home.f.setVisible(false);
			new Main();
		}
		
	}

}
