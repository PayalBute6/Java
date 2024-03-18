// Q2 Write a multithreading program using Runnable interface to blink Text on the frame.
import java.awt.*;
import java.awt.event.*;
public class BlinkText extends Frame implements Runnable
{
            private boolean flag;
            public BlinkText()
           	{
            	setTitle("Blink");
			setSize(500,300);
			setLocation(100,100);
			setVisible(true);
			Thread t = new Thread(this);
			t.start();
		}
		public void paint(Graphics g)
		{
			super.paint(g);
			g.setColor(flag?Color.WHITE:Color.BLACK);
			g.drawString("Welcome to MITACSC",50,150);
		}
            public void run()
		{
			while(true)
			{
				try
				{
				Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					//System.out println("Error");
				}
				flag=!flag;
				repaint();
			}
		}
            public static void main(String args[])
            {
                        new BlinkText();
            }
}

