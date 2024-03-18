// Q2 Write a program to find primary IP address of the host name which you passed as a parameter

import java.io.*; 
import java.util.*; 
import java.net.*;
 
class PrimaryIP { 
	public static void main(String[] args) 
	{ 
		try { 
			InetAddress ip = InetAddress.getByName("www.google.com"); 
			System.out.println("Host Name: " +ip.getHostName());
			System.out.println("IP Address: " +ip.getHostAddress());
		    }  
		catch (UnknownHostException e) { 
			System.out.println(e); 
		} 
	} 
}

