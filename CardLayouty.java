package cargos;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;
import java.sql.*;
import java.net.URL;
import javax.sound.sampled.*;
@SuppressWarnings("serial")
public class CardLayouty extends JFrame implements ActionListener {
	//declaration of variables
	JPanel cardPanel,  panel1,panel2, panel3, panel4,panel5,panel6,panel7,panel8,sPanel;
   JButton but1, but2,but3, first,next,previous, logout,back;
   CardLayout cards;
  String username=null;
  String privilege=null;
  private JLabel jos=null;
   JLabel jLabel1 =  new JLabel();
     JLabel jlabu =  new JLabel();
 public String selectStuff,selectStuff1;
    @SuppressWarnings({ "deprecation", "unchecked" })
    // ===========--------------================
    //default constructor
    // ===========--------------================
public CardLayouty()
   {	   final JButton k=new JButton("refresh");  
           final JButton n=new JButton("start live transactions");  
    	Container c=getContentPane();   cardPanel =new JPanel();	   panel1 =new JPanel();	   panel2=new JPanel();
	   panel3=new JPanel();	panel7=new JPanel();   panel4=new JPanel(); panel5=new JPanel(); panel6=new JPanel();	   sPanel=new JPanel();  
	   panel8=new JPanel();
	   but1=new JButton("LOGIN PAGE");   back=new JButton("back to login");
	   but2=new JButton("button 2");	   but3=new JButton("button 3"); 	   first=new JButton("LOGIN PAGE");
	   next =new JButton("next ");	      previous=new JButton("back");
	   logout= new JButton("logout");
	   but2.addActionListener(this); 	   but3.addActionListener(this);	   first.addActionListener(this);
	   next.addActionListener(this);	  	   previous.addActionListener(this);
	   back.addActionListener(this);
	   logout.addActionListener(this);
	    logout.setBackground(Color.cyan);
	   next.setBackground(Color.GREEN);
	   previous.setBackground(Color.MAGENTA);
	   next.setForeground(Color.red);
	   back.setBackground(Color.ORANGE);
	   logout.setVisible(false);
	   final  loginPanel j=new loginPanel();
	   if(panel1.isVisible())
	   j.msg1.setText("you have to login in");
	  // ===========--------------================
	   //all users view panel(jtable)
	   // ===========--------------================
	   //login
	   panel1.setLayout(null);
	   			 System.out.println("loading gui........................................");
	    //	panel1.add(j.label2);
	       panel1.add(j.mouse);   panel1.add(j.go);
		    panel1.add(j.bird); panel1.add(j.msg1);	 panel1.add(j.header);    next.setVisible(false);	   
		    panel1.add(j.exit);  previous.setVisible(false); panel1.add(j.labo);
		   panel1.add(j.recover); back.setVisible(false); first.setVisible(false);
		   j.header.setBackground(Color.red);
		   jLabel1.setBackground(new Color(153, 204, 0));
		   j.header.setIcon(new ImageIcon(getClass().getResource("/me.png"))); 
           jLabel1.setIcon(new ImageIcon(getClass().getResource("/josiah.jpg"))); 
           j.labo.setIcon(new ImageIcon(getClass().getResource("/login.png"))); 
           jLabel1.setText("");
           panel1.add(jLabel1);
           	jLabel1.setBounds(new Rectangle(100,100,500,100));
           	jlabu.setBounds(new Rectangle(300,0,700,100));
           	 panel1.add(jlabu);
		    j.exit.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent h)
		    	{
		    	try{
    		URL url=CardLayouty.class.getResource("/Windows Unlock.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception hi)
    	{
    		hi.printStackTrace();
    	}
    	
		    		System.exit(0);
		    	}
		    });
		    j.go.addActionListener(new  ActionListener(){
		    	@Override
				public void actionPerformed(ActionEvent arg0) {
		    		//validation
		    		  j.msg1.setText("you have to log in for you to access the application");
		    	    if(j.mouse.getText().length()==0 || j.bird.getText().length()==0)
		    	    {
		    	    	
		    	    
		    	    	try{
    		URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}
    		 JOptionPane.showMessageDialog(null, "empty fields");
     
		    	    }
		    	    else{
					  String s=null,t=null;
						login l =new login();
					 j.msg1.setText("");		
					Connection	jo=l.getConnection();
					try{
					Statement st = jo.createStatement();
					ResultSet res1 = st.executeQuery(" select type from  user where username='"+j.bird.getText()+"' and password='"+j.mouse.getText()+"'");
					while(res1.next()==true)
					{
						privilege=res1.getString("type");
					}
					ResultSet res = st.executeQuery("select * from  user");
					while(res.next())
					{
						   s= res.getString("username");
						   t= res.getString("password");			   
						  
						   if((s.equals(j.bird.getText())==true) && (t.equals(j.mouse.getText())==true))
						   {		
						   	
		    	    	try{
    		URL url=CardLayouty.class.getResource("/Windows Logon.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}		
							   username=res.getString("username");
							   j.bird.setText("");
							    j.mouse.setText("");					
							    j.msg1.setText("");
							    JOptionPane.showMessageDialog(null, "welcome "+username);
							    cards.next(cardPanel);	
							    previous.setEnabled(false);							
							     next.setVisible(true);
							     next.setEnabled(true);
							     next.setText("add cargo");				
							     previous.setVisible(true);
							     if(privilege.equals("admin"))
									{
										next.setEnabled(true);
										logout.setVisible(false);
										next.setText("add cargo");
										previous.setEnabled(false);
									}
									if(privilege.equals("user"))
									{
									next.setText("add cargo");
									logout.setVisible(false);
									previous.setEnabled(false);
									}									
							     }	
						   else  if((s.equals(j.bird.getText())==false) && (t.equals(j.mouse.getText())==false))
						    j.msg1.setText("correct crediatials required");  
						    else
						   j.msg1.setText("you have to log in for you to access the application");
						   }}					   
					
					catch(SQLException r)
					{
						System.out.println(r);
					}	
					}	    	   
				}
		    	});
		    j.recover.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0)
				{
			try{
    		URL url=CardLayouty.class.getResource("/Windows Proximity Connection.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	
					cards.last(cardPanel);
				}});
	   //end login
	 
	   panel5.setLayout(null);
	   //JButton k=new JButton("add cargo");
	   final Add_Cargo modify1=new Add_Cargo();
	    panel5.add(modify1.Tname); panel5.add(modify1.name); panel5.add(modify1.Sphone); panel5.add(modify1.TSphone);
	   panel5.add(modify1.Rphone); panel5.add(modify1.TRphone);panel5.add(modify1.sentFrom); panel5.add(modify1.TsentFrom); panel5.add(modify1.sentTo); panel5.add(modify1.TsentTo);
	   panel5.add(modify1.name); panel5.add(modify1.msg1); panel5.add(modify1.TCname); panel5.add(modify1.Cname);
	   panel5.add(modify1.Tname);  panel5.add(modify1.but1);  panel5.add(modify1.Rname); panel5.add(modify1.TRname);	panel5.add(modify1.sentTo);     	panel5.add(modify1.TsentTo);
	   panel5.add(modify1.box); panel5.add(modify1.box1);
	   
	    JLabel label5=new JLabel("");
	   	label5.setIcon(new ImageIcon(getClass().getResource("/add_cargo.png"))); 
		label5.setBounds(new Rectangle(200,0,300,91));
		panel5.add(label5); 
		  JLabel labob =new JLabel(""); 
	   labob.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	   	panel5.add(labob);
	   	labob.setBounds(new Rectangle(0,370,700,100));
		  modify1.but1.addActionListener(new  ActionListener(){

				@Override//
		public void actionPerformed(ActionEvent arg0) {
					//validating for empty fileds
					if(modify1.TSphone.getText().length()<9 || modify1.TRphone.getText().length()<9)
					{
						 modify1.msg1.setText("invalid phone number");
						 try{
    		URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    	
					}
					else{
			 if( modify1.Tname.getText().length()==0 || modify1.TSphone.getText().length()==0 ||modify1.TRphone.getText().length()==0
				||	 modify1.TsentFrom.getText().length()==0  || modify1.TsentTo.getText().length()==0 || modify1.TCname.getText().length()==0 )   
			 {			  
			    modify1.msg1.setText("all fields are required");
			    try{
    		URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    	
			     }
			 else{
		String s1=null,t1=null;
		login l1 =new login();
		Connection	jo1=l1.getConnection();
		try{
		Statement st1 = jo1.createStatement();
		 int x=1+(int) (Math.random()*1000);
		 int y=10+(int) (Math.random()*100000);
		 Object code=modify1.box1.getSelectedItem();
			String j= ((String) code).concat(modify1.TSphone.getText());
			 Object code1=modify1.box.getSelectedItem();
				String j1= ((String) code1).concat(modify1.TRphone.getText());
				System.out.println(j1);
	int val = st1.executeUpdate("INSERT into  cargo_description   VALUES('"+x+"','"+modify1.TCname.getText()+"','"+modify1.Tname.getText()+"','"+j+"','"+modify1.TRname.getText()+"','"+j1+"','"+modify1.TsentFrom.getText()+"','"+modify1.TsentTo.getText()+"',now(),'0000-00-00 00:00:00','')");
 if(val==1)
    {
    	int val1 = st1.executeUpdate("INSERT into  ozekimessageout   VALUES('"+y+"','"+j+"','"+j1+"','haloo "+modify1.TRname.getText()+ " , "+modify1.Tname.getText()+" has sent you  "+modify1.TCname.getText()+" from "+modify1.TsentFrom.getText()+" to "+modify1.TsentTo.getText()+" and you will be cordially informed upon arrival',now(),'','','send','','')");
	
    }	
	String sellect="select * from cargo_description where Time_Sent=now()";
	 ResultSet res = st1.executeQuery(sellect);
	 String m=null;
	 while(res.next()==true)
	 {
		 m= res.getString("Serial_Number");
		
	 }
		
         try{
    	URL url=CardLayouty.class.getResource("/Windows Proximity Connection.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    	  
	modify1.msg1.setText(modify1.TCname.getText()+" successfully added with serial number  "+m);
	 
	modify1.TSphone.setText("");
	modify1.TRphone.setText("");
	modify1.TsentFrom.setText("");
	modify1.Tname.setText("");
	modify1.TsentTo.setText("");	
	modify1.TRname.setText("");
	modify1.TCname.setText("");	
			}
		catch(SQLException r)
		{
			modify1.msg1.setText("data entry error!!"+r);
			
		}
	
			 } }}});
	  // panel5.add(k);'
		  panel7.setLayout(null);
	   final confirm conf=new confirm();
	   panel7.add(conf.Tname); panel7.add(conf.name);panel7.add(conf.Sphone); panel7.add(conf.TSphone);
	   panel7.add(conf.Rphone); panel7.add(conf.TRphone);panel7.add(conf.sentFrom); panel7.add(conf.TsentFrom); panel7.add(conf.sentTo); panel7.add(conf.TsentTo);
	   panel7.add(conf.name); panel7.add(conf.msg1); panel7.add(conf.TCname); panel7.add(conf.Cname);panel7.add(conf.sentTo); panel7.add(conf.TsentTo);
	   panel7.add(conf.Tname);  panel7.add(conf.but1);  panel7.add(conf.Rname); panel7.add(conf.TRname);	 panel7.add(conf.search); panel7.add(conf.Tsearch);
	   panel7.add(conf.picked);  panel7.add(conf.Tpicked); 
      
	 JLabel  label51=new JLabel("");
		   label51.setIcon(new ImageIcon(getClass().getResource("/confirm_cargo.png"))); 
		  conf.search.setBackground(new Color(0,100, 0));
		  label51.setBounds(new Rectangle(200,0,400,40));
		  panel7.add(label51); 
		  	JLabel laboz =new JLabel(""); 
	   laboz.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	   	panel7.add(laboz);
	   	laboz.setBounds(new Rectangle(0,370,700,100));
		   conf.but1.setEnabled(false);
		   conf.search.addActionListener(new  ActionListener(){	  
			  public void actionPerformed(ActionEvent arg0)
			  {	 
			  	  String s1=null,t1=null;
				   login jaa= new login();
				   Connection j=jaa.getConnection();
		   try{
			   if(conf.Tsearch.getText().length()==0)
				  {
				  	
         try{
    	URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    
					  conf.msg1.setText("please enter a search query ");
				  }
			   else{
		   Statement st4= j.createStatement();
		      String m=conf.Tsearch.getText().trim();   
		   String f1="select * from cargo_description where Serial_Number='"+m+"'";	   
		   ResultSet res1=st4.executeQuery(f1);		        
		   if(res1.next()==false)
		   {  
		   	
         try{
    	URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  
    		
        	    	    
		   	  conf.but1.setEnabled(false);		   
			     conf.msg1.setText("no results found ");
			      conf.TCname.setText("");
				  conf.Tname.setText("");
				  conf.TSphone.setText("");
				  conf.TRphone.setText("");
			      conf.TsentFrom.setText("") ; 
			       conf.TsentTo.setText("");
				   conf.TRname.setText("");
				   conf.Tpicked.setText("");
		   }
		   else{
		   	
         try{
    	URL url=CardLayouty.class.getResource("/Windows Logon.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    
		       conf.but1.setEnabled(true);
			   t1=res1.getString("name").trim();
			  String t2=res1.getString("Sender_Name").trim();
			  String   t3=res1.getString("Sender_Phone").trim();
			  String    t4=res1.getString("Reciever_Phone").trim();
			  String   t5=res1.getString("Sent_From").trim();
			  String  t6=res1.getString("Sent_To").trim();
			  String t7=res1.getString("Reciever_Name").trim();
			  String t8=res1.getString("picked").trim();
			   conf.TCname.setText(t1);
			   conf.Tname.setText(t2);
			   conf.TSphone.setText(t3);
			   conf.TRphone.setText(t4);
		       conf.TsentFrom.setText(t5) ; 
		       conf.TsentTo.setText(t6);
			   conf.TRname.setText(t7);
			   if(!t8.equals("picked"))
			   {
				 conf.Tpicked.setText("not picked".toUpperCase());  
			   }
			   else if(t8.equals("picked"))
			   {
				   conf.Tpicked.setText(" picked".toUpperCase());  
			   }
		   }}
		   }catch(SQLException l)
		   {
			   System.out.println(l);
		   }
		  }});  
		   
		   conf.but1.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent r)
			   {
				   if(conf.Tsearch.getText().length()!=0)
				   {
				   String s1=null,t1=null;
				   login jaa= new login();
				   Connection j=jaa.getConnection();
				  	
				   try{
				   Statement ju=j.createStatement();
				   String f2="select picked, Reciever_Name, Time_Received from cargo_description where picked='picked' and Serial_Number='"+conf.Tsearch.getText()+"'";	   				  
				   ResultSet Se=ju.executeQuery(f2);			  
				   if(Se.next()==true)
				   { 
				   	
         try{
    	URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    
					 
					   conf.msg1.setText("the cargo has already been picked by "+Se.getString("Reciever_Name")+" at "+ Se.getString("Time_Received")+" ");
			
					   conf.TCname.setText("");
						  conf.Tname.setText("");
						  conf.TSphone.setText("");
						  conf.TRphone.setText("");
					       conf.TsentFrom.setText("") ; 
					       conf.TsentTo.setText("");
						   conf.TRname.setText("");
						   conf.Tpicked.setText("");
				            conf.but1.setEnabled(false);		
				            			  
					   }
				   else{
				   	Statement ju1=j.createStatement();
				   String f1="update  cargo_description set Time_Received=now(),  picked='picked' where Serial_Number='"+conf.Tsearch.getText()+"'";	   
				   int res1=ju1.executeUpdate(f1);
				    Date date= new Date();
				   	conf.msg1.setText(conf.TCname.getText()+" has been picked by "+conf.TRname.getText()+" at "+ date.toString());  
				   	 String fy="select * from cargo_description where  Serial_Number='"+conf.Tsearch.getText()+"'";		  
				    ResultSet Su=ju1.executeQuery(fy);					   			  
				    while(Su.next()==true){
				   	 	 int y=100+(int) (Math.random()*1000000); 
				   	 	 int val1 = ju.executeUpdate("update  ozekimessageout  set msg='haloo "+conf.Tname.getText()+ " , "+conf.TRname.getText()+" has received  "+conf.TCname.getText()+" that you sent him  at "+date.toString()+"',  status='send' where receiver= '"+conf.TSphone.getText()+"' "); 			   
				   }
				  
				   }
				   
				   }catch(SQLException g)
				   {
					   g.printStackTrace();
				   }
			   } 
				   else
				   {
				   	
         try{
    	URL url=CardLayouty.class.getResource("/Windows Background.wav");
    		AudioInputStream audioIn=AudioSystem.getAudioInputStream(url);
    		Clip clip=AudioSystem.getClip();
    		clip.open(audioIn);
    		clip.start(); 
    		clip.getControls();  		
    
    	}catch(Exception h)
    	{
    		h.printStackTrace();
    	}	  	    
					   conf.msg1.setText("search query empty please enter your query");
				   }
			   }
			   
		   });
		   
	   panel2.setLayout(new BorderLayout());	  
	   JLabel label10=new JLabel("                    ((LIVE)) TEN MOST RECENT TRANSACTIONS COMPLETED(cargo picked by receiver)");
	   j.msg1.setText("");
	   label10.setFont(new Font("Gabriola", 2, 20));
		  label10.setForeground(Color.MAGENTA);
		  label10.setBounds(new Rectangle(200,30,300,40));
		  panel2.add(label10, BorderLayout.NORTH);
		  panel2.add(n,BorderLayout.SOUTH); 
		  JLabel labos=new JLabel(""); 
	   labos.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	     panel2.add(labos,BorderLayout.SOUTH);
	   final JavaLesson36 frame=new JavaLesson36();
	   Connection conn=null;
	   ResultSet rows=frame.rows;
	   next.setText("add cargo".toUpperCase());
	   final DefaultTableModel dTableModel =frame.dTableModel;
	   final JTable table=new JTable(dTableModel);
	   try{
	   	Class.forName("com.mysql.jdbc.Driver");//loading the driver
	   	conn=DriverManager.getConnection("jdbc:mysql://localhost/cargo2","root","");
	   	 Statement sqlState=conn.createStatement();   
	   	selectStuff="select * from cargo_description where picked='picked' order by Time_Received desc limit 10";    
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
	   catch(ClassNotFoundException ex)
	   {
	   	System.out.println(ex.getMessage());
	   }
	   
	   table.setRowHeight(table.getRowHeight()+15);
	   table.setLayout(new BorderLayout());
	   table.setBackground(Color.PINK);
	   table.setEnabled(false);
	   table.setToolTipText("list of recent successfull transactions");
	   table.setAutoCreateColumnsFromModel(true);
	   table.setFont(new Font("serif",Font.PLAIN, 14));	   
	   table.setAutoCreateRowSorter(true);
	   table.setUpdateSelectionOnSort(true);
	   table.setGridColor(Color.blue);
	   table.firePropertyChange(selectStuff, isVisible(), true);
	   table.setCursor(null);
	   table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	   TableColumn col1= table.getColumnModel().getColumn(0);
	   col1.setResizable(true);
	   frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
	   frame.setLocationRelativeTo(null);
	   frame.pack();	   panel2.add(table);
		
	//==============-----------=====================
	   //login page
	   //==========------------=======================
	
	   //end of login code 

	  //=====================---------------=======================
	  //add user panel
	 //------------------------------================-----------------
	    panel3.setLayout(null);
	    panel3.add(but3);
	  	   first.setVisible(false);
		  JLabel label=new JLabel("");
		 label.setIcon(new ImageIcon(getClass().getResource("/add_user.png"))); 
		  label.setBounds(new Rectangle(200,0,400,90));
		 // label.setText(l);
		 
	      panel3.add(label);
	     final user us =new user();
	     JLabel labot =new JLabel(""); 
	   labot.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	   	panel3.add(labot);
	   	labot.setBounds(new Rectangle(0,370,700,100));
		panel3.add(us.but); 
	    panel3.add(us.password); panel3.add(us.Tpassword); panel3.add(us.username);
		panel3.add(us.Tusername); panel3.add(us.email); panel3.add(us.Temail); panel3.add(us.phone);
		panel3.add(us.Tphone); panel3.add(us.place); panel3.add(us.Tplace); panel3.add(us.name); panel3.add(us.msg1);
		panel3.add(us.Ttype); panel3.add(us.type);  panel3.add(us.box);
		us.Ttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select category","admin","user" }));
		//mysql connection
		us.but.addActionListener(new  ActionListener(){

				@Override
		public void actionPerformed(ActionEvent arg0) {
			 String m=us.Temail.getText();	
						String s1=null,t1=null;
	                	login l1 =new login();
	                	Connection	user=l1.getConnection();
	                		try{
	             	Statement uss = user.createStatement();	
	             		Object codes=us.box.getSelectedItem();
		         	String js= ((String) codes).concat(us.Tphone.getText());
	             		String h="select *from user where email='"+us.Temail.getText()+"' or Username='"+us.Tusername.getText()+"' or PhoneNumber='"+js+"' ";
	             		ResultSet rt=uss.executeQuery(h);	             	   
	             if(rt.next()==true)
	             {
	              us.msg1.setText("email, username or phone number might already be in use please try another");	
	             }	
	           		 
		       else if(  us.Tpassword.getText().length()==0 ||us.Tusername.getText().length()==0
				||	 us.Temail.getText().length()==0  || us.Tphone.getText().length()==0 ||us.Tplace.getText().length()==0 ||us.Tname.getText().length()==0 || us.Ttype.getSelectedItem().equals("select category") )			   
			  {			    	    	
			    us.msg1.setText("all fields are required");
			     }	
			 else if(us.Tpassword.getText().length()<6) {
				 us.msg1.setText("please choose a stronger password");
			 }
				else if(us.Tpassword.getText().equals(us.Tusername.getText()))
				 {
					us.msg1.setText(" password cannot be the same as username");
				 }
			 else if(!(m.contains("@")&& m.contains(".")))
						{
					us.msg1.setText("invalid email please re- enter your email address");
						}
				else
				{
		 int x=1+(int) (Math.random()*1000);
		    Object code=us.box.getSelectedItem();
			String j= ((String) code).concat(us.Tphone.getText());
	int val = uss.executeUpdate("INSERT into  user    VALUES('"+j+"','"+us.Tname.getText()+"','"+us.Temail.getText()+"','"+us.Tplace.getText()+"','"+us.Tusername.getText()+"','"+us.Tpassword.getText()+"','"+us.Ttype.getSelectedItem()+"','"+x+"')");
	us.msg1.setText(us.Tname.getText()+" successfully added");	 
	 us.Tpassword.setText("");
	 us.Temail.setText("");
	 us.Tname.setText("");
	 us.Tusername.setText("");
	 us.Tphone.setText("");
	 us.Tplace.setText("");
		}}catch(SQLException r)
		{
			us.msg1.setText("data entry error!!");
			System.out.println(r);
		}}});
	// end
		panel3.add(us.Tname);		
		
		//=================-============================
		//modify user section
      //=======================--------------===========

	 panel4.setLayout(null);
	 first.setVisible(false);
	final Modify modify=new Modify();
	panel4.add(modify.but); panel4.add(modify.school);panel4.add(modify.Tschool);panel4.add(modify.date);
	panel4.add(modify.Tdate); panel4.add(modify.country); panel4.add(modify.Tcountry); panel4.add(modify.nationality);
	panel4.add(modify.Tnationality); panel4.add(modify.email); panel4.add(modify.Temail); panel4.add(modify.phone);
	panel4.add(modify.Tphone); panel4.add(modify.place); panel4.add(modify.Tplace); panel4.add(modify.name); panel4.add(modify.msg1);
    panel4.add(modify.Tname); panel4.add(modify.search); panel4.add(modify.but1);  panel4.add(modify.but2);  
    modify.Tschool.setEditable(false);
    JLabel label2=new JLabel("");
	   label2.setIcon(new ImageIcon(getClass().getResource("/modify_user.png"))); 
	  label2.setBounds(new Rectangle(200,0,300,40));
	  panel4.add(label2); 
	  JLabel labom =new JLabel(""); 
	  labom.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	  panel4.add(labom);
	  labom.setBounds(new Rectangle(0,370,700,100));
	  	//work
	  modify.but2.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent f)
		 { String	r=null,s=null,t=null,u=null,v=null,w=null,x=null,y=null;
		 	  login l1 =new login();
				Connection	jo1=l1.getConnection();
				try{
				Statement st1 = jo1.createStatement();					
				ResultSet res = st1.executeQuery("SELECT * FROM  user where email='"+modify.search.getText()+"'");
								
				if (res.next()==true) {
					modify.msg1.setText("");
				modify.msg1.setText("");	
				r= res.getString("email");
				s= res.getString("Full_Names");
				t = res.getString("residence");
			    u = res.getString("phoneNumber");
				v = res.getString("username");
				 w = res.getString("password");
				 String Sn= w.toString();
				 x = res.getString("type");
				 y = res.getString("EmpNo");
				    modify.Tname.setText(s); modify.Temail.setText(r);  modify.Tplace.setText(t);
					 modify.Tphone.setText(u); modify.Tnationality.setText(v); modify.Tschool.setText(Sn); 
					 modify.Tcountry.setText(y);
					 modify.Tname.setEditable(true); modify.Temail.setEditable(true);  modify.Tplace.setEditable(true);
					 modify.Tphone.setEditable(true); modify.Tnationality.setEditable(true); modify.Tschool.setEditable(false); 
					 modify.Tcountry.setEditable(false); modify.Tdate.setEnabled(true);
					String m;
					if(x.equals("admin"))
					{
						m="user";
					}	
					else
					{
						 m="admin";
					}
					
					modify.Tdate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { x,m,"none"}));			
				
		 }
				else	if(res.next()==false)
		{
		    modify.msg1.setText("no results found");
		   modify.Tname.setText(""); modify.Tname.setEditable(false); modify.Temail.setEditable(false);  modify.Temail.setText("");modify.Temail.setEditable(false);  modify.Tplace.setText("");
		   modify.Tplace.setEditable(false);modify.Tphone.setEditable(false); modify.Tnationality.setEditable(false);
		   modify.Tphone.setText(""); modify.Tnationality.setText(""); modify.Tschool.setText(""); modify.Tschool.setEditable(false);
			 modify.Tcountry.setText("");  modify.Tcountry.setEditable(false);  modify.Tdate.setSelectedItem("none");  modify.Tdate.setEnabled(false);		
		}
	
				
	}catch (SQLException e)
		 {
			 System.out.println(e);			 
		 }
		}
	  });
	  //end of cull search

	  //update user section
	  modify.but1.addActionListener(new ActionListener(){
	

		public void actionPerformed(ActionEvent a) {
		   	String s1=null,t1=null;
			login l1 =new login();
			Connection	jo1=l1.getConnection();
			try{
			Statement st1 = jo1.createStatement();
		   String k="select * from user   where email='"+modify.search.getText()+"' ";
				ResultSet res1=st1.executeQuery(k);
				while(res1.next()==true){							
		    String a4=res1.getString("email");
		    String b=res1.getString("PhoneNumber");
		    String c=res1.getString("Full_Names");
		    String d=res1.getString("Residence");
		    String e=res1.getString("Username");
		    String f=res1.getString("type");
		    String g=res1.getString("EmpNo");
		        if (a4.equals(modify.Temail.getText()) && b.equals(modify.Tphone.getText()) && c.equals(modify.Tname.getText()) && d.equals(modify.Tplace.getText()) && e.equals(modify.Tnationality.getText()) &&f.equals(modify.Tdate.getSelectedItem()) && g.equals(modify.Tcountry.getText()))
		                   {
		                     modify.msg1.setText(" no changes detected therefore "+modify.Tname.getText()+  "'s account not changed");	
		                   }
				     
		   else  if(modify.Tschool.getText().length()==0  || modify.Tcountry.getText().length()==0 ||modify.Tnationality.getText().length()==0
						||	 modify.Temail.getText().length()==0  || modify.Tphone.getText().length()==0 ||modify.Tplace.getText().length()==0 ||modify.Tname.getText().length()==0 )			   
				    	 {			    	    	
                              modify.msg1.setText("all fields are required");
					     }
			 else{
		   
	      	int val = st1.executeUpdate("update user  set  Full_Names='"+modify.Tname.getText()+"',password='"+modify.Tschool.getText()+"',phoneNumber='"+modify.Tphone.getText()+"' ,Residence='"+modify.Tplace.getText()+"',EmpNo='"+modify.Tcountry.getText()+"' ,username='"+modify.Tnationality.getText()+"' ,email='"+modify.Temail.getText()+"' ,type='"+modify.Tdate.getSelectedItem()+"'     where email='"+modify.search.getText()+"' ");
		      modify.msg1.setText(modify.Tname.getText()+" successfully updated");
		      	System.out.println(val);
				}	
				}}
				
			catch(SQLException r)
			{
				us.msg1.setText("data entry error!!");	
				System.out.println(r);
		}}});
	  //end of delete
	  //delete
	  modify.but.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent arg0) {
			 if(modify.Tschool.getText().length()==0 || modify.Tdate.getSelectedItem().equals("select category") || modify.Tcountry.getText().length()==0 ||modify.Tnationality.getText().length()==0
						||	 modify.Temail.getText().length()==0  || modify.Tphone.getText().length()==0 ||modify.Tplace.getText().length()==0 ||modify.Tname.getText().length()==0 )			   
					 {			    	    	
modify.msg1.setText("all fields are required");
					 }
			 else{
			login l1 =new login();
			@SuppressWarnings("static-access")
			Connection	jo1=l1.getConnection();
			
			try{
			Statement st1 = jo1.createStatement();
				     
	      	int val = st1.executeUpdate("delete from user where email='"+modify.search.getText()+"' ");
		      modify.msg1.setText(modify.Tname.getText()+" successfully deleted".toUpperCase());
		     
			
		}catch(SQLException v)
		{
			
		}}}	});
	  panel6.setLayout(new BorderLayout());	  
	   JLabel label101=new JLabel("                    ((LIVE)) TEN MOST RECENT ACTIVE  USERS FROM VARIOUS CENTERS");
	   j.msg1.setText("");
	   label101.setFont(new Font("Gabriola", 2, 20));
		  label101.setForeground(Color.MAGENTA);
		  label101.setBounds(new Rectangle(200,30,300,40));
		  panel6.add(label101, BorderLayout.NORTH);
		  panel6.add(k,BorderLayout.SOUTH); 
		 JLabel laboy=new JLabel(""); 
	   laboy.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	     panel6.add(laboy,BorderLayout.SOUTH);
	   final JavaLesson36 frame1=new JavaLesson36();
	   Connection conn1=null;
	   ResultSet rows1=frame1.rows;
	   final DefaultTableModel dTableModel1 =frame1.dTableModel;
	   final JTable table1=new JTable(dTableModel1);
	   try{
	   	Class.forName("com.mysql.jdbc.Driver");//loading the driver
	   	conn1=DriverManager.getConnection("jdbc:mysql://localhost/cargo2","root","");
	   	 Statement sqlState=conn1.createStatement();   
	   	selectStuff1="select * from user  limit 10";    
	   	rows1=sqlState.executeQuery(selectStuff1);	
	   Object[] tempRow;
	   Object[] tempRow1;
	    
	 	tempRow1=new Object[] {"PHONE NUMBER","NAME OF USER","EMAIL","MODE  NAME", "EMPLOYEE NO."};
	   	dTableModel1.addRow(tempRow1);
	   while(rows1.next())
	   {
	   	tempRow=new Object[] {rows1.getString(1),rows1.getString(2),rows1.getString(3),rows1.getString(7), rows1.getString(8)};
	   	dTableModel1.addRow(tempRow);
	    }
	    }
		
