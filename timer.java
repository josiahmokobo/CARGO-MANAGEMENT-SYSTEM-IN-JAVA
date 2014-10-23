package cargos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.sql.*;
public class timer extends JFrame {
	String z=null,p,y,t;
	ResultSet f;
public timer() {
f=null;
 add(new   MovingMessagePanel("message moving?"));
}

 class MovingMessagePanel extends JPanel{
 private String message = "Welcome to Java";
 private int xCoordinate = 0;
 private int yCoordinate = 20;


public MovingMessagePanel(String message) {
	
 this.message = message; 

 time.start();
}
Timer time= new Timer(5000,new ActionListener(){
login	jos= new login();
 java.sql.Connection me=jos.getConnection();
	public void actionPerformed(ActionEvent arg0) {
		  try
		  {
			Statement st =me.createStatement();  
			String h="select * from recover where status='0'";
			 f=st.executeQuery(h);
			while(f.next()==true)
			{
				 z= f.getString("username");
				 y= f.getString("email");
				 t= f.getString("status");
			     p= f.getString("id");	
			 	recover hola =new recover();
			 	CardLayouty m= new CardLayouty();
				if( m.panel8.isVisible())
				 {
				 hola.Tdate.setText(p);
				 }
			}
		
		  }
		  catch (SQLException t)
		  {
			  System.out.println(t);  
		  }	 
 }});

 }}