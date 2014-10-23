package cargos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
public class Users extends JFrame
{     
	 final JavaLesson36 frame=new JavaLesson36();
	  final DefaultTableModel dTableModel =frame.dTableModel;
	final JTable table=new JTable(dTableModel);
	   ResultSet rows=frame.rows;
	 
Connection conn=null;
	public Users()
	{
	
	   
	   try{
	   	Class.forName("com.mysql.jdbc.Driver");//loading the driver
	   	conn=DriverManager.getConnection("jdbc:mysql://localhost/cargo2","root","");
	   	 Statement sqlState=conn.createStatement();   
	  String 	selectStuff="select * from cargo_description where picked='picked' order by Time_Received desc limit 10";    
	   	rows=sqlState.executeQuery(selectStuff);	
	   Object[] tempRow;
	   Object[] tempRow1;
	    
	 	tempRow1=new Object[] {"SERIAL NUMBER","NAME OF CARGO","SENDER NAME","RECEIVER  NAME", "PICKED @"};
	   	dTableModel.addRow(tempRow1);
	   while(rows.next())
	   {
	   	tempRow=new Object[] {rows.getInt(1),rows.getString(2),rows.getString(3),rows.getString(5), rows.getString(10)};
	   	dTableModel.addRow(tempRow);
	    }
	    }
		
	   catch(SQLException ex)
	   {
	   	System.out.println(ex.getMessage());
	   }
	   catch(ClassNotFoundException ex1)
	   {
	   	System.out.println(ex1.getMessage());
	   }
	
	  
	   table.setRowHeight(table.getRowHeight()+15);
	   table.setLayout(new BorderLayout());
	   table.setBackground(Color.CYAN);
	   table.setEnabled(false);	   
	   table.setAutoCreateColumnsFromModel(true);
	   table.setFont(new Font("serif",Font.PLAIN, 14));	   
	   table.setAutoCreateRowSorter(true);
	   JTableHeader header = table.getTableHeader();
	   header.setBackground(Color.yellow);
	   
	   table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	   TableColumn col1= table.getColumnModel().getColumn(0);
	   col1.setResizable(true);
	   JScrollPane scrollPanel= new JScrollPane(table);
	   frame.add(scrollPanel);
	   frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
	   frame.setLocationRelativeTo(null);
	   frame.pack();	   
}}