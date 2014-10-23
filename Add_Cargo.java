package cargos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.*;
public class Add_Cargo  extends JPanel{
	JComboBox box= new JComboBox();
	JComboBox box1= new JComboBox();
	JLabel Cname =new JLabel("Enter cargo's name");
    JTextField TCname =new JTextField(12);
	JLabel Rname =new JLabel("Enter receiver's  name");
    JTextField TRname =new JTextField(12);
	JLabel name =new JLabel("Enter sender's name");
    JTextField Tname =new JTextField(12);
  	JLabel Sphone =new JLabel("Enter sender's phone no.");
  	JTextField TSphone =new JTextField(12);
  	JLabel Rphone =new JLabel("Enter receiver's phone no.");
  	JTextField TRphone =new JTextField(12);
	JLabel sentFrom =new JLabel("Enter cargo origin");
	JTextField  TsentFrom =new JTextField(12);
	JLabel sentTo =new JLabel("Enter cargo destination");
	JTextField TsentTo =new JTextField(12);
		JButton but =new JButton("delete".toUpperCase());
	JButton but1 =new JButton("add cargo".toUpperCase());
	 JLabel label=new JLabel("ADD USER PAGE");;
	 JLabel msg1=new JLabel("RETURN MESSAGE");;
	public Add_Cargo()
		{  
		
		JPanel j=new JPanel();
		j.setLayout(null);
		box.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"+254","+253","+252","+251","+250",
				"+249","+248","+247","+246","+245","+244","+243","+243","+242","+241","+240",				
				"+239","+238","+237","+236","+235","+234","+233","+232","+231","+230",
				"+229","+228","+227","+226","+225","+224","+223","+222","+221","+220",
				"+219","+218","+217","+216","+215","+214","+213","+212","+211","+210",
				"+81","+70","+44","+89","+33","+90","+32","+90","+56","+78"}));
		box1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"+254","+253","+252","+251","+250",
				"+249","+248","+247","+246","+245","+244","+243","+243","+242","+241","+240",				
				"+239","+238","+237","+236","+235","+234","+233","+232","+231","+230",
				"+229","+228","+227","+226","+225","+224","+223","+222","+221","+220",
				"+219","+218","+217","+216","+215","+214","+213","+212","+211","+210",
				"+81","+70","+44","+89","+33","+90","+32","+90","+56","+78"}));
		  JLabel label=new JLabel("CARGO MODIFICATION PAGE");
		  label.setFont(new Font("serif", 1, 18));
		  label.setForeground(new Color(255, 0, 0));
		   label.setBounds(new Rectangle(200,0,340,40));
		   //
		 name.setBounds(new Rectangle(0,80,150,30));
		 Tname.setBounds(new Rectangle(200,80,150,30));
		 Sphone.setBounds(new Rectangle(0,130,150,30));
		 TSphone.setBounds(new Rectangle(260,130,90,30));
		 box1.setBounds(new Rectangle(200,130,60,30));
		 Rphone.setBounds(new Rectangle(0,180,180,30));
		 TRphone.setBounds(new Rectangle(260,180,90,30));
		 box.setBounds(new Rectangle(200,180,60,30));
		 Rname.setBounds(new Rectangle(0,230,150,30));
		 TRname.setBounds(new Rectangle(200,230,150,30));
		 //
		 sentFrom.setBounds(new Rectangle(400,80,150,30));
		 TsentFrom.setBounds(new Rectangle(540,80,150,30));
		 sentTo.setBounds(new Rectangle(400,130,150,30));
		 TsentTo.setBounds(new Rectangle(540,130,150,30));
		 Cname.setBounds(new Rectangle(400,180,150,30));
		 TCname.setBounds(new Rectangle(540,180,150,30));
		but.setBounds(new Rectangle(580,250,100,25));
		but.setBackground(Color.red);
		but1.setBounds(new Rectangle(450,250,200,50));
		but1.setBackground(Color.green);
		msg1.setBounds(new Rectangle(0,300,699,100));
		
		msg1.setForeground(Color.GREEN);
		msg1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	   msg1.setFont(new Font("Gabriola",1,17));
	}
 
}
