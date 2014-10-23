package deliver;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
public class Sound extends JFrame{
    public Sound() {
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("Sound clip test");
    	this.setVisible(true);
    	this.setSize(300,300);
    	try{
    		URL url=Sound.class.getResource("/error.wav");
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
    	public static  void main(String [] args)
    	{
    		new Sound();
    	}
}