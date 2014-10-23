package cargos;
import java.sql.*;
public class login {
	private static String url ="jdbc:mysql://localhost/cargo2";
	private  static String driverName="com.mysql.jdbc.Driver";
	private static String username="root";
	private static String password="";
	private static Connection con;
	
	//private static String url;
	public static Connection getConnection()
	{
	try{
		Class.forName(driverName);
		con=DriverManager.getConnection(url,username,password);
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return con;
	}

}