	   catch(SQLException ex)
	   {
	   	System.out.println(ex.getMessage()+" first");
	   }
	   catch(ClassNotFoundException ex)
	   {
	   	System.out.println(ex.getMessage()+" second");
	   }
	   
	   table1.setRowHeight(table1.getRowHeight()+15);
	   table1.setLayout(new BorderLayout());
	   table1.setBackground(Color.CYAN);
	   table1.setEnabled(false);	   
	   table1.setAutoCreateColumnsFromModel(true);
	   table1.setFont(new Font("serif",Font.PLAIN, 14));	   
	   table1.setAutoCreateRowSorter(true);
	   JTableHeader header1 = table1.getTableHeader();
	   header1.setBackground(Color.yellow);
	   
	   table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	   TableColumn col11= table1.getColumnModel().getColumn(0);
	   col11.setResizable(true);
	   JScrollPane scrollPanel1= new JScrollPane(table1);
	   frame1.add(scrollPanel1);
	   frame1.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
	   frame1.setLocationRelativeTo(null);
	   frame1.pack();	   panel6.add(table1);
	 
   
         
		panel8.setLayout(null);
	     final recover rev =new recover();
		panel8.add(rev.but); panel8.add(rev.date); panel8.add(rev.Tname);
		panel8.add(rev.Tdate);panel8.add(rev.username);panel8.add(rev.Tusername); panel8.add(rev.email); panel8.add(rev.Temail);
		panel8.add(rev.phone);panel8.add(rev.Tphone);panel8.add(rev.place); panel8.add(rev.Tplace); panel8.add(rev.name); 
		panel8.add(rev.msg1);	panel8.add(rev.Ttype); panel8.add(rev.type); panel8.add(rev.label); panel8.add(rev.box);
		rev.Ttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select category","admin","user" }));
		//mysql connection	 
		back.setVisible(true);
	   JLabel labor =new JLabel(""); 
	     rev.label.setIcon(new ImageIcon(getClass().getResource("/recover.png"))); 
	     labor.setIcon(new ImageIcon(getClass().getResource("/footer.png"))); 
	     panel8.add(labor);
	     labor.setBounds(new Rectangle(0,370,700,100));
	  	rev.but.addActionListener(new ActionListener(){
          login jui=new login();
          Connection m=jui.getConnection();
			public void actionPerformed(ActionEvent arg0) {
				try{
					Statement hj=m.createStatement();
					   Object code=rev.box.getSelectedItem();
						String j= ((String) code).concat(rev.Tphone.getText());
					String k="select * from user where PhoneNumber='"+j+"' and email='"+rev.Temail.getText()+"' and Username='"+rev.Tusername.getText()+"' and type='"+rev.Ttype.getSelectedItem()+"'  and Residence='"+rev.Tplace.getText()+"' and  Full_Names='"+rev.Tname.getText()+"' and  EmpNo='"+rev.Tdate.getText()+"'                                             ";
					ResultSet yu=hj.executeQuery(k);
					if(yu.next()==true)
					{
						rev.msg1.setText("dear user your password reset is being processed you will be shortly be contacted");
						// int u=1+(int) (Math.random()*1000);
						 int z=1000+(int) (Math.random()*100000);
						//String y="insert into recover values( '"+u+"', '"+rev.Temail.getText()+"','"+rev.Tusername.getText()+"','0' )";
						//int yu1=hj.executeUpdate(y);
						 String h="update user set password='"+z+"' where email='"+rev.Temail.getText()+"'";
						 int w=hj.executeUpdate(h);
						 try{
						String m="update ozekimessageout set msg='your requested password is "+z+" and your username is "+rev.Tusername.getText()+"', status='send', senttime=now()  where receiver='"+j+"'";
						int m3=hj.executeUpdate(m);
						 }
						 catch(SQLException g)
						 {
							 g.printStackTrace();
						 }
					}
					else{
					rev.msg1.setText("dear user your credentials are invalid please try again");
					}
			        	}catch(SQLException j)
			        	{
					System.out.println(j);
				         }
				
			}});
		
