package cargos;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class jj  extends JFrame{
	public jj(){
	JComboBox box= new JComboBox();
		box.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"+254","+253","+252","+251","+250",
				"+249","+248","+247","+246","+245","+244"+"+243","+243","+242","+241","+240",				
				"+239","+238","+237","+236","+235","+234","+233","+232","+231","+230",
				"+229","+228","+227","+226","+225","+224","+223","+222","+221","+220",
				"+219","+218","+217","+216","+215","+214","+213","+212","+211","+210",
				"+81","+70","+44","+89","+33","+90","+32","+90","+56","+78"}));
	add(box);}
	
public static void main(String [] args)
{
	String m="jm_122@live.com";
	if(!m.contains("@")&& m.contains("."))
			{
		System.out.println("email not good");
			}
	else
	{
		System.out.println("email  good");
	}
	jj h=new jj();
	h.setVisible(true);
	h.pack();
	h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
