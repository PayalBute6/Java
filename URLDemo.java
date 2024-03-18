import java.io.*;
import java.net.*;

public class URLDemo{

	public static void main(String args[]){
		try{
		URL url=new URL("https://www facebook.com/profile");
		
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Host name: "+url.getHost());
		System.out.println("Port number: "+url.getPort());
		System.out.println("File name: "+url.getFile());
		}
		catch(Exception e){
			System.out.println("Error"+e);
			}
		}
	}
