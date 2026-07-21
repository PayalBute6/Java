import java.io.*;
import java.net.*;
class DateClient
{
    public static void main(String args[]) throws Exception
    {
    try
    {
        Socket soc=new Socket("localhost",6666);        
        BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(br.readLine());
    }    
    catch(Exception e){
    	System.out.println("Error");
}
}
}

