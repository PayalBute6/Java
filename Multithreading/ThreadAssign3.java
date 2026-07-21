/*3. Write a program that create 2 threads – each displaying a message (Pass the message as a parameter to the constructor). The threads should display the messages continuously till the user presses ctrl-c. Also display the thread information as it is running. 
*/

import java.io.*;
class ThreadAssign extends Thread
{
 String msg="";
 ThreadAssign(String msg)
 {
  this.msg=msg;
 }
 public void run()
 {
  try
  { 
while(true)
   {
    System.out.println(msg);
    Thread.sleep(200);
   }
  }
  catch(Exception e){}
 }
}
public class ThreadAssign3
{
 public static void main(String a[])
 {
  ThreadAssign t1=new ThreadAssign("Hello............"); 
  t1.start();
 }
}
