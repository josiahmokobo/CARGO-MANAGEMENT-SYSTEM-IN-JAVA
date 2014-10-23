package cargos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.*;
public class confirm  extends JPanel{
	JTextField Tsearch =new JTextField("search by Serial Number");
    JButton search =new JButton("search here");  
	JLabel Cname =new JLabel("Cargo's name");
    JTextField TCname =new JTextField(12);    
	JLabel Rname =new JLabel("Receiver's  name");
    JTextField TRname =new JTextField(12);
    JLabel picked =new JLabel("status".toUpperCase());
    JTextField Tpicked =new JTextField(12);
	JLabel name =new JLabel("Sender's name");
    JTextField Tname =new JTextField(12);
  	JLabel Sphone =new JLabel("Sender's phone no.");
  	JTextField TSphone =new JTextField(12);
  	JLabel Rphone =new JLabel("Receiver's phone no.");
  	JTextField TRphone =new JTextField(12);
	JLabel sentFrom =new JLabel("Cargo origin");
	JTextField  TsentFrom =new JTextField(12);
	JLabel sentTo =new JLabel("Cargo destination");
	JTextField TsentTo =new JTextField(12);
		JButton but =new JButton("delete".toUpperCase());
	JButton but1 =new JButton("confirm cargo".toUpperCase());
	 JLabel label=new JLabel("ADD USER PAGE");;
	 JLabel msg1=new JLabel("RETURN MESSAGE");;
	public confirm()
		{  
		
		JPanel j=new JPanel();
		j.setLayout(null);
		  JLabel label=new JLabel("CARGO MODIFICATION PAGE");
		  label.setFont(new Font("serif", 1, 18));
		  label.setForeground(new Color(255, 0, 0));
		   label.setBounds(new Rectangle(200,0,340,40));
		   //
		 search.setBounds(new Rectangle(399,40,150,30));
	     Tsearch.setBounds(new Rectangle(100,40,150,30)); 
		 name.setBounds(new Rectangle(0,80,150,30));
		 Tname.setBounds(new Rectangle(200,80,150,30));
		 Tname.setEditable(false);
		 Sphone.setBounds(new Rectangle(0,130,150,30));
		 TSphone.setBounds(new Rectangle(200,130,150,30));
		 TSphone.setEditable(false);
		 Rphone.setBounds(new Rectangle(0,180,180,30));
		 TRphone.setBounds(new Rectangle(200,180,150,30));
		 TRphone.setEditable(false);
		 Rname.setBounds(new Rectangle(0,230,150,30));
		 TRname.setBounds(new Rectangle(200,230,150,30));
		 TRname.setEditable(false);
		
		 sentFrom.setBounds(new Rectangle(400,80,150,30));
		 TsentFrom.setBounds(new Rectangle(540,80,150,30));
		 TsentFrom.setEditable(false);
		 sentTo.setBounds(new Rectangle(400,130,150,30));
		 TsentTo.setBounds(new Rectangle(540,130,150,30));
		 TsentTo.setEditable(false);
		 Cname.setBounds(new Rectangle(400,180,150,30));
		 TCname.setBounds(new Rectangle(540,180,150,30));
		 TCname.setEditable(false);
		 picked.setBounds(new Rectangle(400,220,150,30));
		 Tpicked.setBounds(new Rectangle(540,220,150,30));
		 Tpicked.setEditable(false);
		but.setBounds(new Rectangle(580,250,100,25));
		but.setBackground(Color.red);
		but1.setBounds(new Rectangle(450,250,200,30));
		but1.setBackground(Color.green);
		 
		msg1.setBounds(new Rectangle(0,300,699,170));
		msg1.setForeground(Color.green);
		msg1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		msg1.setFont(new Font("Gabriola",1,17));
	}
 
}
