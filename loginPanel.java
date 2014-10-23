package cargos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.*;
public class loginPanel  extends JPanel{
     JLabel labo =new JLabel(""); 
	 JLabel header =new JLabel("company name");
	 JLabel dog =new JLabel("Enter password");
	JLabel cat =new JLabel("Enter username");
	JButton go =new JButton("submit".toUpperCase());
	 JButton exit=new JButton("exit now!!".toUpperCase());   
	 JButton recover=new JButton("forgot password".toUpperCase()); 
	JLabel msg1 =new JLabel(""); 
	JTextField bird =new JTextField(12);
	JPasswordField mouse =new JPasswordField(12);
	JLabel label2=new JLabel("USER  LOGIN PAGE");
	public loginPanel()
	
	{  
		recover.setToolTipText("password lost can be recovered by clicking here");
		   exit.setToolTipText("click to exit");
		   go.setToolTipText("click to log in, make sure you are authourized to access the application");
		   recover.setBackground(new Color(100,190,190));
	        exit.setBackground(new Color(100,190,190));
	        go.setBackground(new Color(100,190,190));
		     msg1.setForeground(new Color(0,255, 0));
		     msg1.setFont(new Font("Gabriola",1,16));
			label2.setFont(new Font("serif", 1, 18));
			label2.setForeground(new Color(55, 255, 0));
             header.setBounds(new Rectangle(0,0,700,100));
             header.setBackground(Color.black);
			label2.setBounds(new Rectangle(250,20,300,40));
		    labo.setBounds(new Rectangle(60,220,250,100));
			dog.setBounds(new Rectangle(100,300,150,40));//password
			cat.setBounds(new Rectangle(100,220,150,40));//username
			mouse.setBounds(new Rectangle(350,290,235,40));
			bird.setBounds(new Rectangle(350,220,235,40));
			go.setBounds(new Rectangle(433,340,150,40));
			exit.setBounds(new Rectangle(0,340,130,40));
			recover.setBounds(new Rectangle(200,340,170,40));
			msg1.setBounds(new Rectangle(0,380,699,110));
			msg1.setBorder(BorderFactory.createLineBorder(Color.RED));
			setVisible(true);
	}

}
