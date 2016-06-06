package view;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.RegisterController;


@SuppressWarnings("serial")
public class RegistrationFormGUI extends JFrame{   

      Connection con;
      Statement stmt;

       PreparedStatement preStatement,updatePreStmt;
      public JLabel title, firstname, LastName, email, password, contactLabel;
      public JTextField Firstnamefield, lastnameField, passwordField, contactField,emailField;
      public JButton registerButton, exitButton,updateButton,deleteButton,resetButton,
              refresh;
      public JRadioButton male, female;
     public  ButtonGroup bg;
     public  JPanel panel;
      public JTable table;

      DefaultTableModel model;

      JScrollPane scrollpane;
      public RegistrationFormGUI() {
           // TODO Auto-generated constructor stub
           super("REGISTRATION FORM");
            setSize(280, 400);
            setLayout(null);
            // Calling connect method, this will connect us to database
          //  connect();
            // Defining Labels 
            setContentPane(new JLabel(new ImageIcon("images\\bg3.jpg")));
            title = new JLabel("Registration Form");
            title.setBounds(90, 7, 200, 30);
            firstname = new JLabel("First Name");
            firstname.setBounds(20, 50, 80, 30);
            LastName = new JLabel("Last Name"); 
            LastName.setBounds(20, 85, 80, 30);
            email = new JLabel("Email-Id"); 
            email.setBounds(20, 120, 80, 30);
            password = new JLabel("Password"); 
            password.setBounds(20, 155, 80, 30); 
            contactLabel = new JLabel("Phone"); 
            contactLabel.setBounds(20, 190, 80, 30);

            // Defining ID field
            Firstnamefield = new JTextField(); 
            Firstnamefield.setBounds(95, 50, 130, 30);
            

            // Defining Name field
            lastnameField = new JTextField(); 
            lastnameField.setBounds(95, 85, 130, 30); 
            emailField=new JTextField();
            emailField.setBounds(95, 120, 130, 30);

            // Defining Gender Buttons
           // male = new JRadioButton("Male");
          //  male.setBounds(95, 120, 60, 30);

           // female = new JRadioButton("Female");
          //  female.setBounds(155, 120, 70, 30);            

           // bg = new ButtonGroup(); 
           // bg.add(male); 
           // bg.add(female); 
            passwordField = new JTextField(); 
            passwordField.setBounds(95, 155, 130, 30);
            contactField = new JTextField(); 
            contactField.setBounds(95, 190, 130, 30);
 
            // fixing all Label,TextField,RadioButton
            add(title);
            add(firstname);
            add(LastName);
            add(email);
            add(password);
            add(contactLabel);
            add(Firstnamefield);
            add(lastnameField);
            add(emailField);
            //add(male);
           // add(female);
            add(passwordField);
            add(contactField);

            // Defining Exit Button
            exitButton = new JButton("Exit"); 
            exitButton.setBounds(35, 250, 80, 25);            

            // Defining Register Button
            registerButton = new JButton("Register");
            registerButton.setBounds(120, 250, 100, 25);

           /* // Defining Update Button
            updateButton = new JButton("Update");
            updateButton.setBounds(120, 285, 100, 25);
            updateButton.setEnabled(false);

            // Defining Delete Button
            deleteButton = new JButton("Delete");
            deleteButton.setBounds(35, 285, 80, 25);
            deleteButton.setEnabled(false); */

            // Defining Reset Button
            resetButton = new JButton("Reset");
            resetButton.setBounds(70, 285, 100, 25);
            resetButton.setEnabled(false); 

            // fixing all Buttons
            add(exitButton);
            add(registerButton);
           // add(updateButton);
            //add(deleteButton);
            add(resetButton);    

            /* // Defining Panel
            panel = new JPanel();
            panel.setLayout(new GridLayout());
            panel.setBounds(250, 20, 480, 330);
            panel.setBorder(BorderFactory.createDashedBorder(Color.blue));
            add(panel);

           // Defining Refresh Button
            refresh = new JButton("Refresh Table");
            refresh.setBounds(350, 350, 270, 15);
            add(refresh);

            //Defining Model for table
            model = new DefaultTableModel();

            //Adding object of DefaultTableModel into JTable
            table = new JTable(model);

            //Fixing Columns move
            table.getTableHeader().setReorderingAllowed(false);

            // Defining Column Names on model
            model.addColumn("S.No");
            model.addColumn("ID");
            model.addColumn("Name");
            model.addColumn("Gender");
            model.addColumn("Address");
            model.addColumn("Contact");
 
            // Enable Scrolling on table
           scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                           JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            panel.add(scrollpane);*/

            //Displaying Frame in Center of the Screen
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2,
                             dim.height/2-this.getSize().height/2);
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            registerButton.addActionListener(new RegisterController(this));
            exitButton.addActionListener(new RegisterController(this));
            setResizable(false);
            setVisible(true);
            
            
      }

      // Connection with Database
      
      
      
}