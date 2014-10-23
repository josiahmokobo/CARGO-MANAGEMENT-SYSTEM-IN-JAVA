package cargos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.*;
public class Password  extends JPanel{
	JLabel name =new JLabel(" FULL NAMES");
    JTextField Tname =new JTextField(12);
  	JLabel place =new JLabel(" RESIDENCE");
  	JTextField Tplace =new JTextField(12);
  	JLabel phone =new JLabel(" PHONE NUMBER");
  	JTextField Tphone =new JTextField(12);
	JLabel email =new JLabel(" EMAIL ADDRESS");
	JTextField Temail =new JTextField(12);
	JLabel nationality =new JLabel("USERNAME");
	JTextField Tnationality =new JTextField(12);
	JLabel country =new JLabel(" EMPLOYEE NUMBER");
	JTextField Tcountry =new JTextField(12);
	JLabel date =new JLabel("USER MODE");
	JLabel msg1 =new JLabel("return message:".toUpperCase());
		JComboBox Tdate =new JComboBox();
	JLabel school =new JLabel("PASSWORD");
	JPasswordField Tschool =new JPasswordField(12);
	JButton but1 =new JButton("reset".toUpperCase());
     final	JTextField search =new JTextField("search user by email");
     	JButton but2 =new JButton("search here".toUpperCase());

	 JLabel label71=new JLabel("       reset of a users password ".toUpperCase());
	public Password()
		{  
		
		JPanel j=new JPanel();
		j.setLayout(null);
				   
		Tdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"", "admin","user" }));

		label71.setFont(new Font("Gabriola", 1, 23));
		 label71.setForeground(new Color(255,0, 0));
	
		   search.setEditable(true); Tname.setEditable(false);  Tplace.setEditable(false);
		  Tphone.setEditable(false); Temail.setEditable(false); Tnationality.setEditable(false);
		 Tschool.setEditable(false); Tdate.setEnabled(false);	Tcountry.setEditable(false);
		  
		   label71.setBounds(new Rectangle(200,0,340,40));
		   but2.setBounds(new Rectangle(300,40,150,30));
		   but2.setBackground(Color.MAGENTA);
		   search.setBounds(new Rectangle(100,40,150,30));
		  name.setBounds(new Rectangle(0,90,150,30));
		 Tname.setBounds(new Rectangle(200,90,150,30));
		 place.setBounds(new Rectangle(0,130,150,30));
		 Tplace.setBounds(new Rectangle(200,130,150,30));
		 phone.setBounds(new Rectangle(0,170,150,30));
		 Tphone.setBounds(new Rectangle(200,170,150,30));
		 email.setBounds(new Rectangle(0,210,150,30));
		 Temail.setBounds(new Rectangle(200,210,150,30));
		 nationality.setBounds(new Rectangle(400,90,150,30));
		Tnationality.setBounds(new Rectangle(530,90,150,30));
		 school.setBounds(new Rectangle(400,130,150,30));
		Tschool.setBounds(new Rectangle(530,130,150,30));
		date.setBounds(new Rectangle(400,170,150,30));
		Tdate.setBounds(new Rectangle(530,170,150,30));
		country.setBounds(new Rectangle(400,210,150,30));
		Tcountry.setBounds(new Rectangle(530,210,150,30));
		but1.setBounds(new Rectangle(580,250,100,25));
		but1.setBackground(Color.blue);
		msg1.setBounds(new Rectangle(0,300,699,170));
		 msg1.setFont(new Font("Gabriola",1,17));
		 msg1.setForeground(Color.GREEN);
		msg1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		
	}
 
}
