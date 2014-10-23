package cargos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.font.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class JavaLesson36 extends JFrame {
	static Object [] []databaseInfo;
	static Object[] columns={"team_name","team_id","sponsor","number of players","year created "};
	static ResultSet rows;
	static ResultSetMetaData metadata;
	DefaultTableModel dTableModel =new DefaultTableModel(databaseInfo,columns)
	{
		public Class getColumnClass(int column)
				{
			Class returnValue;
			if((column>=0)&&(column<getColumnCount())){
				returnValue=getValueAt(0,column).getClass();
			}
			else
			{
				returnValue=Object.class;
			}
			return returnValue;
	}};


}