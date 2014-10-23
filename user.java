package cargos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.*;
public class user  extends JFrame{
	JComboBox box= new JComboBox();
	JLabel name =new JLabel("ENTER FULL NAMES");
    JTextField Tname =new JTextField(12);
  	JLabel place =new JLabel("ENTER RESIDENCE");
  	JTextField Tplace =new JTextField(12);
  	JLabel phone =new JLabel("ENTER PHONE NUMBER");
  	JTextField Tphone =new JTextField(12);
	JLabel email =new JLabel("ENTER EMAIL ADDRESS");
	JTextField Temail =new JTextField(12);
	JLabel password =new JLabel("Enter password".toUpperCase());
	JPasswordField Tpassword=new JPasswordField(12);
	JLabel username =new JLabel("ENTER username".toUpperCase());
	JTextField Tusername =new JTextField(12);
	JLabel type =new JLabel("ENTER admin/user".toUpperCase());
	JComboBox Ttype =new JComboBox();
	JLabel msg1 =new JLabel("return message:".toUpperCase());
	JButton but =new JButton("submit".toUpperCase());
	 JLabel label=new JLabel("ADD USER PAGE");;
	
	public user()
		{  
		
		JPanel j=new JPanel();
		j.setLayout(null);
		box.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"+254","+253","+252","+251","+250",
				"+249","+248","+247","+246","+245","+244","+243","+243","+242","+241","+240",				
				"+239","+238","+237","+236","+235","+234","+233","+232","+231","+230",
				"+229","+228","+227","+226","+225","+224","+223","+222","+221","+220",
				"+219","+218","+217","+216","+215","+214","+213","+212","+211","+210",
				"+81","+70","+44","+89","+33","+90","+32","+90","+56","+78"}));

		Ttype.setBackground(Color.YELLOW);
		  label.setForeground(new Color(255, 0, 0));
		   label.setBounds(new Rectangle(200,0,340,40));
		  name.setBounds(new Rectangle(0,90,150,30));
		 Tname.setBounds(new Rectangle(200,90,150,30));
		 place.setBounds(new Rectangle(0,130,150,30));
		 Tplace.setBounds(new Rectangle(200,130,150,30));
		 type.setBounds(new Rectangle(400,130,180,30));
		 Ttype.setBounds(new Rectangle(530,130,150,30));
		 phone.setBounds(new Rectangle(0,170,150,30));
		 Tphone.setBounds(new Rectangle(260,170,90,30));
		 box.setBounds(new Rectangle(200,170,60,30));
		 email.setBounds(new Rectangle(0,210,160,30));
		 Temail.setBounds(new Rectangle(200,210,150,30));
		 password.setBounds(new Rectangle(400,90,150,30));
		Tpassword.setBounds(new Rectangle(530,90,150,30));
		username.setBounds(new Rectangle(400,170,150,30));
		Tusername.setBounds(new Rectangle(530,170,150,30));
		but.setBounds(new Rectangle(580,250,100,25));
		but.setBackground(Color.red);
		msg1.setBounds(new Rectangle(0,300,699,170));
		msg1.setForeground(Color.GREEN);
		msg1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	msg1.setFont(new Font("Gabriola",1,17));
	}}