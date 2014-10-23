package cargos;
//doing multiple things at the same time
import java.util.*;
//runnable contains run method
public class Threads implements Runnable {
static String name;
int time, time1;
Random r=new Random();
public Threads (String x)
{
	name=x; 
	time=r.nextInt(1000);
	time1=r.nextInt(10000);
}
public void run()
{
try{	  
		System.out.printf("%s is sleeping for %d \n", name, time);
		Thread.sleep(time);
		System.out.printf("%s is done\n", name) ;
		System.out.println(34*45);
		Thread.sleep(time1);
	}catch(Exception e){}
}
public static void main(String [] args)
{
	Thread t1=new Thread(new Threads("one"));
	Thread t2=new Thread(new Threads("two"));
	Thread t3=new Thread(new Threads("three"));
	Thread t4=new Thread(new Threads("four"));
 
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
