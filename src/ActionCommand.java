import java.awt.event.*;
import javax.swing.*;

import java.awt.*;
public class ActionCommand  extends JFrame{
private JTextField ken;
private JLabel ken1;
String y ="search item: ".toUpperCase();
public ActionCommand() {
	JPanel p = new JPanel();
ken = new JTextField("press enter",12);

ken1 = new JLabel(y);
ken1.setBackground(Color.red);
    	p.add(ken);	
    	JPanel p1 = new JPanel();
    	p1.add(ken1);	
    add(p1, BorderLayout.CENTER);
    add(p, BorderLayout.NORTH);
   action h = new action();
   ken.addActionListener(h);		  
}  
private class action implements ActionListener
{
	public void actionPerformed(ActionEvent u) 
	{
   String h=y+u.getActionCommand();
   if(u.getActionCommand().equals("press enter"))
   {
   	ken1.setText("please enter search option".toUpperCase());
ken1.setFont(new Font("Gabriola",1,17));
   	ken1.setForeground(Color.RED);
   }
   else{
	 ken1.setText(h);
	 
	 JOptionPane.showMessageDialog(null,u.getActionCommand(),"josiahs",JOptionPane.PLAIN_MESSAGE);
	}}

}
public static void main(String args [])
{
ActionCommand g= new 	ActionCommand();
g.setVisible(true);
g.setSize(300,400);
g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
g.setLocationRelativeTo(null);
}
}
