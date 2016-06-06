package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {

	JTable t;
	String [] column={"id","name"};
	String[][] data={{"1","sushant"},{"2","lalit"}};
	JScrollPane p;
	JFrame f;
	
	public Table() {
	f=new JFrame();
	t=new JTable(data,column);
	t.setBounds(50, 50, 200, 230);
	p=new JScrollPane(t);
	f.add(p);
	
	f.setSize(300, 300);
	f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Table();
	}

}
