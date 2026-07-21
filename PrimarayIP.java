// Java program to obtain IP Address 
// from a given host 

import java.io.*; 
import java.util.*; 
import java.net.*;
 
class PrimarayIP { 
	public static void main(String[] args) 
	{ 
		try { 
			InetAddress ip = InetAddress.getByName("www.google.com"); 
			System.out.println("Host Name:"+getHostName());
			System.out.println("IP Address:"getHostAddress());
			} 
		} 
		catch (UnknownHostException e) { 
			System.out.println(e); 
		} 
	} 
}