	  //control section
	  sPanel.add(previous);
	   sPanel.add(first);	       
	   sPanel.add(next);	
	   sPanel.add(logout);
       sPanel.add(back);
	   cards =new CardLayout();
	   cardPanel.setLayout(cards);
	   panel1.setName("login_page");
	   cardPanel.add(panel1,"First");
	   panel2.setName("all_users");
	   cardPanel.add(panel2,"Second");
	   panel5.setName("add_cargo");
	   cardPanel.add(panel5,"fifth");
	   cardPanel.add(panel7,"seventh");
	   panel7.setName("confirm_cargo");
	   cardPanel.add(panel6,"sixth");
	   panel6.setName("password");
	   panel3.setName("add_user");
	   cardPanel.add(panel3,"Third");
	   panel4.setName("modify_user");
	   cardPanel.add(panel4,"Fourth");
	   panel8.setName("forgot_password");
	   cardPanel.add(panel8,"Eigth");
	   c.add(cardPanel);
	   c.add(sPanel,BorderLayout.SOUTH);
	   setSize(450,200);
	   show(); 
	     
   }
   public  void actionPerformed(ActionEvent e)
   {
	   if(e.getSource()==but1)
	   {
		   cards.next(cardPanel);    
	   }
	   else if(e.getSource()==logout)
	   {
		   cards.first(cardPanel);		   
	   }
	   else if(e.getSource()==back)
	   {
		   cards.first(cardPanel);		   
	   }
	   else if(e.getSource()==but2)
	   {
		   cards.next(cardPanel);		   
	   }
	   else if(e.getSource()==but3)
	   {
		   cards.first(cardPanel);
	   }
	   else if(e.getSource()==but2)
	   {
		   cards.next(cardPanel);
	   }
	   else if(e.getSource()==first)
	   {
		   cards.first(cardPanel);
	   }
	   else if(e.getSource()==next)
	   {
		   cards.next(cardPanel);
	   }
	   else if(e.getSource()==previous)
	   {
		   cards.previous(cardPanel);
	   }	
	   if(panel1.isVisible())
	   {
			next.setVisible(false);
			logout.setVisible(false);
			previous.setVisible(false);

	   }
	   //add cargo privilege house keeping
	if(panel5.isVisible())
	{    
		if(privilege.equals("admin")){
		logout.setVisible(false);
		next.setText("confirm cargo");
		next.setEnabled(true);
		previous.setEnabled(true);
		}
		 if(privilege.equals("user"))
		   { logout.setVisible(false);
			next.setText("confirm cargo");
			next.setEnabled(true);
			previous.setEnabled(true);
			}
	}
	if(panel2.isVisible())
	{   
		if(privilege.equals("admin"))
		{ logout.setVisible(false);
			next.setEnabled(true);
			logout.setVisible(false);
			next.setText("add cargo");
			previous.setEnabled(false);
		}
		if(privilege.equals("user"))
		{ logout.setVisible(false);
		next.setText("add cargo");
		logout.setVisible(false);	
		previous.setEnabled(false);
		}
	}
	if(panel7.isVisible())
	{  if(privilege.equals("admin"))
	{  logout.setVisible(false);
		next.setText("view all users");
		next.setEnabled(true);
		previous.setEnabled(true);

	}
	 if(privilege.equals("user"))
	{  logout.setVisible(false);
		next.setText("end");
		next.setEnabled(false);
		previous.setEnabled(true);
	}
	}
	if(panel6.isVisible())
	{  if(privilege.equals("admin"))
	{  logout.setVisible(false);
		next.setText("add user");
		next.setEnabled(true);
		previous.setEnabled(true);;
	}
	  if(privilege.equals("user"))
	  	{  logout.setVisible(true);
			next.setText("add user");
			next.setEnabled(false);
			previous.setEnabled(true);
			
		}
	}
	//add user panel
	if(panel3.isVisible())
	{
		if(privilege.equals("admin"))
		{
		logout.setVisible(false);
		next.setText("modify user");
		next.setEnabled(true);
		previous.setEnabled(true);
		}
		if(privilege.equals("user"))
		{  
			panel3.setVisible(false);
		}
		}

	if(panel4.isVisible())
	{
		if(privilege.equals("admin")){
		next.setText("end");
		next.setEnabled(false);
		logout.setVisible(true);
		previous.setEnabled(true);
		}
		if(privilege.equals("user")){
			panel4.setVisible(false);
		}
		}
	} 
	//main menu
	   public static void main (String [] args)
	   {   
	   	   SplashScreen h = new SplashScreen();
	
		   CardLayouty cd=new CardLayouty();
		   cd.setSize(700, 520);
		   cd.setLocationRelativeTo(null);
		   cd.setResizable(false);
		   cd.addWindowListener(new WindowAdapter()
		   {
			   
		   public void windowClosing(WindowEvent e)
		   {
			   System.exit(0);		   }
				   
		   } );		  
	   }   
}
